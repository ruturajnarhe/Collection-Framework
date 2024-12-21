package Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
		
		
		// Properties-
		// Vector is an index based data structure
		// Vector can store different data-types or heterogeneous data-types
		// Vector can store duplicate elements
		// Vector can store multiple null values
		// Vector follows insertion order
		// Vector does not follows sorting order
		// Vector are synchronized collection

		// Initial capacity of vector is 10 and if vector is full then capacity increase by double
		
		v.add(101);
		v.add("Ravindra");
		v.add("Chetan");
		v.add("Saurabh");
		v.add(345.6);
		v.add('r');
		
		System.out.println(v);
	}

}
