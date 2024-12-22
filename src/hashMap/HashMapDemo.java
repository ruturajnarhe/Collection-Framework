package hashMap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		
		
		// Properties-
		// HashMap is an implemented class of Map interface
		// HashMap stores the value in key-value pair
		// In HashMap keys should always be unique but values can duplicate
		// HashMap contains maximum one null value in key but it can store multiple null values in values
		// HashMap can store heterogeneous elements 
		// HashMap does not follows the sorting and insertion order
		// HashMap is non-synchronized data-structure
		// HashMap capacity means the number of buckets in the hash table
		// When we create HashMap, initial capacity will be 16 which we can changed
		// Default load factor of HashMap is .75
		
		
		hm.put(101, "Deepak");
		hm.put(102, "Amit");
		hm.put(103, "Rahul");
		hm.put(104, "Kamal");
		hm.put(null, "aaa");
		hm.put(105, null);
		hm.put(106, null);
		
		System.out.println(hm);
	}

}
