package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		
		// Properties-
		// HashSet not an index based data structure, they store the elements according to their "hashcode"
		// HashSet does not store duplicate elements
		// HashSet does not store multiple null values
		// HashSet can store different data-types
		// HashSet does not follows the insertion order
		// HashSet does not follows sorting order
		// HashSet are non-synchronized data structure
		
		
		
		hs.add("Ruturaj");
		hs.add("Rahul");
		hs.add("Ravindra");
		hs.add("Rohit");
		hs.add(null);
		hs.add("Ruturaj");
		hs.add(null);
		hs.add(10);
		hs.add(30);
		hs.add(50);
		
		System.out.println(hs);
		
		Iterator itr = hs.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
