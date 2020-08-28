package day11dowhileloopnt;

import java.util.Scanner;

public class DoWhile05 {

	public static void main(String[] args) {
		/*
		 Ask user to enter his/her first name
		 If the initial is lower case print a message like "Make the initial upper case"
		 If the initial is upper case print a message like "You did it right"
		*/
		
		Scanner scan = new Scanner(System.in);
		char name = 'a';
		
		do {
			System.out.println("Enter your first name");
			name = scan.next().charAt(0);
			
			if(name>='A' && name<='Z') {
				System.out.println("You did it right");
			}else {
				System.out.println("Make the initial upper case");
			}
			
		}while(!(name>='A' && name<='Z'));
		
		scan.close();

	}

}
