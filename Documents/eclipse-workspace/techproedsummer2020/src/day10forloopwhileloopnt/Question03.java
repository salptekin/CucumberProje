package day10forloopwhileloopnt;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a letter, 
		 If it is upper case check if it is before “F” or not in alphabetical order.
		 If it is before “F” output will be “Big before F”,  
		 otherwise output will be “Big after or on F.” 
		 
		 If it is lower case check if it is before “h” or not in alphabetical order. 
         If it is before “h” output will be “Small before h”, 
         otherwise “Small after h”
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a letter");
		char ch = scan.next().charAt(0);
		
		if(ch>='A' && ch<='Z') {
			
			if(ch<'F') {
				System.out.println("Big before F");
			}else {
				System.out.println("Big after or on F");
			}
			
		}else if(ch>='a' && ch<='z') {
			
			if(ch<'h') {
				System.out.println("Small before h");
			}else {
				System.out.println("Small after or on h");
			}
			
		}else {
			System.out.println("Please, enter a letter");
		}
		
		scan.close();

	}

}
