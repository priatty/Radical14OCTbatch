package oopsconcept.Interface;

public class MyInterfaceClass implements MyInterfaceParent{

	@Override
	public void method1() {
		System.out.println("In method 1");
		
	}

	@Override
	public void method2() {
		System.out.println("In method 2");
	}
	
	public void method3() {
		System.out.println("In Method 3");
	}

}
