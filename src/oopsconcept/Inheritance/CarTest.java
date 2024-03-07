package oopsconcept.Inheritance;

public class CarTest {

	public static void main(String[] args) {
	
		//Car obj1 = new Car();
		//Maruti obj2 = new Maruti();
		//Brezza obj3 = new Brezza();
		
		Car obj = new Maruti();
		
		obj.speed();
		obj.wheels();
		obj.colours();
		obj.engine();
		
		Maruti obj1 = new Brezza();
		obj1.speed();
		obj1.colours();
		obj1.engine();
		obj1.feature();
		
		Car obj3 = new Brezza();
		obj3.speed();
		obj3.wheels();
		obj3.colours();  // brezza has colour method from maruti (Because Brezza Extends Maruti)
		obj3.engine();
		
		//Brezza obj = new Car();   //it is not possible because all car can not have features of blezza	

	}

}
