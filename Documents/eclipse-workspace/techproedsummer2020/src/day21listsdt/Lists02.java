package day21listsdt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists02 {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(11);
		l1.add(12);
		System.out.println(l1);
		
		List<Integer> l2 = new ArrayList<>();
		l2.add(12);
		l2.add(11);
		System.out.println(l2);
		
		List<Integer> l3 = new ArrayList<>();
		l3.add(12);
		l3.add(11);
		System.out.println(l3);
		
		// How to check if two lists are equal to each other
		System.out.println(l1.equals(l2));//Returns boolean ==> false
		System.out.println(l2.equals(l3));//Returns boolean ==> true
		
		//How to convert a List to an Array
		Integer arr[] = l1.toArray(new Integer[0]);
		System.out.println(Arrays.toString(arr));//[11, 12]
		
		//How to convert an Array to a List
		String s[] = {"A", "C", "B"};	
		List<String> l4 = Arrays.asList(s);
		System.out.println(l4);//[A, C, B]
	
	}

}
