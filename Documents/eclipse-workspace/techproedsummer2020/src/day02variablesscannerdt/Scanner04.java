package day02variablesscannerdt;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		/*
		 Type a program which calculates the area and the perimeter of a rectangle 
         whose length and width are entered by user. 
         Hint 1: Area of a rectangle is width x length
         Hint 2: Perimeter of a rectangle is 2x(width + length) 
		*/
		
		//1. Step
		Scanner scan = new Scanner(System.in);
		//2. Step
		System.out.println("Please enter width and length of rectangle");
		//3. Step
		double width = scan.nextDouble();
		double length = scan.nextDouble();
		System.out.println("The area: " + (width*length));
		System.out.println("The perimeter: " + (2*(width+length)));
		scan.close();
	}
}
