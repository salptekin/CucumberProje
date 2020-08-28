package day03operatorsifstatementnt;

import java.util.Scanner;

public class Operators03 {

	public static void main(String[] args) {
		// Ask user to enter two integer values. Write a Java Program to swap 
		// two numbers without using the third variable.
				
		//If you see red underline; programmers say "Java is complaining"
		//If you see red underline; it means you are getting "Compile Time Error"
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter two integers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Before swapping: " + a + " and " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping: " + a + " and " + b);
		scan.close();
	}
}
