package day38collectionsdt;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LL01 {

	public static void main(String[] args) {
		
		//addFirst() adds the element at the beginning of the linked list
		LinkedList<String> sll = new LinkedList<>();
		sll.add("A");//[A]
		sll.addFirst("B");//[B, A]
		sll.addFirst("C");//[C, B, A]
		sll.add("B");//[C, B, A, B]
		sll.add("B");//[C, B, A, B, B]
		System.out.println(sll);
		
		//addLast() adds the element at the end of the linked list
        sll.addLast("N");//[C, B, A, N]
        System.out.println(sll);
        
        //getFirst() gets the first element from the list
        System.out.println(sll.getFirst());//C
        
        //getLast() gets the last element from the list
        System.out.println(sll.getLast());//N
        
        //Collections.sort() puts the elements in natural order.
        Collections.sort(sll);
        System.out.println(sll);//[A, B, B, B, C, N]
        
        //clear() removes all elements
        //sll.clear();
        //System.out.println(sll);//[]
        
        //contains() check if a specific element exists in the list
        System.out.println(sll.contains("N"));//false
        
        //element() Retrieves and does not remove the head (first element) of this list.
        //If there is no first element you will get NoSuchElementException
        System.out.println(sll.element());
        
        System.out.println(sll.get(2));//C
        
        sll.removeFirstOccurrence("B");//[A, B, B, C, N]
        System.out.println(sll);
        
        sll.removeLastOccurrence("B");//[A, B, C, N]
        System.out.println(sll);

	}

}
