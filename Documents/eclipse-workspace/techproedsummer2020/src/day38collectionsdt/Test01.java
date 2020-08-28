package day38collectionsdt;

import java.util.HashSet;
import java.util.Iterator;

public class Test01 {
	public static void main(String[] args) {
		 HashSet<String> hs = new HashSet<>();
		 hs.add("A");
		 hs.add("B");
		 hs.add("A");
		 hs.add("B");
		 hs.add("C");
		 Iterator<String> i = hs.iterator(); 
	     while (i.hasNext()) { 
	        System.out.print(i.next() + "! ");
	     }
	}
}