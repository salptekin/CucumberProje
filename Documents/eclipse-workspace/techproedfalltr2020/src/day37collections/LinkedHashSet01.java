package day37collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
	
	/*
	 LinkedHashSet'ler 1)Tekrarli eleman kabul etmezler
	                   2)Elemanlari ekleme sirasina(insertion order) gore dizerler.
	                   3)LinkedHashSet, HashSet'den yavastir.
	*/

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
		lhs1.add("Ali");
		lhs1.add("Canan");
		lhs1.add("Veli");
		lhs1.add("Remziye");
		System.out.println(lhs1);//[Ali, Canan, Veli, Remziye]

	}

}
