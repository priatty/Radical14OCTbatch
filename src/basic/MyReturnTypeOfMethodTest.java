package basic;

public class MyReturnTypeOfMethodTest {

	public static void main(String[] args) {
	
		MyReturnTypeOfMethod obj = new MyReturnTypeOfMethod();
		
		int output = obj.addition(10 , 20);
		
		System.out.println("addition is =" + output);
		
		int newoutput = obj.addition(output, 30);
		
		System.out.println("New addtion is = "  +newoutput);
	
	    String value = obj.method1("Priyanka");
	    
	    System.out.println("Result is = " +value); 
	    
		
	}

}
