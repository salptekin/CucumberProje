package day42lambdadt;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Chris");
		list.add("Tucker");
		
		//Print the number of characters of every element on the console by using "Functional Programming"
		list.stream()	
		    .map(t->t + " = " + t.length())
		    .forEach(t->System.out.println(t));
		
		System.out.println();
		
		//Print the number of characters of elements which have more than 5 characters on the console 
		//by using "Functional Programming"
		list.stream()
		    .filter(t->t.length()>5)
		    .map(t->t + "=" + t.length())
		    .forEach(t->System.out.println(t));
		
		System.out.println();

		//Print the total number of characters of all elements
		System.out.println(list.stream()
		                       .map(t->t.length())
		                       .reduce(0, (t, u)->t+u));
		
		/*
		 1)Add "!" to the end of every element
		 2)Find the total number of characters which contain "k"
		 3)Use "Functional Programming"
		*/
		
		int result = list.stream()				
		                 .map(t->t + "!")
		                 .filter(t->t.contains("k"))
		                 .map(t->t.length())
		                 .reduce(0, (t,u)->t+u);
		System.out.println(result);//20
		
		/*
		 Find the multiplication of the length of every element which is starting with "A"
		*/
		int result1 = list.stream()
						  .filter(t->t.startsWith("A"))
						  .map(t->t.length())
						  .reduce(1, (t,u)->t*u);
		
		System.out.println(result1);//18
		
		/*
		 Concatenate all elements
		 Print the result
		*/
		String result2 = list.stream()
		                     .reduce("", (t,u)->t+u);	
		System.out.println(result2);//AliMarkJacksonAmandaChrisTucker
		
		/*
		 Print all elements in natural order
		*/
		list.stream()
		    .sorted()
		    .forEach(t->System.out.print(t + " "));//Ali Amanda Chris Jackson Mark Tucker
		
		System.out.println();
		
		/*
		 Print the elements whose lengths are less than 6 in alphabetical order
		*/
		list.stream()
		    .filter(t->t.length()<6)
		    .sorted()
		    .forEach(t->System.out.print(t +" "));
		
		System.out.println();
		
		/*
		 Print the minimum value of the lengths of the elements
		*/
		int result3 = list.stream()
		                  .map(t->t.length())
		                  .reduce(Integer.MAX_VALUE, (t,u) -> t<u ? t : u);
		System.out.println(result3);//3
		
		/*
		 Print the maximum value of the lengths of the elements
		*/
		int result4 = list.stream()
                .map(t->t.length())
                .reduce(Integer.MIN_VALUE, (t,u) -> t>u ? t : u);
        System.out.println(result4);//7

	}

}
