package codingprograms;

public class Reversestring {
	public static void main(String [ ]args){
		String dt = "hello world";
		char[] ch = dt.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--){
			System.out.print(ch[i]);
		}
	}
}
