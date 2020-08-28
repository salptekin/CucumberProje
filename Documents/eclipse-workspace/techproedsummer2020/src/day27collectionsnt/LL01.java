package day27collectionsnt;

import java.util.Collections;
import java.util.LinkedList;

public class LL01 {
	
	/*
	 1)Linked list is very fast in deleting and adding elements(nodes)
	 If you will use a list most of the time for adding and deletin
	 operations it is better to use linked list.
	 2)Array list is faster than linked list to find elements.If you need a list
	 to search mostly do not use linked list use array list
	 */

	public static void main(String[] args) {

		LinkedList<String> llist = new LinkedList<>();
		llist.add("Steve");
		llist.add("Carl");
		llist.add("Raj");
		llist.add("Megan");
		llist.add("Rick");
		
		System.out.println(llist);//[Steve, Carl, Raj, Megan, Rick]
		
		//remove() and removeFirst() do the same thing
		llist.removeFirst();
		System.out.println(llist);//[Carl, Raj, Megan, Rick]
		
		llist.remove(1);
		System.out.println(llist);//[Carl, Megan, Rick]
		
		llist.remove("Rick");
		System.out.println(llist);//[Carl, Megan]
		
		llist.removeLast();
		System.out.println(llist);//[Carl]
		
		LinkedList<String> llist2 = new LinkedList<>();
		llist2.add("Ali");//[Ali]
		llist2.add(0, "Can");//[Can, Ali]
		llist2.addFirst("Veli");//[Veli, Can, Ali]
		llist2.addLast("Han");//[Veli, Can, Ali, Han]
		llist2.add(3, "Can");//[Veli, Can, Ali, Can, Han]
		llist2.addAll(llist);
		System.out.println(llist2);//[Veli, Can, Ali, Can, Han, Carl]
		
		llist2.removeLastOccurrence("Can");
		System.out.println(llist2);//[Veli, Can, Ali, Han, Carl]
		
		//clone() method's return type is Object because of that 
		//you should use Object as data type when you use clone() method
		Object clonedList = llist2.clone();
		System.out.println(clonedList);//[Veli, Can, Ali, Han, Carl]
		
		((LinkedList<String>) clonedList).clear();
		System.out.println(clonedList);//[]
		
		//How to check if a specific element exist in a LinkedList
		System.out.println(llist2.contains("Han"));//true
		
		//How to get a specific element from linked list
		System.out.println(llist2.get(2));//Ali
		
		//How to sort elements in a linked list
		Collections.sort(llist2);
		System.out.println(llist2);//[Ali, Can, Carl, Han, Veli]
		
		//How to update an element 
		llist2.set(0, "Aliye");
		System.out.println(llist2);//[Aliye, Can, Carl, Han, Veli]
		
		//How to get the number of elements in a linked list
		System.out.println(llist2.size());//5
	}
}
