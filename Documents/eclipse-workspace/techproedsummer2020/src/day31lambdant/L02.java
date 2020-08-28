package day31lambdant;

import java.util.ArrayList;
import java.util.List;

public class L02 {

	public static void main(String[] args) {
		// Total number of characters in the list [Ali, Mark, Jackson, Amanda, Chris, Tucker] 
		// by Functional Programming

		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Chris");
		list.add("Tucker");
        System.out.println(list);
		
		totalNumOfChars(list);

	}

	public static void totalNumOfChars(List<String> list) {

		System.out.println(list.stream()
				               .map(t -> t.length())
				               .reduce(0, (t, u) -> t + u));
	}

}
