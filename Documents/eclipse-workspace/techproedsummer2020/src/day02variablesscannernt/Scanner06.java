package day02variablesscannernt;

import java.util.Scanner;

public class Scanner06 {

	public static void main(String[] args) {
		//Ask user to enter his/her first and last names. 
		//Print the initials on the console
		//For example for Ali Can, you will see A C on the console
		
		//1. Step
		Scanner scan = new Scanner(System.in);
		//2. Step
		System.out.println("Enter your first name");
		char firstNameInitial = scan.nextLine().charAt(0);//To get first character
		
		System.out.println("Enter your last name");
		char lastNameInitial = scan.nextLine().charAt(0);//To get first character
		//3. Step
		System.out.println(firstNameInitial + " " + lastNameInitial);
		scan.close();
	}
}
