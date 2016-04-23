package core;

public class TextWrite {
	String[] lines;
	int current;
	
	public TextWrite(String[] lines){
		this.lines = lines;
		current = 0;
	}
	
	public String nextLine(){
		try{
			return lines[current++];
		}catch(IndexOutOfBoundsException e){
			return null;
		}
	}
	
	
}
