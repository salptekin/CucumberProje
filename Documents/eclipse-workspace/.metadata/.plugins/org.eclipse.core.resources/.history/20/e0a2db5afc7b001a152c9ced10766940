package lambda2020;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(13);
		list.add(10);
		list.add(14);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(5);
		list.add(13);
		list.add(16);
		System.out.println(list); // [13, 10, 14, 5, 7, 3, 5, 13, 16]
		
		//Use structured code to print evens on the console
		for(int w:list) {
			if(w%2==0) {
				System.out.print(w + " "); // 10 14 16
			}
		}
		
		System.out.println("====");
		//Use Type 3 ==> Method Reference ==> Use Java methods
		list.stream()
		    .filter(t->t%2==0) //filter() method accepts the elements if the right part (t%2==0) is true
		    .forEach(System.out::print); // 10 14 16
		
		System.out.println("====");
		//Use Type 3 to print the elements which are divisible by 3
		list.stream()
		    .filter(t->t%3==0)
			.forEach(System.out::print);		
	}
}
