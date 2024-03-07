package exceptionHandling;

public class MythrowException {
	
	public static void method1() {
		
		System.out.println("Start Of Method 1");
		throw new ArithmeticException("Error");
		//System.out.println("Start Of Method 1");
	}

	public static void main(String[] args) {
		try{
		method1();
	    }catch( ArithmeticException e ) {
	    	
	    	System.out.println("Cought the Exception");
	    }
		System.out.println("End of Main Method ");
} 
}