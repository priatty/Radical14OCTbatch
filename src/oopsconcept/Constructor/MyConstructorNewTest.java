package oopsconcept.Constructor;

public class MyConstructorNewTest {

	public static void main(String[] args) {
		
		 MyConstructorNew obj1 = new  MyConstructorNew(10, "Neha");
		 System.out.println(obj1.i);
		 System.out.println(obj1.name);
		 
		 MyConstructorNew obj2 = new  MyConstructorNew(101, "Prathmesh");
		 System.out.println(obj2.i);
		 System.out.println(obj2.name);
		 
		 
		 MyConstructorNew obj3 = new  MyConstructorNew("Priyanka", "Apurva");
		 System.out.println(obj3.name);
		 System.out.println(obj3.address);
	
	
		 MyConstructorNew obj4 = new  MyConstructorNew( 402 , "Priyanka", "Ajinkyatara Block-A402");
		 System.out.println(obj4.i);
		 System.out.println(obj4.name);
		 System.out.println(obj4.address);
	
}	    
}
