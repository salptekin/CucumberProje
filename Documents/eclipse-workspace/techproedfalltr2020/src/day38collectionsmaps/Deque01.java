package day38collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
	/*
	 1)Double Ended Queue (Deque): Queue'larda FIFO gecerli, Deque'lerde hem FIFO
	   hem de LIFO(Last In First Out) gecerlidir.
	*/

	public static void main(String[] args) {
		
		Deque<String> dq1 = new LinkedList<>();
		dq1.add("Ali");
		dq1.add("Veli");
		dq1.add("Aydin");
		dq1.add("Merve");
		dq1.add("Kadriye");
		System.out.println(dq1);//[Ali, Veli, Aydin, Merve, Kadriye]
		
		System.out.println(dq1.getFirst());//Ali (copy+paste)
		System.out.println(dq1);//[Ali, Veli, Aydin, Merve, Kadriye]
		
		System.out.println(dq1.getLast());//Kadriye (copy+paste)
		System.out.println(dq1);//[Ali, Veli, Aydin, Merve, Kadriye]
		
		System.out.println(dq1.peekFirst());//Ali (copy+paste)
		System.out.println(dq1);//[Ali, Veli, Aydin, Merve, Kadriye]
		
		System.out.println(dq1.peekLast());//Kadriye (copy+paste)
		System.out.println(dq1);//[Ali, Veli, Aydin, Merve, Kadriye]
		
		/*
		 Note: getFirst() ve peekFirst() methodlarinin ikisi de ilk elemani silmeden return eder.
		       fakat, getFirst() bos deque'lerde kullanildiginda NoSuchElementException atar, 
		       peekFirst() ise Exception atmaz "null" return eder.
		       
		       Yukaridaki kural getLast() ve peekLast() methodlari icin de gecerlidir.
		*/
		//dq1.clear();
		//System.out.println(dq1.peekFirst());//null
		//dq1.getFirst();//NoSuchElementException
		
		System.out.println(dq1.pollFirst());//Ali (cut+paste)
		System.out.println(dq1);//[Veli, Aydin, Merve, Kadriye]
		
		System.out.println(dq1.pollLast());//Kadriye (cut+paste)
		System.out.println(dq1);//[Veli, Aydin, Merve]

	}

}
