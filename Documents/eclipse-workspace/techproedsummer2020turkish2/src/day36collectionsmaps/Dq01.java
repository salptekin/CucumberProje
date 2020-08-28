package day36collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;

public class Dq01 {

	public static void main(String[] args) {
		/*
		  1) Deque: Double Ended Queue
		  2) Double Ended demek iki uclu demektir. 
		     Yani; Deque'de sona ekle bastan sil(FIFO) ve basa ekle sondan sil(LIFO:Last In First Out) kurallarinin ikisi de calisir.
		  3) Deque'ler resizable'dir. 
		  4) Deque'ler LinkedList'lerden hizlidirlar  
		  5) Deque'ler eleman olarak "null" kabul etmezler. 
		*/

		Deque<String> dq01 = new LinkedList<>();
		dq01.add("Ali");
		dq01.addFirst("Veli");
		dq01.addLast("Can");
		dq01.add("Ayse");
		dq01.addFirst("Emine");
		dq01.addLast("Reyhan");
		
		System.out.println(dq01);//[Emine, Veli, Ali, Can, Ayse, Reyhan]
		
		System.out.println(dq01.element());//Ilk elemani silmeden size gosterir
		                                   //peek()'den farki: Ilk eleman yoksa elemnt() method Exception atar
		System.out.println(dq01);//[Emine, Veli, Ali, Can, Ayse, Reyhan]
		
		System.out.println(dq01.peek());//Ilk elemani silmeden size gosterir
		                                //Ilk eleman yoksa "null" return eder.
		System.out.println(dq01);//[Emine, Veli, Ali, Can, Ayse, Reyhan]
		
		System.out.println(dq01.peekLast());
		System.out.println(dq01);//[Emine, Veli, Ali, Can, Ayse, Reyhan]  
		
		System.out.println(dq01.poll());
		System.out.println(dq01);//[Veli, Ali, Can, Ayse, Reyhan]
		
		System.out.println(dq01.pollLast());
		System.out.println(dq01);//[Veli, Ali, Can, Ayse]

	}

}
