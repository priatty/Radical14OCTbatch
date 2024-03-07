package AccessSpecifiers.C;

import AccessSpecifiers.B.MyImportClassExample;

public class MyImportClassExampleTest {

	public static void main(String[] args) {

		MyImportClassExample obj = new MyImportClassExample();
		
		obj.method1();
		
		AccessSpecifiers.A.MyImportClassExample obj1 = new AccessSpecifiers.A.MyImportClassExample();
		
		obj1.method1();
		
		

	}

}
