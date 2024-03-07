package oopsconcept.MultilevelInheritance;

public class MyParentTest {

	public static void main(String[] args) {
		
		MyParent obj1 = new MyParent();
		
		obj1.method1();
		obj1.method2();
		
		MyChild obj2 = new MyChild();
		obj2.method1();
		obj2.method2();
		obj2.method3();
		obj2.method4();
		
		MyGrandChild obj3 = new MyGrandChild();
		obj3.method1();
		obj3.method2();
		obj3.method3();
		obj3.method4();
		obj3.method5();
		obj3.method6();
		

	}

}
