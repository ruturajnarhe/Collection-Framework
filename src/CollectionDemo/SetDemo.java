package CollectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set is not an index based order , It stores the data according to the
		// hashcode values
		Set s = new HashSet();

		// Set does not follows the insertion order
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(400);

		// Set does not allow to store duplicate elements
		s.add(300);
		s.add(200);

		// Set can store only one null value
		s.add(null);
		s.add(null);

		System.out.println(s);

		Iterator itr = s.iterator();

		// iterator one by one value
		// hasNext() returns true if the iteration has more elements
		while (itr.hasNext()) {
			// itr.next() returns the next element in the iteration
			System.out.println(itr.next()); 
		}
	}

}
