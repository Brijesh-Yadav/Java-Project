package codingprograms;

public class DuplicateNumber {
	
	public static void main(String []args){
		
		int [] array = {12,34,10,12,34,15};
		
		for(int i=0; i<array.length; i++){
//			System.out.println(array[i]);
			
			int cnt = DuplicateNumber.isDuplicateNumbre(array[i], array);
//			System.out.println(cnt);
			if(cnt>1){
				System.out.println(array[i]+" duplicate");
			}
			
		}
				
	}
	
	public static int isDuplicateNumbre(int num, int []array){
		int count = 0;
		for(int i=0; i<array.length; i++){
			if(num==array[i]){
				count++;
			}
		}
		return count;
	}
	
	
}
