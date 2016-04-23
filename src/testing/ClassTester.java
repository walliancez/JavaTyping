package testing;

import java.io.IOException;

import core.JGenerator;
import core.TextWrite;

public class ClassTester {
	public static void main(String[] args){
		JGenerator gen = new JGenerator();
		TextWrite tw = new TextWrite(null);
		String current;
		try {
			tw = gen.getNewClass();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while((current = tw.nextLine()) != null){
			System.out.print(current);
		}
		System.out.println("Test over");
		
	}
}
