package alg;

import Symbols.FunctionSymbol;
import Symbols.Scope;
import Symbols.Symbol;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class FunctionScopePopulator extends algBaseListener {
	public List<FunctionSymbol> functionScope;
	public List<Integer> lines;
	private FunctionSymbol currentFunction;



	public void enterAlg_file(alg.Alg_fileContext ctx) {
		this.functionScope = new ArrayList<>();
		this.lines = new ArrayList<>();
	}

	public void exitAlg_file(alg.Alg_fileContext ctx) {
		//System.out.println(this.functionScope.toString());
	}

	public void enterNormal_Func(alg.Normal_FuncContext ctx) {
		FunctionSymbol f;
		String functionName = ctx.IDENT().getText();
		String type = ctx.alg_func_type().getText();
		f = new FunctionSymbol(type,functionName);

		this.functionScope.add(f);
		this.lines.add(ctx.getStart().getLine());

		this.currentFunction = f;
	}

	public void exitAlg_func_declaration_arg(alg.Alg_func_declaration_argContext ctx) {
		for (int i = 0; i < ctx.IDENT().size() ; i++)
		{
			Symbol s = new Symbol(ctx.alg_type().get(i).getText(),ctx.IDENT().get(i).getText());
			if (this.currentFunction != null){
				this.currentFunction.arguments.add(s);
			}
		}
	}
}
