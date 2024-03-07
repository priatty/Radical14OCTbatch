package AccessSpecifiers.A;

public class MyPublicPrivateAS {
	
	public int i= 10;
	private int j=20;
	
	public void method1(){
		
		System.out.println("In Method 1");
	}
	
    private void method2(){
	   
	   System.out.println("In Method 2");
   }
    
    public static void main (String [] args){
    	
    	MyPublicPrivateAS obj = new MyPublicPrivateAS();
    	
    	obj.method1();
    	obj.method2();
    }
}
