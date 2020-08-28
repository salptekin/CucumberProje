package day04ifstatementnt;

import java.util.Scanner;

public class IfElseStatement05 {

	public static void main(String[] args) {
		/*
		 Get two numbers from user, if they are equal 
		 print "Numbers are equal" on the console otherwise
		 print "Numbers are not equal"
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		if(num1==num2) {
			System.out.println("Numbers are equal");
		}else {
			System.out.println("Numbers are not equal");
		}
		scan.close();
	}
}
