package day40mapsdt;

import java.util.Hashtable;
import java.util.Map;

public class HT01 {
	
	/*
	 1)HashTable uses key-value structure
	 2)HashTable is Synchronized
	 3)HashTable is Thread Safe
	 4)HashTable is not ordered
	 5)For HashTables, you cannot use "null" for keys and values.
	 6)HashTable is slow according to HashMap
	 */

	public static void main(String[] args) {
		
		Map<String, String> ht = new Hashtable<>();
		ht.put("Cat", "Meow");
		ht.put("Dog", "Bark");
		ht.put("Lion", "Roar");
		ht.put("Bee", "Buzz");
		ht.put("Cow", "Moo");
		//If you use "null" for key of a HashTable you will get NullPointerException
		//ht.put(null, "Yell");
		
		//If you use "null" for value of a HashTable you will get NullPointerException
		//ht.put("Chicken", null);

		System.out.println(ht);
		
		System.out.println(ht.keySet());//[Dog, Bee, Lion, Cat, Cow]
		
		Map<String, String> ht1 = new Hashtable<>();
		ht1.put("C", "M");
		ht1.put("D", "B");
		ht1.put("L", "R");
		
		//Copies all of the mappings from the specified map to this map 
		ht.putAll(ht1);
		System.out.println(ht);//{L=R, Dog=Bark, Bee=Buzz, Lion=Roar, Cat=Meow, D=B, C=M, Cow=Moo}

	}

}
