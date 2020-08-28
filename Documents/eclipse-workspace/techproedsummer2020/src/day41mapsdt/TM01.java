package day41mapsdt;

import java.util.Map;
import java.util.TreeMap;

public class TM01 {
	/*
	 1)TreeMap puts the elements in natural order according to the keys
	 2)TreeMap is not synchronized and not thread safe
	 3)TreeMap does not allow null keys but allows multiple null values.
	 4)TreeMap slow
	*/

	public static void main(String[] args) {
		
		Map<Integer, String> tm = new TreeMap<>();
		tm.put(27, "Good");
		tm.put(15, "Bad");
		tm.put(50, "Ugly");
		tm.put(25, "The best");
		tm.put(30, "The worst");
		//If you use null for keys in TreeMap you get NullPointerException
		//tm.put(null, "Wooow");		
		tm.put(11, null);
		tm.put(13, null);
		
		System.out.println(tm);//{11=null, 13=null, 15=Bad, 25=The best, 27=Good, 30=The worst, 50=Ugly}
		
		tm.computeIfAbsent(15, k->"Pretty");
		System.out.println(tm);//{11=null, 13=null, 15=Bad, 25=The best, 27=Good, 30=The worst, 50=Ugly}
		
		tm.computeIfAbsent(33, k->"Pretty");
		System.out.println(tm);//{11=null, 13=null, 15=Bad, 25=The best, 27=Good, 30=The worst, 33=Pretty, 50=Ugly}
	}
}
