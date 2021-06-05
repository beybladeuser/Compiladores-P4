package mainPackage;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import alg.algLexer;
import alg.alg;
import alg.TypeChecker;
import alg.FunctionScopePopulator;
import alg.CodeGen;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        String sourceFile;
        String outputFile;
        try {
            if(args.length == 0)
            {
                System.err.println("filename required for compilation!");
                System.exit(1);
            }
            if(args.length > 1)
            {
                outputFile = args[1];
            }
            else
            {

                outputFile = args[0].split("\\.")[0] + ".tac";
            }
            sourceFile = args[0];

            algLexer lexer = new algLexer(CharStreams.fromFileName(sourceFile));
            alg parser = new alg(new CommonTokenStream(lexer));
            ParseTree tree = parser.alg_file();
            System.out.println("syntatic parsing finished");

            // create a standard ANTLR parse tree walker
            ParseTreeWalker walker = new ParseTreeWalker();
            // create listener then feed to walker
            System.out.println("Type checking...");

            FunctionScopePopulator functionScope = new FunctionScopePopulator();
            walker.walk(functionScope, tree);

            TypeChecker listener = new TypeChecker(functionScope.functionScope, functionScope.lines);
            walker.walk(listener, tree);

            if (parser.getNumberOfSyntaxErrors() > 0)
            {
                System.out.println(parser.getNumberOfSyntaxErrors() + " syntactic errors found.");
            }
            if(listener.semanticErrors > 0)
            {
                System.out.println(listener.semanticErrors + " semantic errors found.");
            }
            if (listener.semanticErrors > 0 || parser.getNumberOfSyntaxErrors() > 0) {
                System.out.println("Compilation process halted.");
                System.exit(1);
            }

            System.out.println("No semantic errors found");

            System.out.println("Generating TAC code");

            //give the scopes created by the typeChecker to the codeGenerator
            CodeGen codeGen = new CodeGen(listener.scopes);
            codeGen.visit(tree);

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            for(String s : codeGen.code)
            {
                if(!s.endsWith(":"))
                {
                    writer.write("\t");
                }
                writer.write(s);
                writer.newLine();
            }
            writer.flush();
            writer.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
    }
}

