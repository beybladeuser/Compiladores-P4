package alg;

import Symbols.FunctionSymbol;
import Symbols.Scope;
import Symbols.Symbol;
import Symbols.Type;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.BufferedWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CodeGen extends algBaseVisitor<Symbol>{

    private int tmpCounter = 0;
    private int labelCounter = 0;
    private BufferedWriter out;
    private Scope globalScope;
    public List<String> code;
    private Stack<String> whileAfterLabels;
    private Stack<String> whileBeforeLabels;

    public ParseTreeProperty<Scope> scopes;

    public CodeGen(ParseTreeProperty<Scope> scopes)
    {
        this.scopes = scopes;
        code = new ArrayList<String>();
        this.whileAfterLabels = new Stack<>();
        this.whileBeforeLabels = new Stack<>();
    }

    private Symbol widen(ParserRuleContext ctx, Symbol addr, Type down, Type up)
    {
        //se são do mesmo tipo não há cast a fazer
        if(down.equals(up)) return addr;
        else if(Type.isConvertibleTo(down,up))
        {
            Symbol t = temp(ctx,up);
            emit(t.name + " = (" + up + ") " + addr.name );
            return t;
        }
        return null;
    }

    private int emit(String s)
    {
        this.code.add(s);
        return this.code.size()-1;
    }

    private void replace(int line, String s)
    {
        this.code.set(line,s);
    }

    private Symbol temp(ParserRuleContext ctx, Type t)
    {
        return this.scopes.get(ctx).defineTemp(t);
    }

    private String label()
    {
        return "_L" + this.labelCounter++;
    }

    private String label(String name)
    {
        return "_L" + name + this.labelCounter++;
    }

    //start : decl+ EOF;
    public Symbol visitAlg_file(alg.Alg_fileContext ctx)
    {
        //initialize the Global scope
        this.globalScope = this.scopes.get(ctx);
        visitChildren(ctx);
        //only expressions need to return a proper symbol
        return null;
    }

    //simple expressions
    //simple_exp --> LINT;
    public Symbol visitInt(alg.IntContext ctx)
    {
        Symbol s = new Symbol(new Type(Type.PType.INT),ctx.getText(), ctx.getText());
        //literal constants can be stored as constants in the global scope, indexed by their value
        this.globalScope.define(s);
        //we need to resolve, because it might be the case that the same constant was already declared, and in this case
        //we return the previously created symbol instead of a new one
        return globalScope.resolve(s.name);
    }

    //simple_exp --> LITERAL_R
    public Symbol visitReal(alg.RealContext ctx)
    {
        Symbol s = new Symbol(new Type(Type.PType.FLOAT),ctx.getText(),ctx.getText());
        //literal constants can be stored as constants in the global scope, indexed by their value
        this.globalScope.define(s);
        //we need to resolve, because it might be the case that the same constant was already declared, and in this case
        //we return the previously created symbol instead of a new one
        return globalScope.resolve(s.name);
    }

    //simple_exp --> LITERAL_STRING
    public Symbol visitString(alg.StringContext ctx)
    {
        String strText = ctx.getText();
        //we need to remove the trailing "" and add the null character
        strText = strText.substring(1,strText.length()-1) + "\u0000";
        //Strings are special because they are a dynamic multi-byte type
        //however, the size of a string literal is well-known in compile-time, so in this particular case
        // we can properly calculate its size
        Symbol s = new Symbol(new Type(Type.PType.STRING),strText,strText);
        s.width = s.type.getWidth() * strText.length(); //we need one extra space for the end of string character \u0000
        //literal constants can be stored as constants in the global scope, indexed by their value
        s.isWidthKnown = true;
        this.globalScope.define(s);
        //we need to resolve, because it might be the case that the same constant was already declared, and in this case
        //we return the previously created symbol instead of a new one
        return globalScope.resolve(s.name);
    }

    //simple_exp --> Null
    public Symbol visitNull(alg.NullContext ctx)
    {
        //returns the special symbol null. This one doesn't even need to be stored in the symbol table
        return new Symbol(new Type(true, Type.PType.VOID),"null","null");
    }

    public Symbol visitBool_True(alg.Bool_TrueContext ctx)
    {
        Symbol s = new Symbol(new Type(Type.PType.BOOLEAN),ctx.getText(),ctx.getText());
        //literal constants can be stored as constants in the global scope, indexed by their value
        this.globalScope.define(s);
        //we need to resolve, because it might be the case that the same constant was already declared, and in this case
        //we return the previously created symbol instead of a new one
        return globalScope.resolve(s.name);
    }

    public Symbol visitBool_False(alg.Bool_FalseContext ctx)
    {
        Symbol s = new Symbol(new Type(Type.PType.BOOLEAN),ctx.getText(),ctx.getText());
        //literal constants can be stored as constants in the global scope, indexed by their value
        this.globalScope.define(s);
        //we need to resolve, because it might be the case that the same constant was already declared, and in this case
        //we return the previously created symbol instead of a new one
        return globalScope.resolve(s.name);
    }

    //simple_exp --> IDENT
    public Symbol visitVar(alg.VarContext ctx)
    {
        return this.scopes.get(ctx).resolve(ctx.IDENT().getText());
    }

    public Symbol visitSimple_expr(alg.Simple_exprContext ctx)
    {
        return visit(ctx.alg_simple_expression());
    }

    public Symbol visitParen(alg.ParenContext ctx)
    {
        return visit(ctx.alg_expression());
    }

    public Symbol visitUnary_Op(alg.Unary_OpContext ctx)
    {
        String op = "";
        int opType = ctx.start.getType();
        Symbol s1 = visit(ctx.alg_expression());
        //if it is a + we don't need to do anything
        if(opType==algLexer.PLUS_OP) return s1;
        if(opType==algLexer.MINUS_OP)
        {
            op = "-";
        }
        else if(opType == algLexer.NEGATION_OP)
        {
            op = "not";
        }

        Symbol t = this.temp(ctx,s1.type);
        emit(t.name + " = " + op + " " +  s1.name);
        return t;
    }

    public Symbol visitMultiplication(alg.MultiplicationContext ctx)
    {
        Symbol t1 = visit(ctx.alg_expression(0));
        Symbol t2 = visit(ctx.alg_expression(1));
        Type maxType = Type.getMaxType(t1.type,t2.type);
        t1 = widen(ctx,t1,t1.type,maxType);
        t2 = widen(ctx,t2,t2.type,maxType);
        String op = ctx.getChild(1).getText();

        Symbol t = this.temp(ctx,maxType);
        emit(t.name + " = " + t1.name + " " + op + " " + t2.name);
        return t;
    }

    public Symbol visitAddition(alg.AdditionContext ctx) {

        Symbol t1 = visit(ctx.alg_expression(0));
        Symbol t2 = visit(ctx.alg_expression(1));
        Type maxType = Type.getMaxType(t1.type,t2.type);
        t1 = widen(ctx,t1,t1.type,maxType);
        t2 = widen(ctx,t2,t2.type,maxType);
        String op = ctx.getChild(1).getText();

        Symbol t = this.temp(ctx,maxType);
        emit(t.name + " = " + t1.name + " " + op + " " + t2.name);
        return t;
    }

    public Symbol visitComparisson(alg.ComparissonContext ctx) {

        Symbol t1 = visit(ctx.alg_expression(0));
        Symbol t2 = visit(ctx.alg_expression(1));
        Type maxType = Type.getMaxType(t1.type,t2.type);
        t1 = widen(ctx,t1,t1.type,maxType);
        t2 = widen(ctx,t2,t2.type,maxType);
        String op = ctx.getChild(1).getText();
        Symbol t = this.temp(ctx,new Type(Type.PType.BOOLEAN));
        emit(t.name + " = " + t1.name + " " + op + " " + t2.name);
        return t;
    }

    public Symbol visitAnd_op(alg.And_opContext ctx)
    {
        Symbol t1 = visit(ctx.alg_expression(0));
        Symbol t2 = visit(ctx.alg_expression(1));
        Symbol t = this.temp(ctx,new Type(Type.PType.BOOLEAN));

        emit(t.name + "=" + t1.name + " and " + t2.name);
        return t;
    }

    public Symbol visitOr_op(alg.Or_opContext ctx)
    {
        Symbol t1 = visit(ctx.alg_expression(0));
        Symbol t2 = visit(ctx.alg_expression(1));
        Symbol t = this.temp(ctx,new Type(Type.PType.BOOLEAN));

        emit(t.name + "=" + t1.name + " or " + t2.name);
        return t;
    }

    //instructions
    //inst --> exp PVIR #ExpInst
    public Symbol visitExpInst(alg.ExpInstContext ctx)
    {
        //this is very easy, just visit the expression
        visit(ctx.alg_expression());
        //It is not mandatory to return any symbol in an instruction
        return null;
    }

    //Task T6
    //inst --> left_side EQUAL exp PVIR;
    public Symbol visitAssign(alg.AssignContext ctx)
    {
        return visit(ctx.alg_atrib());
    }

    public Symbol visitAlg_atrib(alg.Alg_atribContext ctx)
    {
        Symbol s1 = visit(ctx.lado_esquerdo());
        Symbol s2 = visit(ctx.alg_expression());
        emit(s1.name + " = " + s2.name);
        return null;
    }

    //T6
    //left_side --> IDENT
    public Symbol visitLado_esquerdo_ident(alg.Lado_esquerdo_identContext ctx)
    {
        return scopes.get(ctx).resolve(ctx.IDENT().getText());
    }

    public  Symbol visitLado_esquerdo_pointer_index(alg.Lado_esquerdo_pointer_indexContext ctx)
    {
        Symbol s1 = visit(ctx.alg_expression(0));
        Symbol s2 = visit(ctx.alg_expression(1));
        Symbol indexShift = temp(ctx, s2.type);
        emit(indexShift.name + " = " + s2.name + " * " + s1.width);
        return new Symbol(s1.type.extractValueType(), s1.name + "[" + indexShift.name + "]");
    }

    //inst --> IF exp THEN inst (ELSE inst)?   #If
    public Symbol visitIf(alg.IfContext ctx)
    {
        return visitAlg_instruction_cond(ctx.alg_instruction_cond());
    }

    public Symbol visitAlg_instruction_cond(alg.Alg_instruction_condContext ctx) {
        Symbol condition = visit(ctx.alg_expression());
        String falseLabel = label("false");
        emit("ifFalse " + condition.name + " goto " + falseLabel);
        visit(ctx.alg_instruction());

        if(ctx.alg_instruction_cond_next().getText() == "")
        {
            //Single if
            emit(falseLabel + ":");
        }
        else
        {
            String nextLabel = label("next");
            emit("goto " + nextLabel);
            emit(falseLabel + ":");
            visit(ctx.alg_instruction_cond_next().alg_instruction());
            emit(nextLabel + ":");
        }

        return null;
    }

    public Symbol visitReturn_control_instr(alg.Return_control_instrContext ctx)
    {
        if (ctx.alg_instruction_controle_next().getText() == "")
        {
            emit("return");
        }
        else
        {
            Symbol returnValue = visit(ctx.alg_instruction_controle_next().alg_expression());
            emit("return " + returnValue.name);
        }
        return null;
    }

}
