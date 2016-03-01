package codingprograms;

public class Odd {
	
	public static void main(String [] args){
		System.out.println(Odd.isOddNumber(4));
	}
	
	public static boolean isOddNumber(int num){
		boolean result = true;
		if(num%2 == 0){
			result = false;
		}
		return result;
	}
}
