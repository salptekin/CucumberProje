package day33iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I02 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);//[X, Y, Z]
		
		//while loop'un icinde next() methodunu kullanmazsaniz pointer hareket etmez ve sonsuz dongu olusur.
		//List'teki ilk iki elemani siliniz
		ListIterator<String> li1 = list1.listIterator();
		while(li1.hasNext()) {		
			Object el = li1.next();
			li1.remove();
			if(el.equals("Y")) {
				break;
			}		
		}	
		System.out.println(list1);//[Z]
		
		/*
		 Bir String list olusturun ve tum elemanlari "XXX" e donusturun
		*/
		List<String> list2 = new ArrayList<>();
		list2.add("AB");
		list2.add("CDKLM");
		list2.add("EFG");
		System.out.println(list2);//[AB, CD, EF]
		
		ListIterator<String> li2 = list2.listIterator();
		
		while(li2.hasNext()) {		
			String el = li2.next();		
			li2.set(el.replace(el, "" + el.length()));		
		}
		System.out.println(list2);

	}

}
