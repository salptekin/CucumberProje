package day02variablesscannerdt;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		// Get two integers from user
		// Print their sum and product and division on the console
		
		//1. Step
		Scanner scan = new Scanner(System.in);
		//2. Step
		System.out.println("Please, enter two integers to add, multiply, and division");
		//3. Step
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("The sum: " + (num1+num2));
		System.out.println("The product: " + (num1*num2));
		System.out.println("The division: " + (num1/num2));
		scan.close();
	}
}
