package questions;

import java.util.Hashtable;

public class Q54 {

	public static void main(String[] args) {

		Hashtable<Integer, String> h = new Hashtable<Integer, String>();
		h.put(3, "Bad");
		h.put(2, "Good");
		h.put(1, "Ugly");

		h.putIfAbsent(3, "X");
		h.putIfAbsent(4, "Y");
		System.out.println(h);//?

	}

}
