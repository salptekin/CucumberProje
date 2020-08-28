package day04ifstatementnt;

import java.util.Scanner;

public class IfElseStatement04 {

	public static void main(String[] args) {
		/*
		 Type java code by using if-else statement, 
         Write a program to print absolute value of a number entered by user.
         To calculate absolute value of a number, multiply the number by its sign
         For example; if the number is +3, absolute value is (+1) * (+3)
                      if the number is -5, absolute value is (-1) * (-5)
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to get its absolute value");
		int num = scan.nextInt();
		
		if(num>=0) {
			System.out.println((+1)*num);
		}else {
			System.out.println((-1)*num);
		}
		scan.close();

	}

}
