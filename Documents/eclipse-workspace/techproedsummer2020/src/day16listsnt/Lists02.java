package day16listsnt;

import java.util.ArrayList;
import java.util.List;

public class Lists02 {

	public static void main(String[] args) {
		// How to get the number of elements in a list
		
		//Lists do not accept primitive data types for elements
		//because of that we use wrapper classes instead of primitives
		List<Integer> l1 = new ArrayList<>();
		
		//For arrays we have "length" to find the number of elements
		//For lists we have "size()" to find the number of elements
		//Because of that when we talk about the number of elements in Lists
		//we tell size.
		System.out.println(l1.size());//0
		
		l1.add(11);
		l1.add(12);
		l1.add(13);
		System.out.println(l1.size());//3
		
		//How to check if a list is empty or not
		//isEmpty() returns boolean, if it is empty it return true otherwise
		//it returns false
		System.out.println(l1.isEmpty());//false
		
		//How to remove an element from a list
		
		//remove() with index removes the element in a specific index
		//remove() with index returns the removed element
		System.out.println(l1.remove(0));//it will remove the first element which is 11
		System.out.println(l1);//[12, 13]
		
		//remove() with element removes the specific element if the element 
		//is not integer because if it is integer Java thinks it is index.

	}

}
