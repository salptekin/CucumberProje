package day39collectionsdt;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q02 {
	
	/*
	 When you use PriorityQueue to create a Queue sometimes
	 elements will be in natural order, sometimes Java will put them in order
	 according to some comparison rules.
	 But, every time first element is being the first according to the natural order.
	*/

	public static void main(String[] args) {
		
         Queue<String> q1 = new PriorityQueue<>();
         q1.add("Chris");
 		 q1.add("Brandon");
 		 q1.add("Tucker");
 		 q1.add("Ali");
 		 q1.add("Mark");
 		 q1.add("Tucker");
 		 // q1.add(null); ==> NullPointerException
 		 System.out.println(q1);
 		 
 		 System.out.println(q1.element());//Ali
 		 System.out.println(q1);
 		
 		 System.out.println(q1.poll());//Ali
 		 System.out.println(q1);//[Brandon, Tucker, Chris, Mark, Tucker]
 		 
 		 System.out.println(q1.peek());//Brandon
 		 System.out.println(q1);//[Brandon, Tucker, Chris, Mark, Tucker]
 		 
 		 System.out.println(q1.getClass());//class java.util.PriorityQueue
 		 
 		 System.out.println(q1.hashCode());//2018699554
	}
}
