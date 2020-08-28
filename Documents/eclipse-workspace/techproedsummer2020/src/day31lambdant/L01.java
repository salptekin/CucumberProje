package day31lambdant;

import java.util.ArrayList;
import java.util.List;

public class L01 {
	
	/*
	                          <========= No Test Today ==========> 
	                           
	              WARM UP (10 Minutes)
	              
	 1) Create a package name it as "day31lambdant"
	 2) Create a class name it as "L01"
	 3) Create an integer list which has 5 elements. The elements will be random integers 
	    between 0(inclusive) and 9(inclusive). 
	    Note: Google to learn how to create random numbers in Java
	 4) Find the sum of squares of odd integer elements of the list by using Functional Programming.
	         
	*/

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<5; i++) {
		     list.add((int) (Math.random()*10));
		}
		System.out.println(list);
		
		int sum = list.stream()
		              .filter(t->t%2!=0)
		              .map(t->t*t)
		              .reduce(0, (t,u)->t+u);
		
		System.out.println("Sum of the squares of odd elements: " + sum);

	}

}
