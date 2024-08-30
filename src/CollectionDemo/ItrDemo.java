package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		
		l.add(10);
		l.add("ruturaj");
		l.add("rahul");
		
		System.out.println(l);
		
		Iterator itr = l.iterator();
		// hasNext() method check kya next element hai, hai to return true.
		while(itr.hasNext()) { 
			// next() return the present element
			System.out.println(itr.next());
		}
	}

}
