package day06nestedifternarynt;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {
		// How to count the number of characters in a String?
		// "Java" ==> To get the number of characters in "Java" String
		// we will use "Java".length();
		String str = "Java";
		System.out.println(str.length());//4
		
		// We learned 5 methods about String 
		// ==> equals(), length(), toUppercase(), toLowercase(), charAt()
		
		/*
		 Ask user to enter a String. If the String has 2 characters, 
		 output will be “It is valid for state abbreviations” 
         otherwise, output will be “It is not valid for state abbreviations”
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the state abbreviation");
		String abr = scan.next().toUpperCase();
		
		String result = abr.length()==2 ? "It is valid for state abbreviations" : "It is not valid for state abbreviations";
        System.out.println(result);
		
        scan.close();
	}
}
