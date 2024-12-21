package LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		
		
		
		// LinkedList are index based data-structure
		// LinkedList can store heterogeneous elements or different data types 
		// LinkedList can store duplicate elements
		// LinkedList can store multiple null values
		// LinkedList follows insertion order
		// LinkedList does not follows sorting order
		// LinkedList has non-synchronized collection
		
		ll.add("Ruturaj");
		ll.add("Rahul");
		ll.add("Ruturaj");
		ll.add(null);
		ll.add(null);
		ll.add(105);
		ll.add('R');
		
		System.out.println(ll);
	}

}
