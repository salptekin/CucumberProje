package day16listsnt;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {

	public static void main(String[] args) {
		// Lists(Array Lists) are flexible in size
		
		//      What is the difference between Array and List?
		//1)Main Difference: Arrays are fixed in size but Lists are flexible.
		//2)When we create an array we have to declare its size but for lists
		//  it is not necessary
		//3)When you remove or add a new element to an array you have to create 
		//  a new array but in lists no need to create a new list
		
		//How to create a list in Java
		ArrayList<String> l1 = new ArrayList<String>();//1. Way to create a list	
		ArrayList<String> l2 = new ArrayList<>();//2. Way to create a list
		
		//3. Way to create a list Use that one
		List<String> l3 = new ArrayList<>();
		
		//How to add elements into a list
		//We use add() method to add elements. 
		//add() method adds the elements to end
		l3.add("John");
		System.out.println(l3);//[John]
		l3.add("Mark");
		System.out.println(l3);//[John, Mark]
		l3.add("Angie");
		
		//How to print a list on the console
		System.out.println(l3);//[John, Mark, Angie]
		
		//How to add an element into a specific index
		l3.add(2, "Brad");
		System.out.println(l3);//[John, Mark, Brad, Angie]
		
		l3.add(1, "Mary");
		System.out.println(l3);//[John, Mary, Mark, Brad, Angie]
		
		l3.add(0, "Jamshid");
		System.out.println(l3);//[Jamshid, John, Mary, Mark, Brad, Angie]
		
		l3.add(6, "Trump");
		System.out.println(l3);//[Jamshid, John, Mary, Mark, Brad, Angie, Trump]
		
		//Java does not let to use index more than length in add() method
		//You get Run tIme Error ==> indexOutOfBoundsException
		l3.add(8, "Ali");
		System.out.println(l3);//[Jamshid, John, Mary, Mark, Brad, Angie, Trump]

	}

}
