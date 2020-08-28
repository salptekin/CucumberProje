package day29dequemapsnt;

import java.util.Deque;
import java.util.LinkedList;

public class D01 {
	/*
	 Deque ==> Double Ended Queue
	 Deque ==> We have FIFO(First In First Out) and LIFO(Last In First Out)
	 Deque ==> Does not accept "null" as an element
	 
	 Note:The difference is that offer() will return false if it fails to insert the element 
     on a size restricted Queue, whereas add() will throw an IllegalStateException.
     You should use offer() when failure to insert an element would be normal, 
     and add() when failure would be an exceptional occurrence  
	*/

	public static void main(String[] args) {
		
		Deque<String> dq = new LinkedList<>(); 
		dq.add("A");//[A]
		System.out.println(dq);
		
		dq.addFirst("B");//[B, A]	
		System.out.println(dq);
		
		dq.addLast("C");//[B, A, C]
		System.out.println(dq);
		
		dq.offer("D");//[B, A, C, D]
		System.out.println(dq);
		
		System.out.println(dq.element());//B
		System.out.println(dq);//[B, A, C, D]
		
		System.out.println(dq.peek());//B
		System.out.println(dq);//[B, A, C, D]
		
		System.out.println(dq.poll());//B
		System.out.println(dq);//[A, C, D]
		
		System.out.println(dq.remove());//A
		System.out.println(dq);//[C, D]
		
		System.out.println(dq.removeLast());//D
		System.out.println(dq);//[C]
		
		dq.add("B");
		dq.add("A");
		dq.add("B");
		dq.add("A");
		System.out.println(dq);//[C, B, A, B, A]
		
		System.out.println(dq.removeFirstOccurrence("B"));//true
		System.out.println(dq);//[C, A, B, A]
		
		System.out.println(dq.removeLastOccurrence("A"));//true
		System.out.println(dq);//[C, A, B]

	}
}
