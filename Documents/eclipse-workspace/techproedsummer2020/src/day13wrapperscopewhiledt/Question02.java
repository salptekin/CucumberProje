package day13wrapperscopewhiledt;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a word which has 4 letters and output will be 
		 the inverse of the word.
         For example; if user enters “MARK” output will be “KRAM”
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word which has 4 characters");
		String str = scan.nextLine();
		
		char ch4 = str.charAt(3);
		char ch3 = str.charAt(2);
		char ch2 = str.charAt(1);
		char ch1 = str.charAt(0);
		
		System.out.println("" + ch4 + ch3 + ch2 + ch1);//KRAM
		
		scan.close();

	}

}
