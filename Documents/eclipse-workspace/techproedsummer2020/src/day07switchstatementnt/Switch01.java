package day07switchstatementnt;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		/*
		 Ask user to enter letter
		 If the letter is 'A' print on the console "First letter"
		 If the letter is 'B' print on the console "Second letter"
		 If the letter is 'C' print on the console "Third letter"
		 If the letter is 'D' print on the console "Fourth letter"
		 Otherwise print on the console "What kind of letter is this?"
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a letter");
		char l = scan.next().toUpperCase().charAt(0);
		
		//1. Way: Solve the question by using if-else if()
		if(l=='A') {
            System.out.println("First letter");
        }else if(l=='B') {
            System.out.println("Second letter");
        }else if(l=='C') {
            System.out.println("Third letter");
        }else if(l=='D') {
            System.out.println("Fourth letter");
        }else {
            System.out.println("What kind of letter is this?");
        }
		
		//2. Way: Switch Statement
		switch(l) {
			case 'A':
				System.out.println("First letter");
				break;
			case 'B':
				System.out.println("Second letter");
				break;
			case 'C':
				System.out.println("Third letter");
				break;
			case 'D':
				System.out.println("Fourth letter");
				break;
			default:
				System.out.println("What kind of letter is this?");
		}
		scan.close();
	}

}
