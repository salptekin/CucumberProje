package day06nestedifternarynt;

import java.util.Scanner;

public class TernaryOperator04 {

	public static void main(String[] args) {
		/*
		 Type java code by using using ternary.
         Take values of length and width of a rectangle from user 
         and check if it is square or not.
         Hint: If the length and width are equal to each other it is square otherwise it is rectangle
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length and width for a rectangle");
		int length = scan.nextInt();
		int width = scan.nextInt();
		
		String result = length==width ? "Square" : "Rectangle";
		System.out.println(result);
		
		scan.close();
	}
}
