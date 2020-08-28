package interviewcodequestionsnt;

import java.util.Scanner;

public class Q01 {
	
	/*
	 1)Create a package, name it as "interviewcodequestionsnt"
	 2)Create a class, name it as "Q01"
	 3)Create a method to count the number of words in a String which user entered.
	 4)Create a method to count the number of letters in a String which user entered.
	*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to count its words");
		String s = scan.nextLine();
		countWords(s);
		countLetters(s);
		scan.close();
		
	}
	//3. Step
	public static void countWords(String s) {		
		String a[] = s.split(" ");
		System.out.println("Number of words: " + a.length);
	}
	
	//4. Step
	public static void countLetters(String s) {
		String rs = s.replaceAll("\\W", "");
		System.out.println("Number of letters: " + rs.length());
	}
}