package day06nestedifternarynt;

import java.util.Scanner;

public class NestedIf03 {

	public static void main(String[] args) {
		/*
		 Type java code by using nested if() statement.
         Ask user to enter a password 
         If the initial of the password is uppercase then check if it is ‘A’ or not. 
         If it is ‘A’ the output will be “Valid Password” 
         otherwise the output will be “Invalid Password”
         If the initial of the password is lowercase then check if it is ‘z’ or not. 
         If it is ‘z’ the output will be “Valid Password” 
         otherwise the output will be “Invalid Password”
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter password");
		String password = scan.nextLine();
		
		if(password.charAt(0)>='A' && password.charAt(0)<='Z') {
			if(password.charAt(0)=='A') {
				System.out.println("Valid Password for Uppercases");
			}else {
				System.out.println("Invalid Password for Uppercases");
			}
		}else if(password.charAt(0)>='a' && password.charAt(0)<='z') {
			if(password.charAt(0)=='z') {
				System.out.println("Valid Password for Lowercases");
			}else {
				System.out.println("Invalid Password for Lowercases");
			}
		}else {
			System.out.println("Please, make the initial letter");
		}
		scan.close();
	}
}
