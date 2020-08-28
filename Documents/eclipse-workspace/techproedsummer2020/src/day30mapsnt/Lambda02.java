package day30mapsnt;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {

	public static void main(String[] args) {
		//Print the number of characters for every element in the list 
		//[Ali, Mark, Jackson, Amanda, Chris, Tucker] by Functional Programming
		
		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Chris");
		list.add("Tucker");
		
		numOfCharactersInElements(list);

	}
	
	public static void numOfCharactersInElements(List<String> list) {
		list.stream()
		    .map(t -> t + "= " + t.length())
		    .forEach(t -> System.out.println(t +" "));
	}
	
	//Homework: Find the total number of characters in the elements of the list

}
