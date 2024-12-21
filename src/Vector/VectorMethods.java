package Vector;

import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
		
		v.add(101);
		v.add("Ravindra");
		v.add("Chetan");
		v.add("Saurabh");
		v.add(345.6);
		v.add('r');
		
		// Vector contains List and Collection interface methods
		
		v.addElement("Avishkar");
		
		System.out.println(v);
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		v.removeElement("Chetan");
		System.out.println(v);
		
		v.removeElementAt(1);
		System.out.println(v);
		
		v.removeAllElements();
		System.out.println(v);
	}

}
