package basic;

public class MyBasicsofClassAndObjectTest {

	public static void main(String[] args) {
		
		System.out.println("In Main Method");
		
		MyBasicsofClassAndObject obj1 = new MyBasicsofClassAndObject();
		
		obj1.method1();
		obj1.method2();
		
		//We can create multiple object for a class
		MyBasicsofClassAndObject obj2 = new MyBasicsofClassAndObject();
		
        obj2.method2();
        obj2.method1();
		
	}

}
