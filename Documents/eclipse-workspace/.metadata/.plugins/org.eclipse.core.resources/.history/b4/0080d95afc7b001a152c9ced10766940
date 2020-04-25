package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda08 {

	public static void main(String[] args) {
		// Print all elements after sorting on the console in the list by using "Functional" programming
		// Print all distinct elements after reverse sorting on the console in the list by using "Functional" programming
		// Print all elements after sorting according to the length on the console in the list by using "Functional" programming
		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Jackson");
		list.add("Jackson");
		list.add("Tucker");
		list.add("Christ");
		
		naturalSortedElements(list);
		System.out.println("====");
		reverseSortedElements(list);
		System.out.println("====");
		lengthSortedElements(list);

	}
	
	public static void naturalSortedElements(List<String> list) {
	       list.stream()
			   .sorted(Comparator.naturalOrder())// To sort elements you may also use sorted(Comparator.naturalOrder()) method
			   .forEach(System.out::println);
    }
	
	public static void reverseSortedElements(List<String> list) {
	       list.stream()
			   .distinct()// To get distinct elements, duplicate elements are printed just once
			   .sorted(Comparator.reverseOrder()) //To sort elements in reverse order, use sorted(Comparator.reverseOrder()) method
			   .forEach(System.out::println);
    }
	
	public static void lengthSortedElements(List<String> list) {
	       list.stream()
			   .distinct()// To get distinct elements, duplicate elements are printed just once
			   .sorted(Comparator.comparing(t->t.length())) //To define a rule to sort elements, use sorted(Comparator.comparing()) method
			   .forEach(System.out::println);
 }

}
