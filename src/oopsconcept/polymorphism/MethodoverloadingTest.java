package oopsconcept.polymorphism;

public class MethodoverloadingTest {

	public static void main(String[] args) {
		//method overloading depends upon the three things
		//no. of parameters
		//type of parameters
		//sequence of parameters
		Methodoverloading obj = new Methodoverloading();
		
		obj.createuser();
		obj.createuser("Priyanka");
		obj.createuser(10, "Atul");
        obj.createuser("Samar", 5);
	}

}
