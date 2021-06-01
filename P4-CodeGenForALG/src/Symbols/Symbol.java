package Symbols;

//classe apenas com campos
public class Symbol {

    public final Type type;
    public final String name;
    public int width;
    public int offset;
    public Scope scope;
    public boolean isValueKnown;
    public boolean isWidthKnown;
    public Object value;

    public Symbol(String type, String name)
    {
        boolean isPointer = false;
        if (type.contains("<")){
            type = type.replace("<", "");
            type = type.replace(">", "");
            isPointer = true;
        }
        if (type.charAt(type.length() - 1) == 'P'){
            isPointer = true;
            type = type.substring(0, type.length() - 1);
        }
        this.type = new Type(isPointer, type);
        this.name = name;
    }

    //usamos um enumerado para guardar o tipo, porque é mais eficiente nas comparações de tipos
    public Symbol(Type type, String name)
    {
        this.type = type;
        this.name = name;
        this.width = type.getWidth();

        isValueKnown = false;
        //by default, we know the size needed to store all pointers, and all primitive types
        //except for strings, which need to be dynamically allocated
        if(!type.isPointer() && type.getPrimitiveType() == Type.PType.STRING)
        {
            this.isWidthKnown = false;
        }
        else this.isWidthKnown = true;

        //this.offset = offset;
    }

    public Symbol(Type type, String name, Object value)
    {
        this.type = type;
        this.name = name;
        this.width = type.getWidth();
        this.isValueKnown = true;
        this.isWidthKnown = true;
        this.value = value;

        //this.offset = offset;
    }

    /*public Symbol(Type type, String name, int offset)
    {
        this.type = type;
        this.name = name;
        this.width = type.getWidth();
        this.offset = offset;
    }*/

    public String toString()
    {
        return name + ":" + this.type;
    }

    public String getTypeString()
    {
        return typeToString(type);
    }

    public static String typeToString(Type type)
    {
        return type.toString();
    }

    public boolean isPointerType(){
        return isTypePointer(type);
    }

    public static boolean isTypePointer(Type type)
    {
        return type.isPointer();
    }

    public static boolean isTypeError(Type type)	{ return type.isError(); }

    public static boolean isTypeNonEmptyPointer(Type type) {
        return isTypePointer(type) && type.getPrimitiveType() != Type.PType.VOID;
    }

    public static boolean isTypePrimitive(Type type) {
        return !isTypePointer(type);
    }

    public static boolean isTypeConvertibleTo(Type from, Type to)
    {
        return Type.isConvertibleTo(from, to);
    }

    public static Type getPrimitiveType(Type pointerType)
    {
        return new Type(false, pointerType.getPrimitiveType());
    }

    public static Type getPointerType(Type primitiveType)
    {
        return primitiveType.extractPointerType();
    }
}
