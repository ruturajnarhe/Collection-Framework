package Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		
		map.put(101, "Ruturaj");
		map.put(102, "Vinayak");
		map.put(103, "Ravindra");
		map.put(104, "Gaurav");
		
		System.out.println(map);
		
		System.out.println(map.containsKey(103));
		
		System.out.println(map.containsValue("Ruturaj"));
		
		System.out.println(map.get(102));
		
		System.out.println(map.isEmpty());
		
		System.out.println(map.remove(102));
		System.out.println(map);
		
		map.replace(103, "Chetan");
		
		System.out.println(map.size());
		
		map.clear();
		System.out.println(map);
	}

}
