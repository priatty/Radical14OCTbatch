package exceptionHandling;

public class MyTryCatchFinally {

	public static void main(String[] args) {
	   
		System.out.println("Start of Program");
		int i=10;
		int k=0;
		
		try {
			i=10/0;
			System.out.println("Start Of Try");
	        k = i/0;
	        System.out.println("End  Of Try");
		}catch(ArithmeticException e) {
			
			System.out.println("In catch 1" + e.getMessage());	
		}catch(NullPointerException e) {
			System.out.println("In cathch 2 " + e.getMessage());
		}finally {
			System.out.println("In Finally");
		}
		System.out.println("Value of k =" +k);
		System.out.println("Value of i =" +i);
		System.out.println("End of Program");

	}

}
