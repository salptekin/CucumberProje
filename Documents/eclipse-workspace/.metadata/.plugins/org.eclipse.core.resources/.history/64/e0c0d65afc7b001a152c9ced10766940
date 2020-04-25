package lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda07 {

	public static void main(String[] args) {
		// Print elements after sorting on the console in the list by using "Functional" programming
		// Print all distinct elements on the console in the list by using "Functional" programming
		// Print all distinct elements after sorting on the console in the list by using "Functional" programming
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		
		sortedElements(list);
		System.out.println("====");
		distinctElements(list);
		System.out.println("====");
		sortedDistinctElements(list);
		
	}
	
	public static void sortedElements(List<Integer> list) {
	       list.stream()
			   .sorted()// To sort elements use sort()
			   .forEach(System.out::println);
    }
	
	public static void distinctElements(List<Integer> list) {
		       list.stream()
				   .distinct()// To get distinct elements, duplicate elements are printed just once
				   .forEach(System.out::println);
	}
	
	public static void sortedDistinctElements(List<Integer> list) {
	       list.stream()
			   .distinct()// To get distinct elements, duplicate elements are printed just once
			   .sorted()
			   .forEach(System.out::println);
    }
}
