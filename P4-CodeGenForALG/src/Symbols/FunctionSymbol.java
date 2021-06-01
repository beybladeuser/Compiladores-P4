package Symbols;

import java.util.ArrayList;
import java.util.List;

public class FunctionSymbol extends Symbol {

    public List<Symbol> arguments;
    public Scope functionScope;

    public Type returnType = new Type(false, Type.PType.VOID);

    public FunctionSymbol(String type, String functionName)
    {
        super(type,functionName);
        this.arguments = new ArrayList<Symbol>();
    }

    public FunctionSymbol(Type type, String functionName, Scope functionScope)
    {
        super(type,functionName);
        this.arguments = new ArrayList<Symbol>();
        this.functionScope = functionScope;
    }

    public String toString()
    {
        return "#F#" + name + ":" + this.type + this.arguments.toString();
    }
}
