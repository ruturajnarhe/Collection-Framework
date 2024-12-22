package Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		
		
		//Properties-
		// Map does not inherits collection interface
		// Map stores data in key-value pair
		// In Map key should be unique but values can be duplicate
		// In Map we can store maximum one null value i key, but in values we can store any number of null values
		// Map does not follows the sorting and insertion order
		
		
		map.put(101, "Ruturaj");
		map.put(102, "Ravindra");
		map.put(103, "Gaurav");
		map.put(104, "Vinayak");
		map.put(null, "aaa");
		map.put(106, "Gaurav");
		
		// map.put(102, "Avishkar");
		
		// map.put(null, "bbb");
		
		System.out.println(map);
	}

}
