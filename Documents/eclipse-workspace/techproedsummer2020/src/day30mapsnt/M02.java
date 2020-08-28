package day30mapsnt;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class M02 {
	
	/*
	 1) TreeMap is not-synchronized and not-thread-safe
	 2) Elements are in natural order according to the keys.
	 3) No null for keys but you can use multiple null for values
	 */

	public static void main(String[] args) {
		
		Map<Integer, String> tMap = new TreeMap<>();
		tMap.put(100, "Zyna");
		tMap.put(103, "Frankestian");
		tMap.put(105, "Brad Pitt");
		tMap.put(101, "Angelina Julie");
		//tMap.put(null, "Java"); ==> If you use null for key in a TreeMap you will get
	    //                            NullPointerException
		tMap.put(104, null); // ==> null can be used for values many times
		
		System.out.println(tMap);//{100=Zyna, 101=Angelina Julie, 103=Frankestian, 104=null, 105=Brad Pitt}
		
		System.out.println(tMap.get(105));//Bradd Pitt
		System.out.println(tMap.getClass());//class java.util.TreeMap
		
		//Use Enumeration to update keys...
		//We cannot use Enumeration for TreeMaps
		
		Collection el = tMap.keySet();
		
		Iterator it = el.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.print(obj.hashCode() + " ");
		}

	}

}
