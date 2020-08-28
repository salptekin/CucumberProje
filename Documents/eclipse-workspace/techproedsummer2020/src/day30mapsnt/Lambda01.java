package day30mapsnt;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
	
	/*
	 Lambda is Functional Programming
	 The programming which we used until now is called Structured Programming
	*/

	public static void main(String[] args) {
        
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		
		printStructuredWay(list);
		System.out.println();
		printFunctionalWay(list);
		System.out.println();
		printFunctionalMethodReferenceWay(list);
		System.out.println();
		printEvenStructuredWay(list);
		System.out.println();
		printEvenFunctionalWay(list);
		System.out.println();
		square(list); 
		System.out.println();
		squareFunctionalWay(list);

	}
	
	//Create a method to print all elements one by one in the same line with space among them
	public static void printStructuredWay(List<Integer> list) {
		for(int w : list) {
			System.out.print(w + " ");
		}
	}
	
	//Create a method to print all elements one by one in the same line with space among them
	public static void printFunctionalWay(List<Integer> list) {
		list.stream()
		    .forEach(t -> System.out.print(t + " "));
	}
	
	//Create a method to print all elements one by one in the same line with space among them
	//Method Reference means ==> Class name :: method name
	public static void printFunctionalMethodReferenceWay(List<Integer> list) {
		list.stream()
		    .forEach(System.out::print);
	}
	
	//Create a method to print just even elements from the list by structured way
	public static void printEvenStructuredWay(List<Integer> list) {
		for(int w : list) {
			if(w%2==0) {
				System.out.print(w + " ");
			}
		}
	}
	
	//Create a method to print just even elements from the list by functional way
	public static void printEvenFunctionalWay(List<Integer> list) {
		list.stream()
		    .filter(Lambda01::isEven)//Method Reference instead of t -> t%2==0
		    .forEach(System.out::print);//or ==> t->System.out.print(t + " ")
	}
	
	//Note: Instead of using Lambda Expression sometimes we create a method and use it
	//      like Method Reference
	private static boolean isEven(int num) {
		return num%2==0;
	}
	
	//Create a method to print the squares of odd elements in the list by using Structured Way
	public static void square(List<Integer> list) {
        for(int w:list) {
        	if(w%2!=0) {
               System.out.print(w*w + " ");
        	}
        }     
    }
	
	//Create a method to print the squares of odd elements in the list by using Functional Way
	public static void squareFunctionalWay(List<Integer> list) {
		list.stream()
		    .filter(t->t%2!=0)
		    .map(Lambda01::getSquare)
		    .forEach(t->System.out.print(t + " "));
	}
	
	private static int getSquare(int num) {
		return num*num;
	}

}
