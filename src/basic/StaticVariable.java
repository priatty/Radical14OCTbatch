package basic;

public class StaticVariable {
	//Check memory by removing static keyword
	static int var=0;
	
	StaticVariable(){
		
		var++;
		System.out.println(var);
		
	}
	
	public static void main (String[] args) {
		
		 StaticVariable obj1 = new  StaticVariable();
		 StaticVariable obj2 = new  StaticVariable();
		 StaticVariable obj3 = new  StaticVariable();
		 
	}
		 
	}

