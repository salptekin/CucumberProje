package day02variablesscannernt;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		//How to get data from user ?
		//1. Step
		Scanner scan = new Scanner(System.in);
		
		//2. Step: Informing user about the data which I want
		System.out.println("Please, give me an integer to calculate its square");
		
		//3. Step: Get the data and assign it to a variable
		int num1 = scan.nextInt();
		
		System.out.println("Square: " + num1*num1);
		System.out.println("Cube: " + num1*num1*num1);
		scan.close();
	}
}
