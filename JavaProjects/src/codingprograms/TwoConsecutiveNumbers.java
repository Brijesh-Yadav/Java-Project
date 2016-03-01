package codingprograms;

public class TwoConsecutiveNumbers {
	
	public static void main(String [] args){
		
		int [] array = {5,3,5,7,5,3,5,7,8};
		int c = 0 ;
		boolean result = false;
		for(int i=0; i<array.length-1; i++){
			int a = array[i];
			int b = array[i+1];
			
			int d = 0;
			
			if(a > b){
				 d = a - b;
			}else if(b > a){
				d = b - a; 
			}
			
			if(i!=0){
				System.out.println(c+" "+ d);
				if(c==d){
					result = true;
				}else{
					result = false;
					break;
				}	
			}
			c = d;
		}
		System.out.println(result);
	}
}
