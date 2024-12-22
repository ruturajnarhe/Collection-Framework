package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class HashMapMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap();
		
		hm.put(101, "Deepak");
		hm.put(102, "Amit");
		hm.put(103, "Rahul");
		hm.put(104, "Kamal");
		hm.put(105, "bbb");
		
		
		System.out.println(hm);
		
//		Set set = hm.entrySet();
//		System.out.println(set);
//		
//		Iterator itr = set.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			Map.Entry entry = (Map.Entry) itr.next();
//			System.out.println(entry.getKey() + " -> " + entry.getValue());
//		}
		
		for(Map.Entry me : hm.entrySet()) {
			System.out.println(me.getKey() + " -> " + me.getValue());
		}
		
		System.out.println(hm.remove(103));
		System.out.println(hm);
		
		System.out.println(hm.containsKey(101));
		
		System.out.println(hm.containsValue("Amit"));
		
		System.out.println(hm.isEmpty());
		
		System.out.println(hm.replace(105, "aaa"));
		System.out.println(hm);
		
	}

}
