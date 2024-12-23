package hashTable;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht = new Hashtable();
		
		
		// Properties-
		// Hashtable is the direct implemented class of map interface
		// It is a legacy class and was introduce in JDK 1.0 version
		// Hashtable underline data-structure is hashtable
		// Hashtable contains the data in key-value pair & each and every key-value pair is known as entry
		// In hashtable keys should be always be unique but values can be duplicate
		// Hashtable can store heterogeneous elements or different types of elements at the key position
		// We cannot store null value in hashtable
		// Hashtable does not follows the insertion and sorting order
		// Hahstable are synchronized data-structure 
		// Initial capacity of hashtable is 11
		
		ht.put(106, "Deepak");
		ht.put(102, "Kamal");
		ht.put(108, "Ravi");
		ht.put(117, "Rahul");
		
		System.out.println(ht);
	}

}
