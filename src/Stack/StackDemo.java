package Stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		
		
		// Properties-
		// Stack is the legacy class which was introduced in JDK 1.0 version
		// Stack is the child class of vector class which is present in java.util package
		// Stack class was designed on the basis of LIFO (Last In First Out)
		// Stack can be implemented on the basis of arrays, ArrayList, LinkedList or Vector
		// Stack is an index based data-structure
		
		
		// push() add element in stack 
		s.push("Saurabh");
		s.push("Akash");
		s.push(100);
		s.push(200);
		s.push('c');
		
		System.out.println(s);
		
		// pop() method remove the element in top of the stack
		System.out.println(s.pop());
		System.out.println(s);
		
		// Looks at the object at the top of this stack without removing it from the stack
		System.out.println(s.peek());
		
		// Returns the 1-based position where an object is on this stack
		System.out.println(s.search("Saurabh"));
		
		// Tests if this stack is empty
		System.out.println(s.empty());
	}

}
