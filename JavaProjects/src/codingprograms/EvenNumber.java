package codingprograms;

public class EvenNumber {
	
	public static void main(String []args){
		
		System.out.println(EvenNumber.isEven(4));
	}
	
	public static boolean isEven(int num){
		boolean result = true ;
		
		if(num % 2 != 0){
			result = false;
		}
		
		return result;
	}
}
