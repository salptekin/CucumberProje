package day02variablesscannernt;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		//Get two integers from user and print their sum and product on the console

		//1. Step
		Scanner scan = new Scanner(System.in);
		//2. Step
		System.out.println("Give me two integers");
		//3. Step
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("Sum: " + (num1 + num2));
		System.out.println("Product: " + (num1 * num2));
		scan.close();
	}
}
