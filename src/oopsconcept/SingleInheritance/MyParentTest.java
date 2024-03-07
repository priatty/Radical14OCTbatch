package oopsconcept.SingleInheritance;

public class MyParentTest {
 public static void main (String[] args) {
	 
	 Myparent obj1 = new Myparent();
	 
	 obj1.method1();
	 obj1.method2();
	 
 
	 MyChild obj2 = new MyChild();
	 
	 obj2.method3();
	 obj2.method4();
	 obj2.method1();
	 obj2.method2();
 
 
 }
}