package day02variablesscannerdt;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		/*
		 Type a program which calculates the area and the perimeter of a square 
         whose side length is entered by user. 
         Hint 1: Area of a square is length x length
         Hint 2: Perimeter of a square is 4 x length
		 */
		
		//1. Step
		Scanner scan = new Scanner(System.in);
		//2. Step
		System.out.println("Please enter the side length");
		//3. Step
		double sideLength = scan.nextDouble();
		System.out.println("The area: " + (sideLength*sideLength));
		System.out.println("The perimeter: " + (4*sideLength));
		scan.close();
	}
}
