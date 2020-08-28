package day40mapsdt;

import java.util.Hashtable;
import java.util.Map;

/*
 Knowledge: If the specified key is not already associated with a value 
 or is mapped to null, attempts to compute its value using the given 
 mapping function and enters it into this map unless null
 */

public class Test02 {
	public static void main(String[] args) {
		Map<String, Integer> ht = new Hashtable<>();
		ht.put("Apple", 10);
		ht.put("Apricot", 500);
		ht.put("Strawberry", 400);
		ht.put("Palm", 5000);
		System.out.println(ht);

		ht.computeIfAbsent("Orange", k -> 600);
		ht.computeIfAbsent("Apple", k -> 800);
		System.out.println(ht);
	}
}
