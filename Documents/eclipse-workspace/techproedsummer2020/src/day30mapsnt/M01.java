package day30mapsnt;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class M01 {

	/*
	 1) HashTable is synchronized and thread safe.
	 2) No null key, no null value
	 3) Elements are not ordered	 
	*/
	
	public static void main(String[] args) {

		Hashtable<Integer, String> hTable = new Hashtable<>();
		hTable.put(100, "Ali");
		hTable.put(101, "B");
		hTable.put(102, "Cem");
		hTable.put(103, "D");
		hTable.put(104, "E");
		hTable.put(105, "Frank");
		//hTable.put(null, "G"); ==> If you try to use "null" key, you will get
		//                           NullPointerException
		//hTable.put(106, null); ==> If you try to use "null" for values, 
		//                           you will get NullPointerException
		System.out.println(hTable);
		
		System.out.println(hTable.contains("Frank")); //true
		System.out.println(hTable.containsKey(103));//true
		System.out.println(hTable.containsValue("Frank"));//true
		
		System.out.println(hTable.getOrDefault(107, "No key"));//No key
		
		hTable.replace(100, "Faruk");
		System.out.println(hTable);//{105=Frank, 104=E, 103=D, 102=Cem, 101=B, 100=Faruk}
		
		hTable.replace(105, "Frank", "XXX");
		System.out.println(hTable);//{105=XXX, 104=E, 103=D, 102=Cem, 101=B, 100=Faruk}
		
		System.out.println(hTable.replace(104, "Y", "M"));//false
		System.out.println(hTable);//{105=XXX, 104=E, 103=D, 102=Cem, 101=B, 100=Faruk}
		
		Set<Map.Entry<Integer,String>> shTable = hTable.entrySet();
		System.out.println(shTable);
		
		/*
		 Iterator and Enumeration do very similar things.
		 1)The method names are different
		 2)You can remove elements by using iterator, but Enumeration has no
		   remove method.
		 */
		Enumeration names = hTable.keys();	
		while(names.hasMoreElements()) {
			Object key = names.nextElement();
			System.out.print(key.hashCode() + " ");
		}
		
		Iterator it = hTable.entrySet().iterator();
		while(it.hasNext()) {
			Object el = it.next();
			it.remove();
		}
		System.out.println(hTable);//{}

	}

}
