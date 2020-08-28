package day11dowhileloopnt;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		// Ask user to enter an integer
		// If the integer is even print on the console "You won!"
		// otherwise ask user to enter another integer
		
		Scanner scan = new Scanner(System.in);
		int num=1;
		
		do {
			System.out.println("Enter an integer");
			num = scan.nextInt();
		}while(num%2!=0);
		
		System.out.println("You won!");
		
		scan.close();

	}

}
