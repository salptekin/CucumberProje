package day28setsnt;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LHS01 {
	
	/*
	 1)LinkedHashSet is a Set so no duplication.
	 2)LinkedHashSet puts the elements in insertion order.
	 3)sort() method does not run for LinkedHashSet 
	*/

	public static void main(String[] args) {
		
		LinkedHashSet<String> lSet = new LinkedHashSet<>();
		lSet.add("A");
		lSet.add("B");
		lSet.add("D");
		lSet.add("C");	
		System.out.println(lSet);

	}

}
