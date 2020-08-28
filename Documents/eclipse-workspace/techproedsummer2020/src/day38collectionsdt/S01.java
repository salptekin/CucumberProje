package day38collectionsdt;

import java.util.HashSet;

public class S01 {
	
	/*
	 1) Set: In Set all elements must be unique, you cannot use repeated elements in a Set
	 2) We have 3 types of Sets in Java
	    a)HashSet
	    b)LinkedHashSet
	    c)TreeSet
	 3) HashSet: Uses "hashing technique" 
	             Does not maintain any order, it returns elements in random order.
	             When you try to add repeated elements, Java does not give Compile Time Error
	             or Run Time Error. Java overwrites the new element to the old one. 
	             Adding null as an element in a HashSet is allowed. If you try to add "null" more than 
	             once Java will overwrite 
	             
	             ==> HashSet does not put elements in any order, it means HashSet does not work on 
	             ordering elements, it saves time for HashSet because of that HashSet is faster than 
	             LinkedHashSet and TreeSet. If the order of elements is not important for your program
	             use HashSet to be fast. 
	 */

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		hs.add("Angie");
		hs.add("Brad Pitt");
		hs.add("Boby");
		hs.add("Caroline Star");
		hs.add("Boby");
		hs.add(null);
		hs.add(null);
		System.out.println(hs);//[Angie, Brad Pitt, Caroline Star, Boby]

	}

}
