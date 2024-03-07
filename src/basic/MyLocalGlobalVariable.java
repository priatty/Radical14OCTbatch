package basic;

public class MyLocalGlobalVariable {
	
	int i= 10;
	String name = " Priyanka" ;
	
	public void method1 (){
		
		int j= 30;
		int i= 40;
		String name = "Atul";		
		System.out.println("Print j="+ j);
		System.out.println("Print i="+ i);
		System.out.println("Print name is =" + name);
		
	}

	public void method2 (){
		
		System.out.println("Print i =" +i);
		System.out.println("My Good Name is =" + name );
	}
}
