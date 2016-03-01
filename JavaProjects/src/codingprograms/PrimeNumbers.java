package codingprograms;

public class PrimeNumbers {

	public static void main(String [] arg){
		
		System.out.println(PrimeNumbers.isPrimeNumber(9));
	}
	
	
	public static boolean isPrimeNumber(int num){
		
		boolean result  = true;
		
		for(int i=2; i<num; i++){
			
			System.out.println(num+" "+i);
			
			if(num % i == 0){
				result = false ;
			}
		}
		
		return result;
	}
}
