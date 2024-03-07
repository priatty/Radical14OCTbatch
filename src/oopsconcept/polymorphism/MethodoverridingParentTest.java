package oopsconcept.polymorphism;

public class MethodoverridingParentTest {

	public static void main(String[] args) {
		
		MethodoverridingParent obj1 = new MethodoverridingParent();
		obj1.method1("Priyanka", 1001);
		obj1.method2();
		obj1.method10("A", 10, 20);
		
		MethodoverridingChild obj2 = new MethodoverridingChild();
		obj2.method1("Atul", 402);
		obj2.method2();
		obj2.method3();
		obj2.method10("P", 30);
		obj2.method10("S", 1, 2);
		
		

	}

}
