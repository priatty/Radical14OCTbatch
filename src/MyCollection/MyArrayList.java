package MyCollection;

import java.util.ArrayList;

public class MyArrayList {
	
	public static void main (String[] args) {
	
	ArrayList<String> obj = new ArrayList<String>();
	obj.add("Soumya");
	obj.add("Priyanka");
	obj.add("Neha");
	obj.add("Apurva");
	obj.add("Prathamesh");
	obj.add("Neha");
	
	for (int i =0; i< obj.size(); i++) {
		System.out.println("values = "+ obj.get(i));
	}
}
}
