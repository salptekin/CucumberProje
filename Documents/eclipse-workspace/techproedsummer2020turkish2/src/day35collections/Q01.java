package day35collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q01 {

	public static void main(String[] args) {
		//Ilk eklenen ilk silinir ==> FIFO : First In First Out
		Queue<String> q01 = new LinkedList<>();
		q01.add("Apple");
		q01.add("Mango");
		q01.add("Fig");
		q01.add("Peach");
		q01.add("Grape");
		System.out.println(q01);
		
		q01.remove();
		System.out.println(q01);
		
		System.out.println(q01.element());//Size ilk elemani verir, ama ilk elemani Queue'dan silmez
		                                  //Ilk eleman yoksa 'NoSuchElementException' verir.
		System.out.println(q01);
		
		q01.peek();//Ilk elemani size verir, Queue'dan silmez. element() methodundan farki
		           //ilk eleman yoksa 'null' return eder.
		
		System.out.println(q01.poll());//Size ilk elemani verir ama ilk elemani Queue'dan siler
		System.out.println(q01);
		
		//PriorityQueue kullanirsaniz bazen natural order'a gore elemanlari dizer, 
		//bazen de Java arkada kendine gore bir kural olusturur ve ona gore elemanlari dizer.
		Queue<String> q02 = new PriorityQueue<>();
		q02.add("Apple");
		q02.add("Mango");
		q02.add("Fig");
		q02.add("Peach");
		q02.add("Grape");
		System.out.println(q02);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
