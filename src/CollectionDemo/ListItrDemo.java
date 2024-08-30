package CollectionDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListItrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		
		l.add(10);
		l.add("ruturaj");
		l.add("rahul");
		
		ListIterator litr = l.listIterator();
		
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("----------------------------");
		
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
//		litr.add(100);
//		System.out.println(l);
		
		litr.set(200);
		System.out.println(l);
	}

}
