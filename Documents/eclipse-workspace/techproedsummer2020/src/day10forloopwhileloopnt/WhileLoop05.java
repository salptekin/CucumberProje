package day10forloopwhileloopnt;

import java.util.Scanner;

public class WhileLoop05 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a number.
		 1)Create multiplication table for the number user entered by using for loop
		 2)Create multiplication table for the number user entered by using while loop
		 For example; if user enters 12, the output will be like 
		              12x1=12, 12x2=24, ... ,12x10=120
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer to see its multipication table");
		int num = scan.nextInt();
		
		//1. Way by for-loop
		for(int i=1; i<=10; i++) {
			System.out.println(num + "x" + i + "=" + num*i);
		}
		
		//2. Way by while-loop
		int i=1;
		while(i<=10) {
			System.out.println(num + "x" + i + "=" + num*i);
			i++;
		}
		
		scan.close();

	}

}
