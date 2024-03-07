package AccessSpecifiers.B;

import AccessSpecifiers.A.MyPublicPrivateAS;

public class MyPublicPrivateASTest {

	public static void main(String[] args) {
		
		MyPublicPrivateAS obj = new MyPublicPrivateAS();
		
		obj.method1();
		
		//obj.method2();  // it is not accessible because it is private
		
		int val= obj.i;
		System.out.println(val);
		
		//obj.j; j is private hence not accessible here
	}

}
