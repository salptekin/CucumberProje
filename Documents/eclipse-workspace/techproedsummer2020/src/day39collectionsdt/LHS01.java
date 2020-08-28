package day39collectionsdt;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LHS01 {
	
	/*
	 1)LinkedHashSet is a Set so no duplication
	 2)LinkedHashSet puts the elements in insertion order 
	 3)LinkedHashSet accepts "null" as an element
	 4)LinkedHashSet overwrites if you add repeated elements
	 */

	public static void main(String[] args) {
		
		LocalTime lt1 = LocalTime.now();
		System.out.println(lt1);
		Set<String> lhSet = new LinkedHashSet<>();
		lhSet.add("Ali");
		lhSet.add("Brandon");
		lhSet.add("Tucker");
		lhSet.add("Chris");
		lhSet.add("Kavya");
		lhSet.add(null);
		lhSet.add(null);
		System.out.println(lhSet);//[Ali, Brandon, Tucker, Chris, Kavya]
		LocalTime lt2 = LocalTime.now();
		System.out.println(lt2);
		
		Set<String> hSet = new HashSet<>();
		hSet.add("Ali");
		hSet.add("Brandon");
		hSet.add("Tucker");
		hSet.add("Chris");
		hSet.add("Kavya");
		hSet.add(null);
		hSet.add(null);
		System.out.println(hSet);
		LocalTime lt3 = LocalTime.now();
		System.out.println(lt3);
	}
}
