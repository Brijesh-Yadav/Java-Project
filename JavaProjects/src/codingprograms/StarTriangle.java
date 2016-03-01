package codingprograms;

public class StarTriangle {
	
	public static void main(String [] args){
		
		char c = '*';
		
		for(int i=0; i<10; i++){

			for(int j=0; j<i; j++){
				System.out.print(c);
			}
			System.out.println(c);
		}
		
	}
	
	public static void triangle(){
		int rows = 7;
        for (int x = 1; x <= rows; x++)
        {
            for (int i = 1; i <= x; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
	}
	
}
