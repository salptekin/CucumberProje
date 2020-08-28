package day10forloopwhileloopnt;

import java.util.Scanner;

public class WhileLoop07 {

	public static void main(String[] args) {
		/*
		 Type java code by using while loop, 
         Write a program that prompts the user to input an integer. 
         It should then find sum of the digits of that number. 
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		
		int sum=0;
		while(num!=0) {
			
			int lastDigit = num%10;
			sum = sum + lastDigit;
			num = num/10;
			
		}
		System.out.println(sum);
		
		scan.close();

	}

}
