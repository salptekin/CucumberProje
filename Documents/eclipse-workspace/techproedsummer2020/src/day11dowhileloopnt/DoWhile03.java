package day11dowhileloopnt;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// Ask user to enter a number
		// If the number user entered is less than 10 print "Won!" on the console
		// otherwise ask user to enter a number again.
		
		Scanner scan = new Scanner(System.in);
		int num=1;
		
		do {
			System.out.println("Enter a number");
			num = scan.nextInt();
		}while(num>=10);
		
		System.out.println("Won!");
		
		scan.close();

	}

}
