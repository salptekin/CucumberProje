package day06nestedifternarynt;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		/*
		 Type java code by using ternary and if-else. 
		 Ask user to enter two integers
         Write a program to print the minimum one on the console.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two integers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		//1. Way if-else
		if(a<=b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
		//2. Way ternary
		int result = a<=b ? a : b;
		System.out.println(result);
		
		//3. Way
		System.out.println(a<=b ? a : b);
		
		scan.close();
	}

}
