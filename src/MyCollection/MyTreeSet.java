package MyCollection;

import java.util.TreeSet;

public class MyTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<String> obj = new TreeSet<String>();
		obj.add("Soumya");
		obj.add("Priyanka");
		obj.add("Priyanka");
		obj.add("Neha");
		obj.add("Apurva");
		obj.add("Apurva");
		
		
		System.out.println("Values =" + obj.toString());
	}

}
