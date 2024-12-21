package LinkedList;

import java.util.Deque;
import java.util.Iterator;

public class LinkedListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList ll1 = new LinkedList();
		
		
		// LinkedList contains collection, List, Dequeue methods
		
		ll1.add("Ruturaj");
		ll1.add("Rahul");
		ll1.add("Ruturaj");
		ll1.add(null);
		ll1.add(null);
		ll1.add(105);
		ll1.add('R');
		ll1.add("Avishakr");
		
		
		ll1.addFirst("Ravindra");
		ll1.addLast("Chetan");
		
		
		System.out.println(ll1);
		
		System.out.println(ll1.getFirst());
		System.out.println(ll1.getLast());
		
		System.out.println(ll1.removeFirst());
		System.out.println(ll1.removeLast());
		
		System.out.println(ll1);
	}

}

interface Collection {
	boolean add(Object obj);
	boolean addAll(Collection c);
	
	boolean remove(Object obj);
	boolean removeAll(Collection c);
	
	void clear();
	
	boolean contains(Object obj);
	boolean containsAll(Collection c);
	
	boolean isEmpty();
	
	int size();
	
	Iterator iterator();
	
//	etc....
}

interface List extends Collection {
	boolean add(int index, Object obj);
	boolean addAll(int index, Collection c);
	
	Object get(int index);
	
	Object remove(int index);
	
	Object set(int index, Object newobj);
	
	int indexOf(Object obj);
	int lastIndexOf(Object obj);
	
//	etc...
}

// abstract class LinkedList implements List, Deque {
// 	public void addFirst(Object obj) {
		
// 	}
// 	public void addLast(Object obj) {
		
// 	}
	
// 	public Object getFirst() {
	
// 	}
// 	public Object getLast() {
		
// 	}
	
// 	public Object removeFirst() {
		
// 	}
// 	public Object removeLast() {
		
// 	}
	
// }
