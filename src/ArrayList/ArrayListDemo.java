package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Initial capacity of ArrayList is 10.
//		ArrayList current capacity is full then arraylist increases its capacity by 50% of the current size
		ArrayList al1 = new ArrayList();
		

//		ArrayList can store different data types or hetrogeneous data types
//		ArrayList can store duplicate values
//		ArrayList can store any number of null values
//		ArrayList follows the insertion order
//		ArrayList does not follows sorting order
//		ArrayList are non-syncronized 
		
//		Time complexity of arrayList at add time O(1) and resized the arraylist then time complexity is O(n);
		al1.add(0, 10);
		al1.add(1, "ruturaj");
		al1.add(2, 'c');
		al1.add(3, 40.034);
		al1.add(4, 50);
		al1.add(5, 50);
		al1.add(6, null);
		al1.add(7, null);
		
//		Time complexity of ArrayList at get time O(1)
		System.out.println(al1.get(3));
		
//		Time complexity of ArrayList at set time O(1)
		System.out.println(al1.set(4, 70));
		
		System.out.println(al1.indexOf(null));
		
		System.out.println(al1);
		
		System.out.println("---------------------------------");
		
		Iterator itr = al1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
