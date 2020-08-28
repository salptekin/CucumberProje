package day04operatorsifstatementdt;

import java.util.Scanner;

public class Operators02 {

	public static void main(String[] args) {
		/*
		  Ask user to enter two integer values. Write a Java Program to swap
          two numbers by using the third variable. 
          a=3, b=5 after swapping a=5, b=3
		*/		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me 2 integers to swap");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = 0;
		System.out.println("Before swapping");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		scan.close();
	}
}
