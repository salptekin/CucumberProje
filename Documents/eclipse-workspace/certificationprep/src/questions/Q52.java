package questions;

import java.util.Hashtable;

public class Q52 {
	
	/*
	 Knowledge: clone() creates a shallow copy of a hashtable.  
	 All the structure of the hashtable itself is copied, but the keys and values are not cloned.
	*/

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		Object clonedHt = new Hashtable<Integer, String>();
		ht.put(3, "B");
		ht.put(2, "A");
		ht.put(1, "C");

		clonedHt = ht.clone();
		System.out.println(clonedHt);//?

		ht.clear();
		System.out.println(ht);//?

		System.out.println(clonedHt);//?

	}

}
