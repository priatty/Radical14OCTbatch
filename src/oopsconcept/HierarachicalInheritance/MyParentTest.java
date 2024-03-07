package oopsconcept.HierarachicalInheritance;

public class MyParentTest {

	public static void main(String[] args) {
		

		MyParent obj = new MyParent();
		obj.method1();
		obj.method2();
		
		MyChild1 obj1 = new MyChild1();
		obj1.method1();
		obj1.method2();
		obj1.method3();
		obj1.method4();
		
		MyChild2 obj2 = new MyChild2();
		obj2.method1();
		obj2.method2();
		obj2.method5();
		obj2.method6();
		
		MyGrandChild1  obj3 = new MyGrandChild1();
		obj3.method1();
		obj3.method2();
		obj3.method3();
		obj3.method4();
		obj3.method7();
		obj3.method8();
		
		
	}

}
