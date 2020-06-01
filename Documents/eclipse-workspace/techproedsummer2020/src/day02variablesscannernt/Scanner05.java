package day02variablesscannernt;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		/*
		 Type a program which asks user to enter his/her first name and last name, 
         then print it on the console. 
		*/
		//To get String from user, you can use nextLine() or next()
		//next() gets just the first word, nextLine() gets all String
		
		
		//1. Step
		Scanner scan = new Scanner(System.in);
		//2. Step
		System.out.println("Enter your first name");
		String firstName = scan.nextLine();//For Strings please use nextLine()
		
		System.out.println("Enter your last name");
		String lastName = scan.next();//For Strings you can use next() but it gets
		                              //just the first word
		
		//3. Step
		System.out.print(firstName + " ");
		System.out.println(lastName);
		
		System.out.println(firstName + " " + lastName);	
		scan.close();
	}
}
