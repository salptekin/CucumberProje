package day28setsnt;

import java.util.HashSet;

public class HS01 {
	
	/*
	 1) HashSet uses unique elements. If you try to add same elements Java will not
	    complain, will overwrite.
	 2) HashSet does not maintain any order, the elements would be returned in any random order
	    Java made HashSet like that to make it fast   
	 */

	public static void main(String[] args) {
		HashSet<String> hs01 = new HashSet<>();
		hs01.add("Apple");
		hs01.add("Mango");
		hs01.add("Apple");
		hs01.add("Orange");
		hs01.add(null);
				
		System.out.println(hs01);
		System.out.println(hs01.hashCode());
	}
}
