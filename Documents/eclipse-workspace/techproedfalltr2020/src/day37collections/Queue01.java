package day37collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
	
	/*
	 1)Elemanlar en sona eklenir ve en bastan silinir. 
	   Bu sisteme FIFO(First In First Out) denir.
	   Eczaneler, Yemekhaneler bu sistemi kullanir...	   
	*/

	public static void main(String[] args) {
		
		//PriorityQueue kullanarak Queue uretirseniz, Java kendisi bir "priority"(oncelik) 
		//kurali uretir ve urettigi bu kurala gore elemanlari dizer. Istersek biz kendi 
		//"priority"(oncelik) kralimizi uretip elemanlari bu kurala gor dizebiliriz.
		Queue<String> q1 = new PriorityQueue<>();
		q1.add("Milk");
		q1.add("Cheese");
		q1.add("Water");
		q1.add("Oil");
		q1.add("Meat");
		System.out.println(q1);//[Cheese, Meat, Water, Oil, Milk]
		
		//peek() methodu ilk elemani silmeden bize retrun eder. (copy-paste gibi)
		System.out.println(q1.peek());//cheese
		System.out.println(q1);//[Cheese, Meat, Water, Oil, Milk]
		
		//poll() methodu ilk elemani queue'dan siler ve bize return eder. (cut-paste gibi)
		System.out.println(q1.poll());//cheese
		System.out.println(q1);//[Meat, Milk, Water, Oil]
		
		//offer() eleman eklemek icin kullanilir, add() methodu gibi. Eleman siniri konulmus
		//queue'larda eleman ekleme istenirse offer() kullanilabilir.
		q1.offer("Coke");
		System.out.println(q1);

		Queue<String> q2 = new LinkedList<>();
		q2.add("Bread");
		q2.add("Sugar");
		q2.add("Rice");
		q2.add("Bean");
		q2.add("Salt");
		System.out.println(q2);//[Bread, Sugar, Rice, Bean, Salt]
		
		/*
		 remove() ve poll() ilk elemani siler ve return eder.
		 Ama collection'da eleman yoksa remove() methodu Exception atar
		 poll() methodu Exception atmaz null return eder.
		*/
		
		//q2.remove();
		q2.poll();
		System.out.println(q2);//[Sugar, Rice, Bean, Salt]
		
		q2.clear();
		//System.out.println(q2.remove());//Exception verir.
		System.out.println(q2.poll());//null return eder.

	}

}
