package AccessSpecifiers.B;

import AccessSpecifiers.A.MyDefaultAS;

public class MyDefaultASTest {

	public static void main(String[] args) {
		
		MyDefaultAS obj = new MyDefaultAS();
		
		//obj.method1();    default hence not accessible out side pakage
		//obj.i;            default hence not accessible out side pakage

	}

}
