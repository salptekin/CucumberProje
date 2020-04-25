package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda09 {

	public static void main(String[] args) {
		// Print the square of all elements in "a new list" by using "Functional" programming
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
		
		System.out.println(squareList(list));

	}
	
	public static List<Integer> squareList(List<Integer> list){
		return list.stream()
				   .map(t->t*t)
				   .collect(Collectors.toList());
	}
	
	//Note: If a method returns Stream<T> it is Intermediate Operation
	//      If a method returns something different from Stream<T> it is Terminal Operation

}
