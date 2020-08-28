package interviewcodequestionsnt;

import java.util.Scanner;

public class Q05 {
	
	/*
	 Ask user to enter a String
	 Check if it is palindrome or not. Its reverse will be same with the String itself, like 121 or abba
	*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to check if it is palindrome or not");
		String s = scan.nextLine();
		
		String rs = "";
		
		for(int i = s.length()-1; i>=0; i--) {			
			rs = rs + s.charAt(i);			
		}
		System.out.println("Normal String: " + s);
		System.out.println("Reversed String: " + rs);
		
		if(s.equals(rs)) {
			System.out.println(s + " is a palindrome");
		}else {
			System.out.println(s + " is not a palindrome");
		}

	}

}
