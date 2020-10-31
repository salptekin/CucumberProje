package day37collections;

import java.util.LinkedList;

public class LinkedList02 {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll1 = new LinkedList<>();
		ll1.add(3);
		ll1.add(2);
		ll1.add(0);
		ll1.add(1);
		ll1.add(33);
		System.out.println(ll1);//[3, 2, 0, 1]
		
		ll1.remove(2);//remove() methodunun icine integer koyarsaniz Java her zaman onu index olarak
		              //kabul eder. Burada index'i 2 olan sifir silinir.
		System.out.println(ll1);//[3, 2, 1]
		
		//remove() methodunun icinde olmayan bir index kullanirsaniz
		//Java IndexOutOfBoundsException throw eder.
		//ll1.remove(33); ==> IndexOutOfBoundsException

	}

}
