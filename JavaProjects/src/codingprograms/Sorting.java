package codingprograms;

public class Sorting {
	
	public static void main(String []args){
		int array [] = {5,2,3,4,1};
		
		System.out.println(Sorting.returnString(5, array));
	
	}
	
	
	public static StringBuilder returnString(int num, int arr []){
		StringBuilder sb = new StringBuilder ();
		
		for(int i=0; i<arr.length; i++){
			if(num < arr[i]){
				sb = sb.append(num+",");
				System.out.println("print");
			}else {
				sb = sb.append(","+arr[i]);
			}
		}
		
		return sb ;
		
	}
}
