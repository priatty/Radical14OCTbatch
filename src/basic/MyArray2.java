package basic;

public class MyArray2 {

	public static void main(String[] args) {
		
		int myarray[] = new int[4];
		myarray[0]=10;
		myarray[1]=20;
		myarray[2]=30;
		myarray[3]=40;
		
		System.out.println("Array Value = " + myarray[0]);
		
		int lengh = myarray.length;
		System.out.println("Array length is = " + lengh);
		
		for (int i=0; i<lengh; i++)
			
		{
			System.out.println( "Values from Array = "+ myarray [i]);
		}
		
		
		
		
		

	}

}
