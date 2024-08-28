package CollectionDemo;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(100);  // return boolean type
		al.add(200);
		al.add(300);
		System.out.println(al);
		System.out.println(al.isEmpty());  // return boolean type
//		al.clear();
		
		al.remove(0);  // remove element at index position
//		System.out.println(al);
		
		ArrayList al2 = new ArrayList();
		al2.add("aaa");  // return boolean type
		al2.add("bbb");
		al2.add("ccc");
		System.out.println(al2);
		
		al.addAll(al2);  // return boolean type
//		System.out.println(al);
		
		al2.remove("aaa"); // remove obj element
		System.out.println(al2);
	}

}
