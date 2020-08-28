package day06nestedifternarynt;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {
		/*
		 Ask user to get his first name
		 Use nested ternary
		 If the first name has more than 6 characters check if the name has letter 'e'.
		 If the name has letter 'e' print on the console "Good Name" 
		 otherwise print "Ordinary Name" on the console.
		 If the first name has not more than 6 characters check if the name has letter 'a'.
		 If the name has letter 'a' print on the console "What kind of name is that" 
		 otherwise print "Calm Down"
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String name = scan.next();
		
		String result = name.length()>6 ? (name.contains("e") ? "Good Name" : "Ordinary Name") : 
			              (name.contains("a") ? "What kind of name is that" : "Calm Down");
				
		System.out.println(result);
		
		scan.close();

	}

}
