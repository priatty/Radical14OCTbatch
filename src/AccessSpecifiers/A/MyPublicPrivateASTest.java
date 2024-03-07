package AccessSpecifiers.A;

public class MyPublicPrivateASTest {
	
	public static void main(String[] args) {
		
		MyPublicPrivateAS obj = new MyPublicPrivateAS();
		
		obj.method1();
		
		
		//method 2 is private hence not accessible out
		//obj.method2();
		
				
		int val = obj.i;
			System.out.println(val);
		// j is private hence not accessible outside the class	
		//int val2 =obj.j;
		//System.out.println(val2);
		}

}
