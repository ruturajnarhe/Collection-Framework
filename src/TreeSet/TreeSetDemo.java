package TreeSet;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		
		
		// Properties-
		// TreeSet is not an index based data-structure
		// TreeSet does not follows insertion order
		// TreeSet follows the sorting order
		// TreeSet is non-synchronized data-structure
		
		ts.add(30);
		ts.add(20);
		ts.add(50);
		ts.add(60);
		ts.add(10);
		ts.add(40);
		
		
		// TreeSet cannot stores the duplicate elements
		// ts.add(40);
				
		
		// Null values cannot be instead in TreeSet
		// ts.add(null);
		
		
		// TreeSet stores the homogeneous elements i.e. same data-types
		// ts.add("Ruturaj");
		
		System.out.println(ts);
	}

}
