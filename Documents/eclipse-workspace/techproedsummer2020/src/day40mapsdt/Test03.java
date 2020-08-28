package day40mapsdt;

import java.util.Hashtable;
import java.util.Set;
/*
 Returns a Set view of the mappings contained in this map. 
 The set is backed by the map, so changes to the map are reflected 
 in the set. 
 */
public class Test03 {
	public static void main(String[] args) {
		Hashtable<Integer, String> h = new Hashtable<Integer, String>();
		h.put(3, "Bad");
		h.put(2, "Good");
		h.put(1, "Ugly");
		
		h.putIfAbsent(3, "The worst");
		h.putIfAbsent(4, "The best");
		System.out.println(h);
	}
}
