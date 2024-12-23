package treeMap;

import java.util.TreeMap;

public class TreeMapMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map = new TreeMap();
		
		map.put(106, "Deepak");
		map.put(103, "Amit");
		map.put(107, "Kamal");
		map.put(102, "Deepesh");
		map.put(108, "Rahul");
		map.put(101, "Ravindra");
		
		System.out.println(map);
		
		// Returns a key-value mapping associated with the least key greater than or equal to the given key
		System.out.println(map.ceilingEntry(104));
		
		// Returns true if this map contains a mapping for the specified key
		System.out.println(map.containsKey(103));
		
		// Returns true if this map maps one or more keys to the specified value
		System.out.println(map.containsValue("Kamal"));
		
		// Returns a key-value mapping associated with the least key in this map, or null if the map is empty
		System.out.println(map.firstEntry());
		
		// Returns a key-value mapping associated with the greatest key less than or equal to the given key
		System.out.println(map.floorEntry(108));
		
		// Returns the value to which the specified key is mapped,or null if this map contains no mapping for the key
		System.out.println(map.get(103));
		
		// Returns a view of the portion of this map whose keys are strictly less than to Key
		System.out.println(map.headMap(102));
		
		// Returns a key-value mapping associated with the least key strictly greater than the given key
		System.out.println(map.higherEntry(102));
		
		// Returns true if this map contains no key-value mappings
		System.out.println(map.isEmpty());
		
		// Returns a Set view of the keys contained in this map
		System.out.println(map.keySet());
		
		// Returns a key-value mapping associated with the greatest key in this map
		System.out.println(map.lastEntry());
		
		// Removes and returns a key-value mapping associated with the least key in this map
		System.out.println(map.pollFirstEntry());
		// Removes and returns a key-value mapping associated with the greatest key in this map
		System.out.println(map.pollLastEntry());
		
		System.out.println(map);
		
		// Removes the mapping for this key from this TreeMap if present
		System.out.println(map.remove(102));
		
		// Replaces the entry for the specified key only if it is currently mapped to some value
		System.out.println(map.replace(103, "aaa"));
		
		// Returns the number of key-value mappings in this map
		System.out.println(map.size());
		
		// Returns a view of the portion of this map whose keys range from fromKey, inclusive, to toKey, exclusive
		System.out.println(map.subMap(103, 107));
		
		System.out.println(map);
		
		// Removes all of the mappings from this map.The map will be empty after this call returns
		map.clear();
		System.out.println(map);
	}

}
