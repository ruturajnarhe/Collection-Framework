package treeMap;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap map = new TreeMap();
		
		
		// Properties-
		// It is an implemented class of navigable map but it is inherits the properties of sorted map & map interface
		// TreeMap underline data-structure is Red-Black tree
		// We store the data in key-value pair in which keys should be unique but values can be duplicate
		// TreeMap does not follows the insertion order but follows the sorting order w.r.t. keys
		// It can store homogeneous & heterogeneous elements
		// TreeMap cannot store null values
		// TreeMap is non-synchronized data-structure
		
		map.put(106, "Deepak");
		map.put(103, "Amit");
		map.put(107, "Kamal");
		map.put(102, "Deepesh");
		map.put(108, "Rahul");
		map.put(101, "Ravindra");
		
		System.out.println(map);
	}

}
