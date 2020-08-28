package day28setsnt;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
	
	/*
	 If you use Queue, the elements are added to the end and removed from the beginning
	 First In First Out ==> FIFO ==> fayfo
	*/

	public static void main(String[] args) {

		Queue<String> q = new LinkedList<>();
		q.add("C");
		q.add("A");
		q.add("B");
		q.add("F");
		System.out.println(q);//[C, A, B, F]
		
		q.remove();
		System.out.println(q);//[A, B, F]
		
		System.out.println(q.element());//A ==> element() returns the first element(Head) 
		                                //      of the Queue without removing
		System.out.println(q);//[A, B, F] 
//		q.clear();
		
		//System.out.println(q.element());//If there is no any element in a Queue
		                                  //element() throws "NoSuchElementException"
//		
//		q.add("C");
//		q.add("A");
//		q.add("B");
//		q.add("F");
//		
//		System.out.println(q.poll());//C
//		q.clear();
//		System.out.println(q.poll());//null
//		
//		Queue<Integer> q1 = new LinkedList<>();
//		q1.add(3);
//		q1.add(5);
//		q1.add(7);
//		
//		System.out.println(q1.poll());//3
//		q1.clear();
//		System.out.println(q1.poll());//null
		
		Queue<String> qWithLinkedList = new LinkedList<>();
		qWithLinkedList.add("Y");
		qWithLinkedList.add("Z");
		qWithLinkedList.add("X");
		System.out.println(qWithLinkedList);//[Y, Z, X] ==> Insertion order
		
		PriorityQueue<String> qWithPriorityQueue = new PriorityQueue<String>();
		qWithPriorityQueue.add("Yeast");
		qWithPriorityQueue.add("Car");
		qWithPriorityQueue.add("Xfinity");
		qWithPriorityQueue.add("Mark");
		System.out.println(qWithPriorityQueue);//[X, Y, Z] ==> Natural order

		//poll() returning the first element and removing it.
		System.out.println(qWithPriorityQueue.poll());//X
		System.out.println(qWithPriorityQueue);//[Y, Z]
		
		//peek() returning the first element without removing
		System.out.println(qWithPriorityQueue.peek());//Y
		System.out.println(qWithPriorityQueue);//[Y, Z]

	}

}
