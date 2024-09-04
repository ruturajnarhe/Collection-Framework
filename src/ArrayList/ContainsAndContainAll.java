package ArrayList;

import java.util.ArrayList;

public class ContainsAndContainAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);

		System.out.println("Print ArrayList : " + al);

//		The contains method in ArrayList class is used to check if a specific element exists in the list
		System.out.println("to contains 15 : " + al.contains(15)); // return false
		System.out.println("to contains 20 : " + al.contains(20)); // return true

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(20);
		al1.add(40);
		al1.add(60);
		
//		The containsAll method in ArrayList class is used to check if the list contains all elements of a specified collection
		System.out.println("to containsAll : " + al1.containsAll(al)); // return false
		System.out.println("to containsAll : " + al.containsAll(al1)); // return true

	}

}
