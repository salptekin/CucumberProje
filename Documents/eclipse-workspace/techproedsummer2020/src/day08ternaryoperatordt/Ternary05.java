package day08ternaryoperatordt;

import java.util.Scanner;

public class Ternary05 {

	public static void main(String[] args) {
		/*
		 Ask user to enter an integer. 
		 If the number has 3 digits, output will be “This number has 3 digits.”  
         Otherwise, output will be “This number has no 3 digits.”
                    How can you decide the number of digits of an integer?
		*/
		
		//Which methods did we learn about Strings until now?
		//equals() ==> returns boolean 
		//equalsIgnoreCase() ==> returns boolean
		//charAt() ==> returns char
		//toLowerCase() and toUpperCase() ==> returns String
		//length() ==> returns integer
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		String num = scan.next(); 
		
		String result = num.length()==3 ? "This number has 3 digits" : "This number has no 3 digits";
		System.out.println(result);
		
		scan.close();
	}
}
