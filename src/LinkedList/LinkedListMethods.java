package LinkedList;

import java.util.Deque;
import java.util.Iterator;

public class LinkedListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

abstract class LinkedList implements List, Deque {
	public void addFirst(Object obj) {
		
	}
	public void addLast(Object obj) {
		
	}
	
	public Object getFirst() {
	
	}
	public Object getLast() {
		
	}
	
	public Object removeFirst() {
		
	}
	public Object removeLast() {
		
	}
	
}
