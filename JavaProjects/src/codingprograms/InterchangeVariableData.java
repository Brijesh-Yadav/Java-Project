package codingprograms;

public class InterchangeVariableData {
	
	public static void main(String [] args){
		int x = 8 ;
		int y = 12 ;
		
		y = x+y;
		x = y - x ;
		y = y - x ;
		System.out.println(x+" "+y);
	}
}
