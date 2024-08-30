package CollectionDemo;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		
		v.add(100);
		v.add("ruturaj");
		v.add(15.5);
		
		System.out.println(v);
		
		// Enumeration cursor can be used only with legacy classes. i.e. (vector & stack)
		// introduce in jdk 1.0 version
		// retrive only in forward direction
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
