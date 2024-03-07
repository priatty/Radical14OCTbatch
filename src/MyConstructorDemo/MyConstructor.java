package MyConstructorDemo;

public class MyConstructor {
	
	//parametarized constructors
	// sequence, number of parameters,datatype
	//respective  constructor will be call
	//constructor overloading
	
	int i;
	String name;
	String address;
	
   MyConstructor(int num1, String str1){
		System.out.println("In constructor");
		i=num1;
		name= str1;
		
	}
   
   MyConstructor(String str1, int num1){
 		System.out.println("In constructor");
 		i=num1;
 		name= str1;
   }
   
   MyConstructor( String str1, String add){
		System.out.println("In constructor");
		name= str1;
		address= add;
   }
		
   MyConstructor( int num1, String str1, String add){
		System.out.println("In constructor");
		i = num1;
		name= str1;
		address= add;
   

}
}
