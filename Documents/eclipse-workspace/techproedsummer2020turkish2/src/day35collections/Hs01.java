package day35collections;

import java.util.HashSet;

public class Hs01 {

	public static void main(String[] args) {
		
		HashSet<String> hs01 = new HashSet<>();
		hs01.add("Apple");
		hs01.add("Mango");
		hs01.add("Grape"); 
		hs01.add("Fig");
		hs01.add(null);
		System.out.println(hs01);
		
		//Tekrarli eleman eklerseniz Set error vermez ustune yazar
		hs01.add("Apple");
		System.out.println(hs01);
		hs01.add(null);
		System.out.println(hs01);
		
		System.out.println(hs01.hashCode());

	}

}
