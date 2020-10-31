package day37collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet02 {
	
	/*
	 Soru: Elemanlari alfabetik sirada dizen ve tekrarsiz bir collection elde etmek icin ne kullanirsiniz?
	 Cevap: TreeSet
	 
	 Soru: Ama TreeSet cok yavastir. Nasil bir cozum bulabilirsin?
	 Cevap:HashSet olustururum, elemanlari HashSet'e eklerim. Sonra HashSet'i TreeSet'e ceviririm
	       boylelikle tekrarsiz ve alfabetik sirada bir collection'a sahip olmus olurum. 
	*/

	public static void main(String[] args) {
		
		long startingTime2 = System.currentTimeMillis();
		TreeSet<String> ts2 = new TreeSet<>();
		ts2.add("Ali");
		ts2.add("Veli");
		ts2.add("Canan");
		ts2.add("Beyhan");
		ts2.add("Ayhan");
		ts2.add("Seyhan");
		ts2.add("Ceyhan");
		ts2.add("Ramazan");
		ts2.add("Daghan");
		System.out.println(ts2);
		long endingTime2 = System.currentTimeMillis();
		System.out.println("Tree: " + (endingTime2 - startingTime2));
		
		long startingTime1 = System.currentTimeMillis();
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("Ali");
		hs1.add("Veli");
		hs1.add("Canan");
		hs1.add("Beyhan");
		hs1.add("Ayhan");
		hs1.add("Seyhan");
		hs1.add("Ceyhan");
		hs1.add("Ramazan");
		hs1.add("Daghan");
		System.out.println(hs1);
		
		TreeSet<String> ts1 = new TreeSet<>(hs1);
		System.out.println(ts1);
		long endingTime1 = System.currentTimeMillis();
		System.out.println("Hash + Tree: " + (endingTime1 - startingTime1));

	}

}
