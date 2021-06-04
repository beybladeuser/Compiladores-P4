package alg;

import Symbols.FunctionSymbol;
import Symbols.Scope;
import Symbols.Symbol;
import Symbols.Type;
import org.antlr.v4.runtime.ParserRuleContext;
//import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.ArrayList;

public class TypeChecker extends algBaseListener{
//@Override |.*\*.*
	public Scope globalScope;
	public Scope currentScope;
	private FunctionSymbol currentFunction;
	public int semanticErrors;
	public boolean hasAlg;
	public boolean inCycle = false;

	private List<List<Type>> currentCallArgTypes = new ArrayList<>();

	public List<FunctionSymbol> functionScope;
	public List<Integer> lines;

	public ParseTreeProperty<Type> exprType = new ParseTreeProperty<>();
	public ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();

	public TypeChecker(List<FunctionSymbol> functionScope, List<Integer> lines) {
		super();
		this.functionScope = functionScope;
		this.lines = lines;
	}


	private boolean defineSymbol(ParserRuleContext ctx, Symbol s)
	{
		if(!this.currentScope.define(s))
		{
			Symbol declaredSymbol = this.currentScope.resolve(s.name);
			if (declaredSymbol instanceof FunctionSymbol)
				System.err.println("Line: " + ctx.start.getLine() +"; Redefining previously defined function " + s.name );
			else
				System.err.println("Line: " + ctx.start.getLine() +"; Redefining previously defined variable " + s.name );
			//validated = false;
			this.semanticErrors++;
			return false;
		}
		return true;
	}

	private boolean defineSymbolLine(Integer line, Symbol s)
	{
		if(!this.currentScope.define(s))
		{
			Symbol declaredSymbol = this.currentScope.resolve(s.name);
			if (declaredSymbol instanceof FunctionSymbol)
				System.err.println("Line: " + line +"; Redefining previously defined function " + s.name );
			else
				System.err.println("Line: " + line +"; Redefining previously defined variable " + s.name );
			//validated = false;
			this.semanticErrors++;
			return false;
		}
		return true;
	}

	public void exitEveryRule(ParserRuleContext ctx)
	{
		if(this.scopes.get(ctx)==null)
		{
			this.scopes.put(ctx,this.currentScope);
		}
	}
	
	public void enterAlg_file(alg.Alg_fileContext ctx) {
		this.globalScope = new Scope(null);
		this.currentScope = this.globalScope;
		scopes.put(ctx, currentScope);
		this.semanticErrors = 0;
		for (int i = 0 ; i < functionScope.size() ; i++){
			defineSymbolLine(lines.get(i), functionScope.get(i));
		}
	}

	public void exitAlg_file(alg.Alg_fileContext ctx) {
		//System.out.println("debug_global_scope--" + this.currentScope.toString());
		if (!hasAlg) {
			System.err.println("Alg file must have the alg function");
			//validated = false;
			this.semanticErrors++;
		}
	}


	public void exitAlg_simple_var_declaration(alg.Alg_simple_var_declarationContext ctx) {
		for (TerminalNode ident : ctx.IDENT())
		{
			defineSymbol(ctx,new Symbol(ctx.alg_type().getText(),ident.getText()));
		}
	}

	public void exitAlg_init_var_declaration(alg.Alg_init_var_declarationContext ctx) {
		Symbol s = new Symbol(ctx.alg_type().getText(),ctx.IDENT().getText());
		defineSymbol(ctx, s);
		if (ctx.children.get(3).getText().equals("[")){
			Type eType = exprType.get(ctx.alg_expression());
			if (!s.isPointerType()) {
				System.err.println("Line: " + ctx.IDENT().getSymbol().getLine() +"; Expected var " + s.name + " to be of pointer type");
				this.semanticErrors++;
			}
			if (!Symbol.isTypeConvertibleTo(eType, new Type(false, Type.PType.INT) )) {
				String expected = s.getTypeString() + " " + s.name + "= [INT]";
				String actual = s.getTypeString() + " " + s.name + "= [" + Symbol.typeToString(eType) + "]";
				System.err.println("Line: " + ctx.IDENT().getSymbol().getLine() +"; Expected " + expected + " but got " + actual );
				this.semanticErrors++;
			}
		}
		else {
			alg.Alg_expressionContext temp = ctx.alg_expression();
			Type eType = exprType.get(temp);
			if (!Symbol.isTypeConvertibleTo(eType, s.type)){
				System.err.println("Line: " + ctx.IDENT().getSymbol().getLine() + "; Initializing var " + s.name + " with expression of incompatible type " + Symbol.typeToString(eType));
				this.semanticErrors++;
			}
		}

	}


	public void exitInt(alg.IntContext ctx) {
		exprType.put(ctx, new Type(false, Type.PType.INT) );
	}

	public void exitNull(alg.NullContext ctx) {
		exprType.put(ctx, new Type(true, Type.PType.VOID) );
	}

	public void exitReal(alg.RealContext ctx) {
		exprType.put(ctx, new Type(false, Type.PType.FLOAT));
	}

	public void exitBool_True(alg.Bool_TrueContext ctx) {
		exprType.put(ctx, new Type(false, Type.PType.BOOLEAN));
	}

	public void exitBool_False(alg.Bool_FalseContext ctx) {
		exprType.put(ctx, new Type(false, Type.PType.BOOLEAN));
	}

	public void exitString(alg.StringContext ctx) {
		exprType.put(ctx, new Type(false, Type.PType.STRING));
	}

	public void exitVar(alg.VarContext ctx) {
		String varName = ctx.IDENT().getText();
		Symbol s = this.currentScope.resolve(varName);
		if(s == null)
		{
			System.err.println("Line: " + ctx.IDENT().getSymbol().getLine() + "; Undefined variable " + varName);
			this.semanticErrors++;
			exprType.put(ctx, new Type(false, Type.PType.ERROR));
			return;
		}
		if(s instanceof FunctionSymbol)
		{
			System.err.println("Line: " + ctx.IDENT().getSymbol().getLine() + "; Using function symbol " + varName + " as variable");
			this.semanticErrors++;
			exprType.put(ctx, new Type(false, Type.PType.ERROR));
			return;
		}

		exprType.put(ctx, s.type);
	}

	public void exitCall(alg.CallContext ctx) {
		exprType.put(ctx,exprType.get(ctx.alg_funtion_call()));
	}

	public void exitSimple_expr(alg.Simple_exprContext ctx) {
		exprType.put(ctx, exprType.get(ctx.children.get(0)));
	}

	public void exitParen(alg.ParenContext ctx) {
		exprType.put(ctx, exprType.get(ctx.children.get(1)));
	}

	public void exitParen_fail_1(alg.Paren_fail_1Context ctx) {
		exprType.put(ctx, new Type(false, Type.PType.ERROR));
	}

	public void exitParen_fail_2(alg.Paren_fail_2Context ctx) {
		exprType.put(ctx, new Type(false, Type.PType.ERROR));
	}

	public void exitAnd_op(alg.And_opContext ctx) {
		Type e1 = exprType.get(ctx.alg_expression(0));
		Type e2 = exprType.get(ctx.alg_expression(1));

		if (!Symbol.isTypeConvertibleTo(e1, new Type(false, Type.PType.BOOLEAN)) || !Symbol.isTypeConvertibleTo(e2, new Type(false, Type.PType.BOOLEAN))) {
			System.err.println("Line: " + ctx.getStart().getLine() + "; In expression " + ctx.getText() + " expected both left and right expressions to be a non empty pointers");
			this.semanticErrors++;
			exprType.put(ctx, new Type(false, Type.PType.ERROR));
			return;
		}
		exprType.put(ctx, new Type(false, Type.PType.BOOLEAN));
	}


	public void exitMultiplication(alg.MultiplicationContext ctx) {
		Type e1 = exprType.get(ctx.alg_expression(0));
		Type e2 = exprType.get(ctx.alg_expression(1));

		String operator = ctx.getChild(1).getText();

		verifyMultiplication(ctx, operator, e1, e2);
	}

	private boolean verifyMultiplication(ParserRuleContext ctx, String operator, Type e1, Type e2) {
		if (operator.equals("%")) {
			if (!Symbol.isTypeConvertibleTo(e1, new Type(false, Type.PType.INT)) || !Symbol.isTypeConvertibleTo(e2, new Type(false, Type.PType.INT))) {
				System.err.println("Line: " + ctx.getStart().getLine() + "; Expected remain operation between two ints");
				this.semanticErrors++;
				exprType.put(ctx, new Type(false, Type.PType.ERROR));
				return false;
			}
			this.exprType.put(ctx, e1);
			return true;
		}

		if (operator.equals("/") || operator.equals("*")) {
			//if neither is float or int
			if (!Symbol.isTypeConvertibleTo(e1, new Type(false, Type.PType.FLOAT)) || !Symbol.isTypeConvertibleTo(e2, new Type(false, Type.PType.FLOAT))) {
				System.err.println("Line: " + ctx.getStart().getLine() + "; Expected multiplication between two reals or ints");
				this.semanticErrors++;
				exprType.put(ctx, new Type(false, Type.PType.ERROR));
				return false;
			}

			if (e1.equals(e2)) {
				this.exprType.put(ctx, e1);
				return true;
			}
			if (!e1.equals(e2)) {
				exprType.put(ctx, new Type(false, Type.PType.FLOAT));
				return true;
			}
		}

		//this should never execute
		System.err.println("Line: " + ctx.getStart().getLine() + "; Unknown multiplication operator " + ctx.getChild(1).getText());
		exprType.put(ctx, new Type(false, Type.PType.ERROR));
		return false;
	}

	public void exitAddition(alg.AdditionContext ctx) {
		Type e1 = exprType.get(ctx.alg_expression(0));
		Type e2 = exprType.get(ctx.alg_expression(1));

		String operator = ctx.getChild(1).getText();

		verifyAddition(ctx, operator, e1, e2);
	}

	private boolean verifyAddition(ParserRuleContext ctx, String operator, Type e1, Type e2) {
		if (operator.equals("+") || operator.equals("-")) {
			//if simbols are non numeric
			if (!Symbol.isTypeConvertibleTo(e1, new Type(false, Type.PType.FLOAT)) || !Symbol.isTypeConvertibleTo(e2, new Type(false, Type.PType.FLOAT))) {
				//if is a pointer shift
				if (Symbol.isTypeNonEmptyPointer(e1)) {
					if (!Symbol.isTypeConvertibleTo(e2, new Type(false, Type.PType.INT))) {
						System.err.println("Line: " + ctx.getStart().getLine() + "; In expression " + ctx.getText() + " expected " + ctx.getChild(2).getText() + " to be of type int");
						this.semanticErrors++;
						exprType.put(ctx, new Type(false, Type.PType.ERROR));
						return false;
					}
					this.exprType.put(ctx, e1);
					return true;
				}
				System.err.println("Line: " + ctx.getStart().getLine() + "; In expression " + ctx.getText() + " expected " + ctx.getChild(0).getText() + " and " + ctx.getChild(0).getText() + " to be of type int/float or form a pointer shift");
				this.semanticErrors++;
				exprType.put(ctx, new Type(false, Type.PType.ERROR));
				return false;
			}

			if (e1.equals(e2)) {
				this.exprType.put(ctx, e1);
				return true;
			}
			if (!e1.equals(e2)) {
				exprType.put(ctx, new Type(false, Type.PType.FLOAT));
				return true;
			}
		}

		//this should never execute
		System.err.println("Line: " + ctx.getStart().getLine() + "; Unknown adition operator " + ctx.getChild(1).getText());
		exprType.put(ctx, new Type(false, Type.PType.ERROR));
		return false;
	}

	public void exitOr_op(alg.Or_opContext ctx) {
		Type e1 = exprType.get(ctx.alg_expression(0));
		Type e2 = exprType.get(ctx.alg_expression(1));

		if (!Symbol.isTypeConvertibleTo(e1, new Type(false, Type.PType.BOOLEAN)) || !Symbol.isTypeConvertibleTo(e2, new Type(false, Type.PType.BOOLEAN))) {
			System.err.println("Line: " + ctx.getStart().getLine() + "; In expression " + ctx.getText() + " expected both left and right expressions to be a non empty pointers");
			this.semanticErrors++;
			exprType.put(ctx, new Type(false, Type.PType.ERROR));
			return;
		}
		exprType.put(ctx, new Type(false, Type.PType.BOOLEAN));
	}


	public void exitPointer_Indexing(alg.Pointer_IndexingContext ctx) {
		Type e1 = exprType.get(ctx.alg_expression(0));
		Type e2 = exprType.get(ctx.alg_expression(1));

		if (!Symbol.isTypeNonEmptyPointer(e1) ){
			System.err.println("Line: " + ctx.LBRACKET().getSymbol().getLine() + "; In expression " + ctx.getText() + " expected " + ctx.alg_expression(0).getText() + " to be a non empty pointer");
			this.semanticErrors++;
			exprType.put(ctx, new Type(false, Type.PType.ERROR));
			return;
		}

		if (!Symbol.isTypeConvertibleTo(e2, new Type(false, Type.PType.INT))){
			System.err.println("Line: " + ctx.LBRACKET().getSymbol().getLine() + "; In expression " + ctx.getText() + " expected " + ctx.alg_expression(1).getText() + " to of type int");
			this.semanticErrors++;
			exprType.put(ctx, new Type(false, Type.PType.ERROR));
			return;
		}
		exprType.put(ctx, Symbol.getPrimitiveType(e1));
	}

	public void exitComparisson(alg.ComparissonContext ctx) {
		Type e1 = exprType.get(ctx.alg_expression(0));
		Type e2 = exprType.get(ctx.alg_expression(1));

		String operator = ctx.getChild(1).getText();

		verifyComparisson(ctx, operator, e1, e2);
	}

	private boolean verifyComparisson(ParserRuleContext ctx, String operator, Type e1, Type e2) {
		if (operator.equals("<") || operator.equals(">") || operator.equals("<=") || operator.equals(">=")) {
			if (!Symbol.isTypeConvertibleTo(e1, new Type(false, Type.PType.FLOAT)) || !Symbol.isTypeConvertibleTo(e2, new Type(false, Type.PType.FLOAT))) {
				System.err.println("Line: " + ctx.getStart().getLine() + "; Expected inequality comparison between two reals or ints");
				this.semanticErrors++;
				exprType.put(ctx, new Type(false, Type.PType.ERROR));
				return false;
			}
			exprType.put(ctx, new Type(false, Type.PType.BOOLEAN));
			return true;
		}

		if (operator.equals("==") || operator.equals("!=")) {
			if (Symbol.isTypePrimitive(e1) && Symbol.isTypePrimitive(e2) && !e1.equals(e2)) {
				System.err.println("Line: " + ctx.getStart().getLine() + "; Expected equality comparison between two expressions of equal primitive type");
				this.semanticErrors++;
				exprType.put(ctx, new Type(false, Type.PType.ERROR));
				return false;
			}

			if (Symbol.isTypePointer(e1) && Symbol.isTypePointer(e2)) {
				if (!Symbol.isTypeConvertibleTo(e1, e2) && !Symbol.isTypeConvertibleTo(e2, e1)){
					System.err.println("Line: " + ctx.getStart().getLine() + "; Expected equality comparison between two pointer of compatible type");
					this.semanticErrors++;
					exprType.put(ctx, new Type(false, Type.PType.ERROR));
					return false;
				}

			}
			exprType.put(ctx, new Type(false, Type.PType.BOOLEAN));
			return true;
		}

		//this should never execute
		System.err.println("Line: " + ctx.getStart().getLine() + "; Unknown comparisson operator " + ctx.getChild(1).getText());
		exprType.put(ctx, new Type(false, Type.PType.ERROR));
		return false;
	}


	public void exitSimple_expression(alg.Simple_expressionContext ctx) {
		exprType.put(ctx, exprType.get(ctx.children.get(0)));
	}

	public void exitUnary_Op(alg.Unary_OpContext ctx) {
		String operator = ctx.children.get(0).getText();

		Type e1 = exprType.get(ctx.alg_expression());

		verifyUnaryOperator(ctx, operator, e1);
	}

	private boolean verifyUnaryOperator(ParserRuleContext ctx, String operator, Type e1)
	{
		if(e1.isError())
		{
			exprType.put(ctx, new Type(false, Type.PType.ERROR));
			return false;
		}

		if (operator.equals("+") || operator.equals("-")){
			if (!Symbol.isTypeConvertibleTo(e1, new Type(false, Type.PType.INT)) || !Symbol.isTypeConvertibleTo(e1, new Type(false, Type.PType.FLOAT))){
				System.err.println("Line: " + ctx.getStart().getLine() + "; In expression " + ctx.getText() + " expected " + ctx.getChild(1).getText() + " to of type int or float");
				exprType.put(ctx, new Type(false, Type.PType.ERROR));
				return false;
			}
			exprType.put(ctx,e1);
			return true;
		}

		if (operator.equals("~")) {
			if (!Symbol.isTypeConvertibleTo(e1, new Type(false, Type.PType.BOOLEAN))){
				System.err.println("Line: " + ctx.getStart().getLine() + "; In expression " + ctx.getText() + " expected " + ctx.getChild(1).getText() + " to of type boolean");
				exprType.put(ctx, new Type(false, Type.PType.ERROR));
				return false;
			}
			exprType.put(ctx,e1);
			return true;
		}

		if (operator.equals("?")) {
			if (Symbol.isTypePointer(e1) || e1.equals(new Type(false, Type.PType.VOID))) {
				System.err.println("Line: " + ctx.getStart().getLine() + "; In expression " + ctx.getText() + " expected " + ctx.getChild(1).getText() + " to of non pointer type");
				exprType.put(ctx, new Type(false, Type.PType.ERROR));
				return false;
			}
			if (!(ctx.getChild(1) instanceof alg.Pointer_IndexingContext)
					&&
					(
							!(ctx.getChild(1) instanceof alg.Simple_expressionContext)
							|| !(ctx.getChild(1).getChild(0) instanceof alg.Simple_exprContext)
							|| !(ctx.getChild(1).getChild(0).getChild(0) instanceof alg.VarContext)
					)
			){
				System.err.println("Line: " + ctx.getStart().getLine() + "; In expression " + ctx.getText() + " expected " + ctx.getChild(1).getText() + " to either a pointer indexing or an identifier");
				exprType.put(ctx, new Type(false, Type.PType.ERROR));
				return false;
			}
			exprType.put(ctx,Symbol.getPointerType(e1));
			return true;
		}

		//this should never execute
		System.err.println("Line: " + ctx.getStart().getLine() + "; Unknown unary operator " + ctx.getChild(0).getText());
		exprType.put(ctx, new Type(false, Type.PType.ERROR));
		return false;
	}

	/**
	 * TODO: Os indentificadores de funcoes declarados são sempre visiveis independentemente da sua localizacao. Ou
	 * seja, eu posso invocar uma funcao que só seja declarada mais a frente no ficheiro.
	 * TODO: add return type check
	 */
	public void enterNormal_Func(alg.Normal_FuncContext ctx) {
		FunctionSymbol f;
		String functionName = ctx.IDENT().getText();
		//String type = ctx.alg_func_type().start.getText();
		//f = new FunctionSymbol(type,functionName);

		f = (FunctionSymbol) this.currentScope.resolve(functionName);
		//defineSymbol(ctx,f);

		this.currentFunction = f;
		this.currentScope = new Scope(this.currentScope);
	}

	public void exitNormal_Func(alg.Normal_FuncContext ctx) {
		//System.out.println("debug--Local scope for function " + this.currentFunction.name + ": " + this.currentScope.toString());
		if (!Symbol.isTypeConvertibleTo(this.currentFunction.returnType, this.currentFunction.type))
		{
			System.err.println("Line: " + ctx.IDENT().getSymbol().getLine() + "; Function " + this.currentFunction.name + " was not given a return in main block");
			this.semanticErrors++;
		}
		//alg.Alg_func_bodyContext funcBody = ctx.alg_func_body();
		//alg.Alg_blockContext mainBody = funcBody.alg_block();
		//int nChindren = mainBody.children.size();
		//ParseTree lastInstr = mainBody.getChild(nChindren - 2);
		//ParseTree lastInstrIn = lastInstr.getChild(0);
		////se nao tiver return no main block
		//if (!(lastInstrIn instanceof alg.Return_control_instrContext) && this.currentFunction.type != Symbol.PType.VOID) {
		//	System.err.println("Line: " + ctx.IDENT().getSymbol().getLine() + "; Function " + this.currentFunction.name + " missing return in main block, or its not the last instruction");
		//	this.semanticErrors++;
		//}


		currentScope = currentScope.getParentScope();
		this.currentFunction = null;


	}

	/**
	 * TODO: Os indentificadores de funcoes declarados são sempre visiveis independentemente da sua localizacao. Ou
	 * seja, eu posso invocar uma funcao que só seja declarada mais a frente no ficheiro.
	 */
	public void enterALG_Func(alg.ALG_FuncContext ctx) {
		FunctionSymbol f;
		String functionName = ctx.ALG().getText();
		String type = ctx.INT().getText();
		f = new FunctionSymbol(type,functionName);

		defineSymbol(ctx,f);

		this.currentFunction = f;
		this.currentScope = new Scope(this.currentScope);
		this.hasAlg = true;

	}

	public void exitALG_Func(alg.ALG_FuncContext ctx) {
		//System.out.println("debug--Local scope for function " + this.currentFunction.name + ": " + this.currentScope.toString());
		if (!Symbol.isTypeConvertibleTo(this.currentFunction.returnType, this.currentFunction.type))
		{
			System.err.println("Line: " + ctx.ALG().getSymbol().getLine() + "; Function " + this.currentFunction.name + " was not given a return in main block");
			this.semanticErrors++;
		}

		this.currentFunction = null;
		currentScope = currentScope.getParentScope();
	}

	public void exitAlg_alg_function_args(alg.Alg_alg_function_argsContext ctx) {
		Symbol intArg = new Symbol(ctx.INT().getText(), ctx.IDENT().get(0).getText());
		if (defineSymbol(ctx, intArg) && this.currentFunction != null){
			this.currentFunction.arguments.add(intArg);
		}

		Symbol stringPointerArg = new Symbol(ctx.STRING().getText()+"P", ctx.IDENT().get(1).getText());
		if (defineSymbol(ctx, stringPointerArg) && this.currentFunction != null){
			this.currentFunction.arguments.add(stringPointerArg);
		}
	}

	public void exitAlg_func_declaration_arg(alg.Alg_func_declaration_argContext ctx) {
		for (int i = 0; i < ctx.IDENT().size() ; i++)
		{
			Symbol s = new Symbol(ctx.alg_type().get(i).getText(),ctx.IDENT().get(i).getText());
			//if (defineSymbol(ctx, s) && this.currentFunction != null){
			//	this.currentFunction.arguments.add(s);
			//}
			defineSymbol(ctx, s);
		}
	}

	//TODO: check if args are ok and Os indentificadores de funcoes declarados são sempre visiveis independentemente da sua localizacao
	@Override public void exitNormal_Function_Call(alg.Normal_Function_CallContext ctx) {
		String functionName = ctx.IDENT().getText();
		Symbol s = this.currentScope.resolve(functionName);
		List<Type> call_args = this.currentCallArgTypes.get(currentCallArgTypes.size() - 1);
		this.currentCallArgTypes.remove(currentCallArgTypes.size() - 1);
		if(s == null)
		{
			//String x = ctx.alg_funtion_call_args().alg_funtion_call_args_aux().getText();
			System.err.println("Line: " + ctx.getStart().getLine() + "; Undefined function " + functionName);
			//System.err.println("USHIWHISHIWHI " + x);
			this.semanticErrors++;
			//this.validated = false;
			exprType.put(ctx, new Type(false, Type.PType.ERROR));
			return;
		}

		if(s instanceof FunctionSymbol) //&& !ctx.IDENT().getText().equals("WRITE"))
		{
			//if(this.arguments.isEmpty() && ((FunctionSymbol) s).arguments.isEmpty()) {
			//}
			if(((FunctionSymbol) s).arguments.size() != call_args.size()){
				System.err.println("Line: " + ctx.getStart().getLine() + "; Function call " + functionName + " has wrong number of arguments");
				this.semanticErrors++;
				//exprType.put(ctx,Symbol.PType.ERROR);
				exprType.put(ctx, s.type);
				return;
			}
			else{//VERIFICAR CONVERSAO IMPLICITA
				FunctionSymbol f = (FunctionSymbol) s;
				for (int i = 0; i < f.arguments.size(); i++)
					if(!Symbol.isTypeConvertibleTo(call_args.get(i), f.arguments.get(i).type)){
						System.err.println("Line: " + ctx.getStart().getLine() + "; Wrong argument type in function " + functionName);
						this.semanticErrors++;
						//exprType.put(ctx,Symbol.PType.ERROR);
						exprType.put(ctx, s.type);
						//this.validated = false;
						return;
					}
				exprType.put(ctx, s.type);
			}
		}
		else{
			System.err.println("Using " + functionName + " as function in line " + ctx.IDENT().getSymbol().getLine());
			this.semanticErrors++;
			exprType.put(ctx, new Type(false, Type.PType.ERROR));
			//this.validated = false;
			return;
		}

		//currentCallArgTypes = new ArrayList<>();
	}

	@Override public void exitAT_Function_Call(alg.AT_Function_CallContext ctx) {
		exprType.put(ctx, new Type(false, Type.PType.STRING));
	}

	@Override public void exitSizeof_Function_Call(alg.Sizeof_Function_CallContext ctx) {
		exprType.put(ctx, new Type(false, Type.PType.INT));
	}

	@Override public void exitWrite_Function_Call(alg.Write_Function_CallContext ctx) {
		for (Type argType : this.currentCallArgTypes.get(this.currentCallArgTypes.size() - 1)) {
			if (Symbol.isTypePointer(argType)) {
				System.err.println("Line: " + ctx.getStart().getLine() + "; Invalid argument for function write, expected a non pointer type but got " + Symbol.typeToString(argType));
				this.semanticErrors++;
			}
		}
		this.currentCallArgTypes.remove(this.currentCallArgTypes.size() - 1);
		exprType.put(ctx, new Type(false, Type.PType.VOID));
	}

	@Override public void exitWriteLn_Function_Call(alg.WriteLn_Function_CallContext ctx) {
		for (Type argType : this.currentCallArgTypes.get(this.currentCallArgTypes.size() - 1)) {
			if (Symbol.isTypePointer(argType)) {
				System.err.println("Line: " + ctx.getStart().getLine() + "; Invalid argument for function writeln, expected a non pointer type but got " + Symbol.typeToString(argType));
				this.semanticErrors++;
			}
		}
		this.currentCallArgTypes.remove(this.currentCallArgTypes.size() - 1);
		exprType.put(ctx, new Type(false, Type.PType.VOID));
	}





	public void enterAlg_funtion_call_args(alg.Alg_funtion_call_argsContext ctx) {
		this.currentCallArgTypes.add( new ArrayList<>() );
	}





	public void exitAlg_funtion_call_args(alg.Alg_funtion_call_argsContext ctx) {
		if(ctx.alg_expression() != null){
			this.currentCallArgTypes.get(this.currentCallArgTypes.size() - 1).add(0, this.exprType.get(ctx.alg_expression()));
		}
	}

	public void exitAlg_funtion_call_args_aux(alg.Alg_funtion_call_args_auxContext ctx) {
		if(ctx.alg_expression() != null){
			this.currentCallArgTypes.get(this.currentCallArgTypes.size() - 1).add(0, this.exprType.get(ctx.alg_expression()));
		}
	}

	public void exitLeave_control_instr(alg.Leave_control_instrContext ctx) {
		ParserRuleContext parent = ctx.getParent().getParent();
		//in subblock
		if (!this.inCycle) {
			System.err.println("Line: " + ctx.getStart().getLine() + "; Expected leave instruction inside a cycle main body");
			this.semanticErrors++;
		}
		if (parent instanceof alg.Alg_instr_repeatContext) {
			alg.Alg_instr_repeatContext parentSubBlock = (alg.Alg_instr_repeatContext) parent;
			if (parentSubBlock.alg_instr_repeat().alg_instruction() != null) {
				System.err.println("Line: " + ctx.getStart().getLine() + "; Expected leave instruction to be the last instruction of code subblock");
				this.semanticErrors++;
			}
		}
	}

	public void exitRestart_control_instr(alg.Restart_control_instrContext ctx) {
		ParserRuleContext parent = ctx.getParent().getParent();
		//in subblock
		if (!this.inCycle) {
			System.err.println("Line: " + ctx.getStart().getLine() + "; Expected restart instruction inside a cycle main body");
			this.semanticErrors++;
		}
		if (parent instanceof alg.Alg_instr_repeatContext) {
			alg.Alg_instr_repeatContext parentSubBlock = (alg.Alg_instr_repeatContext) parent;
			if (parentSubBlock.alg_instr_repeat().alg_instruction() != null) {
				System.err.println("Line: " + ctx.getStart().getLine() + "; Expected restart instruction to be the last instruction of code subblock");
				this.semanticErrors++;
			}
		}
	}

	public void exitReturn_control_instr(alg.Return_control_instrContext ctx) {
		String returnVal = ctx.getChild(1).getText();
		Type returnType;
		if (!returnVal.equals("")){
			returnType = exprType.get(ctx.getChild(1).getChild(0));

		}
		else {
			returnType = new Type(false, Type.PType.VOID);
		}

		if (!Symbol.isTypeConvertibleTo(returnType, this.currentFunction.type)) {
			System.err.println("Line: " + ctx.getStart().getLine() + "; Invalid return type, expected " + Symbol.typeToString(this.currentFunction.type)
					+ " but got " + Symbol.typeToString(returnType));
			this.semanticErrors++;
		}
		ParserRuleContext parent = ctx.getParent().getParent();
		if (parent instanceof alg.Alg_blockContext) {
			alg.Alg_blockContext parentBlock = (alg.Alg_blockContext) parent;
			int nChindren = parentBlock.children.size();
			ParseTree lastInstr = parentBlock.getChild(nChindren - 2);
			if (!ctx.getParent().equals(lastInstr))
			{
				System.err.println("Line: " + ctx.getStart().getLine() + "; Expected return to be the last instruction of code block");
				this.semanticErrors++;
			}
			if (parentBlock.getParent() instanceof alg.Alg_func_bodyContext) {
				this.currentFunction.returnType = returnType;
			}
		}

		else if (parent instanceof alg.Alg_instr_repeatContext) {
			alg.Alg_instr_repeatContext parentSubBlock = (alg.Alg_instr_repeatContext) parent;
			if (parentSubBlock.alg_instr_repeat().alg_instruction() != null) {
				System.err.println("Line: " + ctx.getStart().getLine() + "; Expected return to be the last instruction of code subblock");
				this.semanticErrors++;
			}
		}
	}

	public void exitLado_esquerdo_ident(alg.Lado_esquerdo_identContext ctx) {
		String variableName = ctx.getChild(0).getText();
		Symbol s = this.currentScope.resolve(variableName);
		if(s == null)
		{
			System.err.println("Line: " + ctx.start.getLine() +  "; Undefined variable " + variableName);// + ctx.getChild(0).getText() + " position " + ctx.ID().getSymbol().getCharPositionInLine());
			this.semanticErrors++;
			//this.validated = false;
			exprType.put(ctx, new Type(false, Type.PType.ERROR));
			return;
		}

		if(s instanceof FunctionSymbol)
		{
			System.err.println("Line: " + ctx.start.getLine() + "Using function symbol " + variableName + " as variable");// + ctx.ID().getSymbol().getLine());
			this.semanticErrors++;
			//this.validated = false;
			exprType.put(ctx, new Type(false, Type.PType.ERROR));
			return;

		}
		exprType.put(ctx,s.type);
	}

	public void exitLado_esquerdo_pointer_index(alg.Lado_esquerdo_pointer_indexContext ctx) {
		Type e1 = exprType.get(ctx.alg_expression(0));
		Type e2 = exprType.get(ctx.alg_expression(1));

		if (!Symbol.isTypeNonEmptyPointer(e1) ){
			System.err.println("Line: " + ctx.LBRACKET().getSymbol().getLine() + "; In expression " + ctx.getText() + " expected " + ctx.alg_expression(0).getText() + " to be a non empty pointer");
			this.semanticErrors++;
			exprType.put(ctx, new Type(false, Type.PType.ERROR));
			return;
		}

		if (!Symbol.isTypeConvertibleTo(e2, new Type(false, Type.PType.INT))){
			System.err.println("Line: " + ctx.LBRACKET().getSymbol().getLine() + "; In expression " + ctx.getText() + " expected " + ctx.alg_expression(1).getText() + " to be of type int");
			this.semanticErrors++;
			exprType.put(ctx, new Type(false, Type.PType.ERROR));
			return;
		}
		exprType.put(ctx, Symbol.getPrimitiveType(e1));
	}

	public void exitAlg_atrib(alg.Alg_atribContext ctx) {
		if(!Symbol.isTypeConvertibleTo(exprType.get(ctx.alg_expression()), exprType.get(ctx.lado_esquerdo())) &&
				!Symbol.isTypeError(exprType.get(ctx.lado_esquerdo())) && !Symbol.isTypeError(exprType.get(ctx.alg_expression()))){
			System.err.println("Line: " + ctx.start.getLine() +"; Expected " + Symbol.typeToString(exprType.get(ctx.lado_esquerdo())) + " but got " + Symbol.typeToString(exprType.get(ctx.alg_expression())) );
			this.semanticErrors++;
			//this.validated = false;
			//exprType.put(ctx,Symbol.PType.ERROR);
			return;
		}
		if(exprType.get(ctx.alg_expression()).equals(new Type(false, Type.PType.VOID))){
			System.err.println("Line: " + ctx.start.getLine() + "; Cannot assign variable to void type");
			this.semanticErrors++;
			//this.validated = false;
			//exprType.put(ctx,Symbol.PType.ERROR);
			return;
		}
		//exprType.put(ctx, exprType.get(ctx.lado_esquerdo()));
	}

	public void enterAlg_cicle(alg.Alg_cicleContext ctx) {
		this.inCycle = true;
	}





	public void exitAlg_cicle(alg.Alg_cicleContext ctx) {
		this.inCycle = false;
	}




	//TODO: perguntar ao prof se o leave e restar podem estar no finnaly subblock
	public void enterAlg_cicle_next(alg.Alg_cicle_nextContext ctx) {
		this.inCycle = false;
	}

}
