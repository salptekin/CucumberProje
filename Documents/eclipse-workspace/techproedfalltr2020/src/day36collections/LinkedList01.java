package day36collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
	/*
	 1)Linkedlist'de elemanlar "data" ve "address" olmak uzere iki kisimdan olusur.
	 2)LinkedList'de elemanlarin yapisi farkli oldugundan "node" olarak adlandirilirlar
	 3)LinkedList'lerde her zaman en basta "Head" vardir. Head sadece address bolumunden olusur.
	   Head icin data bolumu yoktur.
	 4)LinkedListler'de en son node "Tail" olarak adlandirilir.
	 5)LinkedList'ler eleman ekleme ve silme'de cok basarilidirlar. Fakat eleman bulmada
	   basarisizdirlar, cunku index kullanmazlar.    
	 */

	public static void main(String[] args) {
		
		LinkedList<String> ll1 =  new LinkedList<>();
		ll1.add("Ali");
		ll1.add("Veli");
		ll1.add("Emine");
		ll1.add("Beyhan");
		ll1.add("Ridvan");
		System.out.println(ll1);//[Ali, Veli, Emine, Beyhan, Ridvan]
		
		ll1.add(1, "Kemal");
		System.out.println(ll1);//[Ali, Kemal, Veli, Emine, Beyhan, Ridvan]
		
		List<String> ll2 = new ArrayList<>();
		ll2.add("XXX");
		ll2.add("YYY");
		
		/*
		 addAll() methodu linked list'e ArrayList'den gelen, LinkedList'den gelen kisacasi
		 tum collection'lardan gelen elemanlari ekleyebilir.
		*/
		ll1.addAll(ll2);
		System.out.println(ll1);//[Ali, Kemal, Veli, Emine, Beyhan, Ridvan, XXX, YYY]

		ll1.addAll(2, ll2);
		System.out.println(ll1);//[Ali, Kemal, XXX, YYY, Veli, Emine, Beyhan, Ridvan, XXX, YYY]
		
	    ll1.addFirst("AAA");
	    System.out.println(ll1);//[AAA, Ali, Kemal, XXX, YYY, Veli, Emine, Beyhan, Ridvan, XXX, YYY]
	    
	    ll1.addLast("BBB");
	    System.out.println(ll1);//[AAA, Ali, Kemal, XXX, YYY, Veli, Emine, Beyhan, Ridvan, XXX, YYY, BBB]
	    
	    //remove() Ilk elemani siler
	    ll1.remove();
	    System.out.println(ll1);//[Ali, Kemal, XXX, YYY, Veli, Emine, Beyhan, Ridvan, XXX, YYY, BBB]
	    ll1.remove();
	    System.out.println(ll1);//[Kemal, XXX, YYY, Veli, Emine, Beyhan, Ridvan, XXX, YYY, BBB]
	    
	    //removeFirst() Ilk elemani daha hizli siler 
	    ll1.removeFirst();
	    System.out.println(ll1);//[XXX, YYY, Veli, Emine, Beyhan, Ridvan, XXX, YYY, BBB]
	    
	    //remove(4) methodu index'i 4 olan elemani bulur, siler ve return eder.
	    System.out.println(ll1.remove(4));//Beyhan
	    System.out.println(ll1);//[XXX, YYY, Veli, Emine, Ridvan, XXX, YYY, BBB]
	    
	    //remove("YYY") methodu ilk YYY'yi siler ve rapor verir.
	    //Silinmesi istenen eleman list'de yoksa false return eder, varsa siler ve true return eder.
	    System.out.println(ll1.remove("YYY"));//true
	    System.out.println(ll1);//[XXX, Veli, Emine, Ridvan, XXX, YYY, BBB]	    
	    System.out.println(ll1.remove("Hirsiz"));//false
	    System.out.println(ll1);//[XXX, Veli, Emine, Ridvan, XXX, YYY, BBB]
	    
	    //removeFirstOccurrence("XXX") methodu en soldaki XXX elemanini siler.
	    ll1.removeFirstOccurrence("XXX");
	    System.out.println(ll1);//[Veli, Emine, Ridvan, XXX, YYY, BBB]
	    
	    ll1.add(5, "Ridvan");
	    System.out.println(ll1);//[Veli, Emine, Ridvan, XXX, YYY, Ridvan, BBB]
	    
	    //removeLastOccurrence("Ridvan") methodu en sagdaki Ridvan'i siler.
	    ll1.removeLastOccurrence("Ridvan");
	    System.out.println(ll1);//[Veli, Emine, Ridvan, XXX, YYY, BBB]
	    
	    //removeLast() methodu son elemani siler.
	    ll1.removeLast();
	    System.out.println(ll1);//[Veli, Emine, Ridvan, XXX, YYY]
	    
	    ll1.add(2, "Veli");
	    ll1.add(4, "Veli");
	    System.out.println(ll1);//[Veli, Emine, Veli, Ridvan, XXX, Veli, YYY]
	    
	    LinkedList<String> ll3 = new LinkedList<>();
	    ll3.add("Veli");
	    
	    //removeAll(ll3) methodu ll3 icindeki elemanlari ll1 icinden siler
	    ll1.removeAll(ll3);
	    System.out.println(ll1);//[Emine, Ridvan, XXX, YYY]

	    LinkedList<String> ll4 = new LinkedList<>();
	    ll4.add("Emine");
	    ll4.add("XXX");
	    
	    System.out.println(ll1.containsAll(ll4));//true cunku Emine ve XXX ll1'in icinde var
	    
	    ll4.add("MMM");
	    System.out.println(ll1.containsAll(ll4));//false cunku Emine ve XXX ll1'in icinde var
	                                             //olmasina ragmen MMM yok.
	    
	    System.out.println(ll1.get(1));//Ridvan
	
	}

}
