package day03operatorsifstatementnt;
import java.util.Scanner;

public class Operators02 {

	public static void main(String[] args) {
		// Ask user to enter two integer values. Write a Java Program to swap
		// two numbers by using the third variable.
		// a=12 b=5  ==> a=5 b=12
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter two integers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = 0;
		System.out.println("Before swapping");
		System.out.println(a);
		System.out.println(b);

		c = a;
		a = b;
		b = c;
		System.out.println("After swapping");
		System.out.println(a);
		System.out.println(b);
		scan.close();
	}
}
