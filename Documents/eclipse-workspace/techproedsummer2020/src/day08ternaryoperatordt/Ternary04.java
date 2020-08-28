package day08ternaryoperatordt;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a String. 
		 If the String has 2 characters, output will be “It is valid for state abbreviations”  
         Otherwise, output will be “It is not valid for state abbreviations”
		*/
		
		//To get the number of characters in a String we will use length() method, 
		//length() method returns integer
		String name = "Jonathan Anderson";
		System.out.println(name.length());//17
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine().toUpperCase();
		System.out.println(str);//str will be in upper case every time because we used toUpperCase()
		
		String result = str.length()==2 ? "Valid for state abbreviations" : "Not valid for state abbreviations";
		System.out.println(result);
		
		scan.close();

	}

}
