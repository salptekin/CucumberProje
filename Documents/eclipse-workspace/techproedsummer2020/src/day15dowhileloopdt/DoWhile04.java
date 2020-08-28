package day15dowhileloopdt;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		// Ask user to enter an integer
		// If the integer is even print on the console "You won!"
		// otherwise ask user to enter another integer

		Scanner scan = new Scanner(System.in);
		int i = 1;
		
		do {
			System.out.println("Enter an integer");
			i = scan.nextInt();
		}while(i%2!=0);
		
		System.out.println("You won!");
		
		scan.close();
	}

}
