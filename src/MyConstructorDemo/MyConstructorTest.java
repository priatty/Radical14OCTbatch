package MyConstructorDemo;

public class MyConstructorTest {

	public static void main(String[] args) {
		
		MyConstructor obj1 = new MyConstructor(10, "Neha");
		System.out.println(obj1.i);
		System.out.println(obj1.name);
		
		MyConstructor obj2 = new MyConstructor(101, "Prathmesh");
		System.out.println(obj2.i);
		System.out.println(obj2.name);
		
		MyConstructor obj3 = new MyConstructor("Priyanka", "Apurva");
		System.out.println(obj3.address);
		System.out.println(obj1.name);
		
		MyConstructor obj4 = new MyConstructor( 1001, "Priyanka", "Apurva");
		System.out.println(obj4.i);
		System.out.println(obj4.address);
		System.out.println(obj4.name);
		
		
		
		}
	}

  

