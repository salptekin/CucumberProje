package day32lambdant;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class L01 {
	
	/*
		                    <========= No Test Today ==========> 
		     
		WARM UP (10 Minutes)
		
		1) Create a package name it as "day32lambdant"
		2) Create a class name it as "L01"
		3) Create a String list which has 5 String elements. 
		4) 3 of them will start with the letter "A"
		5) If the elements are starting with the letter "A" and the length of the elements
		   is less than 5, print them in upper case in a list on the console.
   */

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Angie");
		list.add("Andy");
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		
		System.out.println(list.stream()
		                       .filter(t->t.startsWith("A"))
		                       .filter(t->t.length()<5)
		                       .map(String::toUpperCase)
		                       .collect(Collectors.toList()));

	}

}
