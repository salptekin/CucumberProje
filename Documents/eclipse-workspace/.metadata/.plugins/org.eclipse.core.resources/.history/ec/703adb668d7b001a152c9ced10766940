package lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda04 {

	public static void main(String[] args) {
		//Print the squares of the number of characters in the list [Ali, Mark, Jackson, Amanda, Chris, Tucker] by Functional Programming
		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Chris");
		list.add("Tucker");

		printTheNumberOfElementsInListByFunctional01(list);

	}
	
	public static void printTheNumberOfElementsInListByFunctional01(List<String> list) {		
		list.stream()                                                              
		    .map(t->t + " ==> " + t.length())   
		    .forEach(System.out::println); 
    }

}
