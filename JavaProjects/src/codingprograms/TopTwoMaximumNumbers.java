package codingprograms;

public class TopTwoMaximumNumbers {
	public static void main(String []args){
		int array [] = {5,6,2,7,9,4,2,3,1,12,14,20,10,16};
		int a = 0;
		int max = 0;
		int smax = 0;
		for(int i=0; i<array.length; i++){
			a = array[i];
			if (a > max) {
				max = a ;
			}else {
				smax = a;
			}
		}
		System.out.println(max);
		System.out.println(smax);		
	}
}
