package oopsconcept.Constructor;

public class MyConstructorNew {
	
	
	int i;
	String name;
	String address;
	
	MyConstructorNew (int num1, String Str1){
		System.out.println("In Constructor");
		i= num1;
		name= Str1;
	
	}
	

	MyConstructorNew (String Str1, int num1){
		System.out.println("In Constructor");
		i= num1;
		name= Str1;
		
	}
	
	MyConstructorNew (String Str1, String add){
		System.out.println("In Constructor");
		name = Str1;
		address = add;
		
	}
	
	MyConstructorNew (int num1,String Str1, String add){
		System.out.println("In Constructor");
		i= num1;
		name = Str1;
		address = add;

	}

}
