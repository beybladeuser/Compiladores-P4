package Symbols;

import java.util.Locale;

public class Symbol {
	public enum PType
	{
		INT,
		BOOL,
		FLOAT,
		STRING,
		VOID,
		INTP,
		BOOLP,
		FLOATP,
		STRINGP,
		VOIDP,
		ERROR
	}

	public PType type;
	public String name;
	public Scope scope;

	public Symbol(String type, String name)
	{
		if (type.contains("<")){
			type = type.replace("<", "");
			type = type.replace(">", "P");
		}
		this.type = PType.valueOf(type.toUpperCase(Locale.ROOT));
		this.name = name;
	}

	public String toString()
	{
		return name + ":" + this.getTypeString();
	}

	public String getTypeString()
	{
		return typeToString(type);
	}

	public static String typeToString(PType type)
	{
		String result = type.toString();
		if (!isTypePointer(type))
			return result;
		else {
			result = result.replace("P", ">");
			return "<" + result;
		}
	}

	public boolean isPointerType(){
		return isTypePointer(type);
	}

	public static boolean isTypePointer(PType type)
	{
		return type.toString().contains("P");
	}

	public static boolean isTypeError(PType type)	{ return type == PType.ERROR; }

	public static boolean isTypeNonEmptyPointer(PType type) {
		return isTypePointer(type) && type != PType.VOIDP;
	}

	public static boolean isTypePrimitive(PType type) {
		return !isTypePointer(type);
	}

	public static boolean isTypeConvertibleTo(Symbol.PType from, Symbol.PType to)
	{
		if(from == to) return true;
		if(from == Symbol.PType.INT && to == Symbol.PType.FLOAT) return true;
		if(from == PType.VOIDP && isTypePointer(to)) return true;
		return false;
	}

	public static PType getPrimitiveType(PType pointerType)
	{
		if (!isTypePointer(pointerType))
		{
			return pointerType;
		}
		String temp = pointerType.toString();
		temp = temp.replace("P",  "");
		return PType.valueOf(temp.toUpperCase(Locale.ROOT));
	}

	public static PType getPointerType(PType primitiveType)
	{
		if (isTypePointer(primitiveType))
		{
			return primitiveType;
		}
		String temp = primitiveType.toString() + "P";
		return PType.valueOf(temp.toUpperCase(Locale.ROOT));
	}

}
