package codingprograms;

public class Fibonacci {
	
	public static void main(String [] arg){
		
		int num = 10;
		int a = 0;
		int b = 1;
		
		StringBuilder sb = new StringBuilder();
		sb.append("0,1");
		
		for(int i=2; i<num; i++){
			int c = a+b ;
			a = b ;
			b = c ;
			sb = sb.append(","+c);
		}
		
		System.out.println(sb);
	}

}
