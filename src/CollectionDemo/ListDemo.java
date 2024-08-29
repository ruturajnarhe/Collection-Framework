package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// List is a index based data structure
		List l = new ArrayList();

		// add element in index based
//		l.add(1, 10); // Exception in thread "main" java.lang.IndexOutOfBoundsException

		// List follows insertion order
		l.add(10);
		l.add(1, 20);
		l.add(30);
		l.add(40);

		// List can store duplicate elements
		l.add(30);
		l.add(20);

		// List can store any number of null values
		l.add(null);
		l.add(null);
		System.out.println(l);

		// Returns an iterator over the elements in this list in proper sequence
		Iterator itr = l.iterator();

		// iterator one by one value
		// hasNext() returns true if the iteration has more elements
		while (itr.hasNext()) {
			// itr.next() returns the next element in the iteration
			System.out.println(itr.next());
		}
		
		// Returns an iterator over the elements in this list in proper sequence
//		ListIterator litr = l.listIterator();
//		while(litr.hasNext()) {
//			System.out.println(litr.next());
//		}
	}

}
