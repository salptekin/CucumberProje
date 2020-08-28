package day08ternaryoperatordt;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		/*
		 Type java code by using if-else and ternary. 
		 Ask user to enter two integers
         Write a program to print the minimum one on the console.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two integers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		//1. Way: Use if-else
		if(a<=b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
		//2. Way: Use Ternary
		int result = a<=b ? a : b;
		System.out.println(result);
		
		scan.close();

	}

}
