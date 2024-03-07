package MyConstructorDemo;

public class CopyConstructorTest {

	public static void main(String[] args) {
		
		CopyConstructor obj = new CopyConstructor(10);
		System.out.println(obj.i);
		
		CopyConstructor obj1 = new CopyConstructor(obj);
		System.out.println(obj1.i);
		

	}

}
