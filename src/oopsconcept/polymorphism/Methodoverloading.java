package oopsconcept.polymorphism;

public class Methodoverloading {
	
		public void createuser(){
			
			System.out.println( " In method 1");
		}
		
		public void createuser(String str){
			
			System.out.println("In method 1 =" + str);
		}
		
		public void createuser(String str, int i){
			
			System.out.println("In method 1 = " + str);
			System.out.println("In method 1 = " + i);
		}

		public void createuser( int i, String str ){
			
			System.out.println("In method 1 = " + str);
			System.out.println("In method 1 = " + i);

}
}
