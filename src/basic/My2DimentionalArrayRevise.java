package basic;

public class My2DimentionalArrayRevise {

	public static void main(String[] args) {

		String myArray[][] = {{ "Red", "Green", "Black"},
							  {"Blue" ,"Yellow","Pink"},
							  {"Violet", "Purple","White"},
							  {"Teal" ,"Gray","Wine"}};
		
		
		System.out.println("Array Element At ="   +myArray[1][1]);
		
		System.out.println("=======Using For Loop========");
		for(int i= 0; i<4; i++ ) {
			
			for(int j=0; j<3; j++){ 
				
				System.out.print(myArray[i][j]+ "   ");
			}
			
			System.out.println();
		}

}
}

