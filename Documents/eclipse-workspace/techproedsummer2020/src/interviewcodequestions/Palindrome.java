package interviewcodequestions;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to check if it is palindrome or not?");
		String s = scan.nextLine();
		isPalindrome(s);
        scan.close();
	}
	
	public static void isPalindrome(String s) {
		String rs = "";
		for(int i=s.length()-1; i>=0; i--) {
			rs = rs + s.charAt(i);
		}
		if(s.equals(rs)) {
			System.out.println(s + " is a palindrome String");
		}else {
			System.out.println(s + " is not a palindrome String");
		}
	}
}
