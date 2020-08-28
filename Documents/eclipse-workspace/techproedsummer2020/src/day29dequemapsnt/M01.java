package day29dequemapsnt;

import java.util.HashMap;

public class M01 {
	
	/*
	 There are 3 types of Maps: 
	 
	 1) HashMap: It is not synchronized and it is not thread safe
	             HashMap is fast
	             Elements in HashMap are in random order
	             In HashMap, you can use just one null key, and multiple null values. 
	 
	 2) HashTable: It is synchronized and it is thread safe
	               HashTable is slow
	               Elements in HashTable are in random order
	               In HashTable, you cannot use any null key or null values 
	               
	 3) TreeMap:  It is not synchronized and it is not thread safe
	              TreeMap is slow
	              Elements in TreeSet are in natural order
	              In TreeMap, you cannot use null keys but you can use multiple null values              
	 */

	public static void main(String[] args) {

        HashMap<String, Integer> hMap = new HashMap<>();
        hMap.put("Greece", 10000000);
        hMap.put("Germany", 80000000);
        hMap.put("The USA", 350000000);
        hMap.put("Turkey", 85000000);
        /*
         If you use same key more than once, it will overrite. 
         For HashMaps, keys must be unique
         */
        hMap.put("Turkey", 185000000);
        
        /*
         You can use same values for value part of HashMap.
         No uniqueness for values of HashMaps
        */
        hMap.put("Belgium", 10000000);
        
        /*
         You can use null for keys just once. If you try to use more than once
         Java will overwrite
         */
        hMap.put(null, 33000000);
        hMap.put(null, 44000000);
        
        /*
         You can use multiple null for values.
         */
        hMap.put("Mars", null);
        hMap.put("Venus", null);
        
        System.out.println(hMap);

	}

}
