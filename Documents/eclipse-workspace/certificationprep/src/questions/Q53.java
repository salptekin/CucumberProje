package questions;

import java.util.Hashtable;
import java.util.Map;

public class Q53 {
	
	/*
	 Knowledge: computeIfAbsent() if the specified key is not already associated with a value or is mapped to null,
	 attempts to compute its value using the given mapping function and enters it into this map unless null.
	*/

	public static void main(String[] args) {
		
		Map<String, Integer> ht = new Hashtable<>();
		ht.put("Apple", 10);
		ht.put("Apricot", 500);
		ht.put("Strawberry", 400);
		ht.put("Palm", 5000);
		System.out.println(ht);//?

		ht.computeIfAbsent("Orange", k -> 600);
		ht.computeIfAbsent("Apple", k -> 800);
		System.out.println(ht);//?

	}

}
