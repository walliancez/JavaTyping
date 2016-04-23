package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Random;

public class JGenerator {
	private final static int CLASS = 1;
	private final static int FUNCTION = 2;
	private final static int VALUE = 3;
	private Reader fRead;
	private Random r;
	// private int seed;

	public JGenerator() {
		r = new Random();
	}

	public JGenerator(long seed) {
		r = new Random(seed);
	}

	public JavaTextWrite getNewClass() throws IOException {
		int valueAmount = r.nextInt(3) + 1;
		int functionAmount = r.nextInt(3) + 1;
		
		ArrayList<String> sb = new ArrayList<String>();
		sb.add(Access.RandomAccessModifier(r) + " class " + getName(CLASS,r) + "() {\n\t");
		for(int i = 0; i < valueAmount; i++){
			sb.add(ReturnType.getRandomReturnType(r) + " " + getName(VALUE,r) + ";\n\t");
		}
		sb.add("\n\t");
		for(int i = 0; i < functionAmount; i++){
			sb.add(returnFunction(r));
			sb.add("\n\t");
		}
		
		sb.add("}");

		return new JavaTextWrite(sb.toArray(new String[sb.size()]));
	}

	private String returnFunction(Random r) throws IOException {
		return Access.RandomAccessModifier(r) + " " + ReturnType.getRandomReturnType(r) + " " + getName(FUNCTION, r)
				+ "() {\n\t}";
	}

	/*
	 * TODO: Make this more efficient
	 * 
	 */
	private String getName(int flag, Random r) throws IOException {
		String res;
		ArrayList<String> list = new ArrayList<String>();

		switch (flag) {
		case 0:
			System.out.print("Fug");
			System.exit(0);
		case CLASS:
			fRead = new FileReader("/home/k4n4b1z/Documents/edaa01-workspace/JavaTyping/src/core/ClassNames");
			break;
		case FUNCTION:
			fRead = new FileReader("/home/k4n4b1z/Documents/edaa01-workspace/JavaTyping/src/core/FunctionNames");
			break;
		case VALUE:
			fRead = new FileReader("/home/k4n4b1z/Documents/edaa01-workspace/JavaTyping/src/core/ValueNames");
			break;
		default:
			throw new FileNotFoundException();
		}
		// fRead.read(res);

		BufferedReader bf = new BufferedReader(fRead);
		while ((res = bf.readLine()) != null) {
			list.add(res);
		}
		return list.get(r.nextInt(list.size()));
	}
}
