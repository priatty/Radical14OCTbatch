package basic;

public class My2DArray {

	public static void main(String[] args) {

		int myArray[][] = {
						{ 5, 11, 55},
						{ 7, 8 , 99},
						{ 9, 3 , 88},
						{ 4, 33, 22}
						};
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				
				System.out.print(myArray[i][j]+ "   ");
			}
			
			System.out.println();     //  
		
		}

	}

}
