package basic;

public class MyReturnTypeOfMethod {
	
	public int addition(int i, int j) {
		int k= i+j;
		return k;
		
		
	}
	
	public String method1(String name)  {
		
		String returnValue;
		if(name.equals("Anil")){
			
			returnValue= name+ " is a trainer";
			
		}else {
			
	     	returnValue= name + " is a Student";
		}
		return returnValue;
	}

}
