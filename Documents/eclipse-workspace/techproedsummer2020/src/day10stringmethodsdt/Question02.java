package day10stringmethodsdt;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		 Type java code by using switch statement.
         A school has following rules for grading system:
         1.For 50 - C  2.For 80 - B  4.For 100 - A
         Ask user to enter marks and print the corresponding grade. 
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your grade, select one of 50, 80, 100");
		int grade = scan.nextInt();
		
		switch(grade) {
		case 50:
			System.out.println("C");
			break;
		case 80:
			System.out.println("B");
			break;
		case 100:
			System.out.println("A");
			break;
		default:
			System.out.println("Select just one of 50, 80, 100");
		}		
		scan.close();
	}
}
