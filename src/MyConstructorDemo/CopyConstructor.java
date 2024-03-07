package MyConstructorDemo;

public class CopyConstructor {
	int i;
	CopyConstructor(int val){
		System.out.println("Normal Constructor");
		i=val;
	}
	
	CopyConstructor(CopyConstructor obj){
		System.out.println("Copy Constructor");
		i=obj.i;		
		
	}
			
	
}
