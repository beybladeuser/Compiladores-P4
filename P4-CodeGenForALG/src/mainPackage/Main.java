package mainPackage;

import Symbols.FunctionSymbol;
import alg.algLexer;
import alg.alg;
import alg.TypeChecker;
import alg.FunctionScopePopulator;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

//TODO: perguntar ao prof quais os tipos de return das funcs @(), sizeof(), write() e writeln()
public class Main {

    public static void main(String[] args) {
        try {
            algLexer _algLexer = new algLexer(CharStreams.fromFileName("src/test_func_decl.alg"));
            alg _algParser = new alg(new CommonTokenStream(_algLexer));
            ParseTree tree = _algParser.alg_file();
            System.out.println("syntatic parsing finished");

            // create a standard ANTLR parse tree walker
            ParseTreeWalker walker = new ParseTreeWalker();
            // create listener then feed to walker
            System.out.println("Type checking...");

            FunctionScopePopulator functionScope = new FunctionScopePopulator();
            walker.walk(functionScope, tree);

            TypeChecker listener = new TypeChecker(functionScope.functionScope, functionScope.lines);
            walker.walk(listener, tree);

            if(listener.semanticErrors > 0)
            {
                System.out.println(listener.semanticErrors + " semantic errors found. Compilation process halted.");
                System.exit(1);
            }
            System.out.println("No semantic errors found");

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}