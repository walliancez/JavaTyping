package core;

import java.util.Random;

public class ReturnType {
	public final static String VOID = "void";
	public final static String INT = "int";
	public final static String BOOLEAN = "boolean";
	public final static String STRING = "String";
	
	public static String getRandomReturnType(Random rand){
		switch(rand.nextInt(4)){
		case 0:
			return VOID;
		case 1:
			return INT;
		case 2:
			return BOOLEAN;
		case 3:
			return STRING;
			default:
				return "weird";
		}
	}
}
