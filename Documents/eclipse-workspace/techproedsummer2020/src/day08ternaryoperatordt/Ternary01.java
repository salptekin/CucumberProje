package day08ternaryoperatordt;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		// Ask user to enter an integer
		// If the integer is greater than 10 print "Good" on the console
		// Otherwise, print "Bad" on the console
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		
		//1. Way: Use if-else statement to solve
		if(a>10) {
			System.out.println("Good");
		}else {
			System.out.println("Bad");
		}
		
		//2. Way: Use Ternary Operator to solve
		String result = a>10 ? "Good" : "Bad";
		System.out.println(result);

		scan.close();

	}

}
