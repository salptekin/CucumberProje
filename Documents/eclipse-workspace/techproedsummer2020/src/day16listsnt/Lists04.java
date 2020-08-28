package day16listsnt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists04 {

	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<>();
		l1.add("Miami");
		l1.add("Tampa");
		l1.add("Jacksonville");
		System.out.println(l1);//[Miami, Tampa, Jacksonville]
		
		//How to check if a specific element is exist in the list
		System.out.println(l1.contains("Tampa"));//boolean ==> true
		System.out.println(l1.contains("Tallahasse"));//boolean ==> false
		
		//How to sort list elements in ascending order
		
		//Memorize the following syntax
		Collections.sort(l1);
		System.out.println(l1);//[Jacksonville, Miami, Tampa]
		
		List<String> l2 = new ArrayList<>();
		l2.add("M");
		l2.add("T");
		l2.add("J");
		
		//How to add a list to another list
		l1.addAll(l2);
		System.out.println(l1);//[Jacksonville, Miami, Tampa, M, T, J]
		System.out.println(l2);//[M, T, J]
		
		l1.addAll(1, l2);
		System.out.println(l1);//[Jacksonville, M, T, J, Miami, Tampa, M, T, J]
		System.out.println(l2);//[M, T, J]

	}

}
