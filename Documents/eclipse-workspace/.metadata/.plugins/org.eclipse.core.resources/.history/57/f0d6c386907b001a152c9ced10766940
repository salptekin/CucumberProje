package lambda2020;

import java.util.ArrayList;
import java.util.List;

public class Lambda04 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Chris");
		list.add("Tucker");
		
		//Use Functional Code 
		//Get the elements whose lengths are more than 5 and print their lengths on the console.
		list.stream()
		    .filter(t->t.length()>5)
		    .map(t->t.length() + " ")
		    .forEach(System.out::print);
		
		System.out.println("====");
		//Get the elements which contain "i"
		list.stream()
		    .filter(t->t.contains("i"))
		    .forEach(System.out::print);
	}

}
