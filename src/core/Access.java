package core;

import java.util.Random;

public class Access {
	public final static String PRIVATE = "private";
	public final static String PUBLIC = "public";
	public final static String PROTECTED = "protected";

	// private static Random rand;

	public static String RandomAccessModifier(Random rand) {
		switch (rand.nextInt(3)) {
		case 0:
			return PRIVATE;
		case 1:
			return PUBLIC;
		case 2:
			return PROTECTED;
		default:
			return "weird";
		}
	}
}
