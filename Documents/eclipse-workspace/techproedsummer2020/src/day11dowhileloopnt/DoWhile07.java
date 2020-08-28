package day11dowhileloopnt;

import java.util.Scanner;

public class DoWhile07 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a String
		 Print the characters whose indexes are odd on the console
		 For example; Germany ==> e m n 
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		int idx = 0;
		
		do {			
			if(idx%2!=0) {
				System.out.print(str.charAt(idx) + " ");
			}			
			idx++;				
		}while(idx<str.length());
		
		scan.close();

	}

}
