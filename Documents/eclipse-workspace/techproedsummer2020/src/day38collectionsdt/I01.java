package day38collectionsdt;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	public static void main(String[] args) {
		
		//Another usage of Iterators
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("D");
		list.add("B");
		//System.out.println(list);//[A, C, D, B]
		
		//Update the list to [AX, CX, DX, BX]
		ListIterator<String> lit = list.listIterator();
		while(lit.hasNext()) {
			String el = lit.next();
			lit.set(el + "X");
		}
		System.out.println(list);
		
		//Print the elements on the console in reverse order
		
		/*
		 If you decide to use hasPrevious() and previous() methods you have to use hasNext() and next()
		 methods first to move the pointer to the end of the list.
		 */
		while(lit.hasPrevious()) {			
			Object el = lit.previous();			
			System.out.print(el + " ");
		}

	}

}
