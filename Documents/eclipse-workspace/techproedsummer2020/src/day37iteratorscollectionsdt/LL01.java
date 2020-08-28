package day37iteratorscollectionsdt;

import java.util.LinkedList;
import java.util.List;

public class LL01 {
	
	/*
	 1)Linked lists do not use indexes
	 because of that in Linked lists 
	 accessing elements directly is difficult.
	 If you need to access to an element 
	 directly use ArrayList
	 2)Adding and removing elements are very fast
	 in Linked lists. Because of that if our program
	 will do most of the time adding and removing operations 
	 using linked list is the best way.
	 */

	public static void main(String[] args) {
        
		List<String> llist = new LinkedList<>();
		llist.add("Steve");
		llist.add("Carl");
		llist.add("Raj");
		llist.add("Megan");
		llist.add("Ali");
		System.out.println(llist);//[Steve, Carl, Raj, Megan, Ali]
		
		llist.add(2, "XXX");
		System.out.println(llist);//[Steve, Carl, XXX, Raj, Megan, Ali]
		
		List<String> llist1 = new LinkedList<>();
		llist1.add("AAA");
		llist1.add("BBB");
		
		llist.addAll(llist1);
		System.out.println(llist);//[Steve, Carl, XXX, Raj, Megan, Ali, AAA, BBB]
		
		llist.addAll(4, llist1);
		System.out.println(llist);//[Steve, Carl, XXX, Raj, AAA, BBB, Megan, Ali, AAA, BBB]
		
		llist.remove(2);
		System.out.println(llist);//[Steve, Carl, Raj, AAA, BBB, Megan, Ali, AAA, BBB]
		
		llist.remove("AAA");
		System.out.println(llist);//[Steve, Carl, Raj, BBB, Megan, Ali, AAA, BBB]
		
		llist.removeAll(llist1);
		System.out.println(llist);//[Steve, Carl, Raj, Megan, Ali]

	}

}
