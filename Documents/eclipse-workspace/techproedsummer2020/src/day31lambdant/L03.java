package day31lambdant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class L03 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Ali");
		list.add("Mark");
        System.out.println(list);
        
        //Sort the list elements in natural order by using structured programming
        //Collections.sort(list);
        //System.out.println(list);//[Ali, Ali, Amanda, Jackson, Mark, Mark]
        
        //Sort the list elements in natural order by using functional programming
        list.stream()
            .sorted()
            .forEach(t->System.out.print(t + " "));//Ali Ali Amanda Jackson Mark Mark  
        
        System.out.println();
        
        //How to get distinct elements from a list
        list.stream()
            .distinct()
            .forEach(t->System.out.print(t + " "));
              
        System.out.println();
        
        //Print distinct elements in natural order on the console
        list.stream()
            .distinct()
            .sorted()
            .forEach(t->System.out.print(t + " "));
        
        System.out.println();
        
        //Print all elements sorted according to the length
        list.stream()
            .distinct()
            .sorted(Comparator.comparing(t->t.length()))
            .forEach(t->System.out.print(t + " "));
        
        System.out.println();
        
        //Print all elements sorted according to the last character
        list.stream()
            .distinct()
            .sorted(Comparator.comparing(t-> t.charAt(t.length()-1)))
            .forEach(t-> System.out.print(t + " "));  
        
        System.out.println();
        
        /*
         1) If a method returns "stream" it is called "intermediate method".
            After intermediate methods you can use another methods.
         2) If a method does not return "stream" it is called "terminal method".
            After terminal methods you cannot use another methods.  
         3) collect() method collects the stream elements then you convert stream 
            to a list or to a map   
         */
        
        //Print all elements in reverse order in a list
        System.out.println(list.stream()
                               .distinct()     
                               .sorted(Comparator.reverseOrder())       
                               .collect(Collectors.toList()));

	}

}
