package MyCollection;

import java.util.HashMap;
import java.util.Map.Entry;

public class MyHashMap {

	public static void main(String[] args) {
	
		HashMap<Integer, String> obj = new HashMap<Integer, String>();
		obj.put(101, "Flat1");
		obj.put(102, "Flat2");
		obj.put(103, "Flat3");
		obj.put(104, "Flat4");
		obj.put(101, "Flat5");
		
		String value =obj.get(101);
		System.out.println("============" + value);
		
		for( Entry<Integer, String> oneEntry : obj.entrySet()) {
			System.out.println("key = "+oneEntry.getKey() + "   And value =  "+oneEntry.getValue()    );
		}
		}
		
		

	}


