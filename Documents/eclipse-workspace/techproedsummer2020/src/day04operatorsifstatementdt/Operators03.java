package day04operatorsifstatementdt;

import java.util.Scanner;

public class Operators03 {

	public static void main(String[] args) {
		/*
		  Ask user to enter two integer values. Write a Java Program to swap 
          two numbers without using the third variable.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me 2 integers to swap");
		int a = scan.nextInt();
		int b = scan.nextInt();		
		System.out.println("Before swapping");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		a = a + b;		
		b = a - b;	
		a = a - b;		
		System.out.println("After swapping");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		scan.close();
	}
}
