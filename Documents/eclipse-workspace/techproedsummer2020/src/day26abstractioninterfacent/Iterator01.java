package day26abstractioninterfacent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("C");
		list1.add("B");
		System.out.println(list1);//[A, C, B]
		
		/*
		 Loops can navigate among the elements but cannot update the collections.
		 */
		for(String w:list1) {
			w = w + "X";
		}
		System.out.println(list1);//[A, B, C]
		
		/*
		 If you want to update a collection(array, list , ...) loops cannot be used.
		 You need to use "Iterators"...
		*/
		Iterator<String> it1 = list1.iterator();		
		while(it1.hasNext()) {	
			Object el = it1.next();		
			it1.remove();			
		}		
		System.out.println(list1);
		
		/*
		 1) Create a new list whose elements are integer
		 2) By using iterator convert the list to into an empty list
		*/
		List<Integer> list2 = new ArrayList<>();
		list2.add(23);
		list2.add(24);
		list2.add(25);
		System.out.println(list2);//[23, 24, 25]
		
		Iterator<Integer> it2 = list2.iterator();
		while(it2.hasNext()) {
			Object el = it2.next();// like i++
			it2.remove();
		}
		System.out.println(list2);//[]
		
		
		/*
		 Create a String list
		 Concatenate "X" to every element
		*/
		List<String> list3 = new ArrayList<>();
		list3.add("AB");
		list3.add("CD");
		list3.add("EF");
		System.out.println(list3);//[AB, CD, EF]  The task is ==> [ABX, CDX, EFX]
		
		ListIterator<String> it3 = list3.listIterator();
		while(it3.hasNext()) {
			Object el = it3.next();
			it3.set(el + "X");			
		}
		System.out.println(list3);//[ABX, CDX, EFX]
		
		
		/*
		 Create an integer list
		 Update all elements by multiplying by 2
		*/
		
		List<Integer> list4 = new ArrayList<>();
		list4.add(12);
		list4.add(13);
		list4.add(14);
		System.out.println(list4);
		
		ListIterator<Integer> it4 = list4.listIterator();
		while(it4.hasNext()) {
			Integer el = it4.next();
			it4.set(el*2);
		}
		System.out.println(list4);

	}

}
