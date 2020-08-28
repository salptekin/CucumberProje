package day39collectionsdt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q01 {
	
	/*
	 1)Queue is an interface not a class so we cannot create object by using Queue
	   When you want to work on Queue you can create objects by using a)LinkedList class or
	   b)PriorityQueue class
	 2)In Queue every time elements are added to the end of the Queue, when you remove an element
	   every time it will be removed from the beginning of the Queue.  
	      FIFO ==> First In First Out 
	 3)Queue accepts "null" as an object   
	 */

	public static void main(String[] args) {
         
		Queue<String> q1 = new LinkedList<>();
		q1.add("Ali");
		q1.add("Brandon");
		q1.add("Tucker");
		q1.add("Chris");
		q1.add("Mark");
		q1.add(null);
		q1.add("Tucker");
		System.out.println(q1);//[Ali, Brandon, Tucker, Chris, Mark]
		
		q1.remove();
		System.out.println(q1);//[Brandon, Tucker, Chris, Mark, null, Tucker]
		
		q1.remove(null);
		System.out.println(q1);//[Brandon, Tucker, Chris, Mark, Tucker]
		
		List<String> list = new ArrayList<>();
		list.add("Brandon");
		list.add("Tucker");
		
		q1.removeAll(list);
		System.out.println(q1);//[Chris, Mark]
		
		//element() returns the first element without removing
		//If Queue is empty element() gives exception
		System.out.println(q1.element());//Chris
		System.out.println(q1);//[Chris, Mark]
		
		
		//poll() returns the first element after removing
		System.out.println(q1.poll());//Chris
		System.out.println(q1);//[Mark]
		
		//peek() returns the first element without removing
		//If Queue is empty peek() does not give exception it returns "null"
		System.out.println(q1.peek());//Mark
		System.out.println(q1);//[Mark]
		
		q1.clear();//It removed all elements
		
		System.out.println(q1.peek());//null
		System.out.println(q1.element());//NoSuchElementException


	}

}
