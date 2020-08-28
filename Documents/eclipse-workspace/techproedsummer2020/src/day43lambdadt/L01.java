package day43lambdadt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L01 {
	
	/*
						 				Warm Up - 10 Minutes
						 				
						 1)Create a package, name it as 'day43lambdadt'
						 2)Create a class, name it as 'L01'
						 3)Create an integer list which has 5 elements
						 4)Put the elements in natural order
						 5)Find the sum of the squares of the last 3 elements on the console.
						 6)Print the sum on the console
						 7)Use 'Functional Programming'
	*/

	public static void main(String[] args) {
         
		List<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(5);
		list.add(1);
		list.add(4);
		list.add(3);
		
		Collections.sort(list);
		
		int result = list.stream()
						 .filter(t->list.indexOf(t)>1)
						 .map(t->t*t)
						 .reduce(0, (t,u)->t+u);
		
		System.out.println(result);

	}

}
