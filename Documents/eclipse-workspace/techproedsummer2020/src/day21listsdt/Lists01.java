package day21listsdt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists01 {

	public static void main(String[] args) {
		/* What are the differences between Arrays and Lists?
		   1)Arrays are fixed in length but Lists are flexible in length
		     "Lists are resizable Arrays"
		   2)When you create an array you have to declare the length but for lists
		     no declaration
		   3)When you add a new element to an array you have to create a new array but 
		     for lists no need to create a new list. You can add new elements directly
		     
		   Note 1:Like Arrays, we cannot use different data types in a List  
		   Note 2:In Arrays we can use primitives and references as data type but
		          In lists we cannot use primitives and references every time we have to
		          use non-primitives  
		*/
		
		//How to create a list
		
		//1. Way:
		ArrayList<String> l1 = new ArrayList<String>();
		//2. Way:
		//If you want you may not String inside the 2nd <>
		ArrayList<String> l2 = new ArrayList<>();
		//3. Way:
		//Do not use List on the right
		List<String> l3 = new ArrayList<>();
		
		//How to print a list on the console
		//To print a list on the console just put the name of the list
		//inside the System.out.println()
		System.out.println(l3);//[]
		
		//How to add elements into a list
		//add() method inserts the elements to the end every time
		l3.add("John");
		System.out.println(l3);//[John]
		
		l3.add("Angie");
		System.out.println(l3);//[John, Angie]
		
		//How to add an element into a specific index
		l3.add(1, "Mark");
		System.out.println(l3);//[John, Mark, Angie]
		l3.add(2, "Trump");
		System.out.println(l3);//[John, Mark, Trump, Angie]
		l3.add(0, "Suleyman");
		System.out.println(l3);//[Suleyman, John, Mark, Trump, Angie]
		l3.add("Alptekin");
		System.out.println(l3);//[Suleyman, John, Mark, Trump, Angie, Alptekin]
		//Note: If you use index more than length to add elements you will get
		//Run Time Error  ==> l3.add(11, "X"); ==> Run Time Error
		
		//How to add a list into another list
		l2.add("X");
		l2.add("Y");
		System.out.println(l2);	
		l3.addAll(l2);
		System.out.println(l3);//[Suleyman, John, Mark, Trump, Angie, Alptekin, X, Y]
		System.out.println(l2);//[X, Y]
		
		//How to add a list into a specific index
		l3.addAll(4, l2);
		System.out.println(l3);//[Suleyman, John, Mark, Trump, X, Y, Angie, Alptekin, X, Y]
		
		//How to get the number of elements (size) in a list
		System.out.println(l3.size());//10
		
		//How to check if a list if empty or not
		//isEmpty() returns boolean if the list has no any element it returns true
		//if the list has at least 1 element it returns false
		System.out.println(l3.isEmpty());//false
		System.out.println(l1.isEmpty());//true
		
		//How to remove a specific element from a list
		l3.remove("Trump");//Returns boolean
		System.out.println(l3);//[Suleyman, John, Mark, X, Y, Angie, Alptekin, X, Y]
		System.out.println(l3.remove("X"));//Returns boolean ==> true
		System.out.println(l3);//[Suleyman, John, Mark, Y, Angie, Alptekin, X, Y]
		System.out.println(l3.remove("W"));//Return boolean ==> false
		System.out.println(l3);//[Suleyman, John, Mark, Y, Angie, Alptekin, X, Y]
		
		//How to remove an element in a specific index
		System.out.println(l3.remove(2));//That method removes Mark and returns Mark
		System.out.println(l3);//[Suleyman, John, Y, Angie, Alptekin, X, Y]
		
		//How to update an element in a list
		l3.set(2, "Adam");
		System.out.println(l3);//[Suleyman, John, Adam, Angie, Alptekin, X, Y]
		
		//If you use index more than the last index in set(), you will get 
		//Run Time Error. Do not use set() to add new elements. set() is just for updating
		//l3.set(7, "Z"); ==> Run Time Error
		
		//How to check if a specific element exist in a list
		System.out.println(l3.contains("John"));//Returns boolean ==> true
		System.out.println(l3.contains("Aaaa"));//Returns boolean ==> false
		
		//How to sort elements in a list in natural order (Ascending + Alphabetical)
		Collections.sort(l3); // Do not forget how to sort
		System.out.println(l3);
		
		//How to delete all elements in a list
		l3.clear();
		System.out.println(l3);//[]
		
		//Can we use primitives in lists?
		//We cannot use primitives in Lists, instead of primitive data types we use
		//Wrapper Classes
		List<Integer> l4 = new ArrayList<>();
		List<Boolean> l5 = new ArrayList<>();
		List<Character> l6 = new ArrayList<>();

	}

}
