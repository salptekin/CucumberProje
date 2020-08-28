package day35collections;

import java.util.LinkedHashSet;

public class Lhs01 {

	public static void main(String[] args) {
		
		//LinkedHashSet elemanlari bizim ekleme siramiza gore siralar
		LinkedHashSet<Integer> lhs01 = new LinkedHashSet<>();
		lhs01.add(13);
		lhs01.add(7);
		lhs01.add(25);
		lhs01.add(19);
		lhs01.add(2);
		lhs01.add(12);
		System.out.println(lhs01); 
	}
}
