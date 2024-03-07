package oopsconcept.polymorphism;

public class MethodoverridingChild extends MethodoverridingParent {
	
	public void method1( String name, int empId){
		System.out.println("Child Class Name =" + name);
		System.out.println("Child Class empId =" + empId);
	}
	public void method3(){
        System.out.println("In Method 3");
}
	public void method10( String s, int i){
		
		System.out.println(" Technology");
	}
} 