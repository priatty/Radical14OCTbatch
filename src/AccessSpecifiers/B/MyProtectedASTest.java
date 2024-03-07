package AccessSpecifiers.B;

import AccessSpecifiers.A.MyProtectedAS;

public class MyProtectedASTest {

	public static void main(String[] args) {

		MyProtectedAS obj = new MyProtectedAS();
		//obj.method1() not  accessible here because it is protected
		
	}

}
