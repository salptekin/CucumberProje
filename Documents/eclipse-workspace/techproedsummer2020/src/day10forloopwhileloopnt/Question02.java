package day10forloopwhileloopnt;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		 Ask user to enter his/her first name, last name and Social Security Number. 
         Then type a program which makes initials of the first name and 
         the last name in upper case, other characters will be in lower case.
         All characters except last 4 characters of the Social Security Number “ * ”.
                       For example; Suleyman Alptekin *****5678
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName = scan.next();//If user enters sULEYMan
		
		System.out.println("Enter your last name");
		String lastName = scan.next();//If user enters cAN
		
		System.out.println("Enter your SSN");
		String ssn = scan.next();
		
		String initialOfFirst = firstName.substring(0, 1).toUpperCase();//S
		String othersOfFirst = firstName.substring(1).toLowerCase();//uleyman
		System.out.println(initialOfFirst + othersOfFirst);//Suleyman
		
		String initialOfLast = lastName.substring(0,1).toUpperCase(); //C
		String othersOfLast = lastName.substring(1).toLowerCase();//an
		System.out.println(initialOfLast + othersOfLast);//Can
		
		//SSN has 9 digits ==> 123456789	
		String firstFiveDigits = ssn.substring(0, 5).replaceAll("\\d", "*");	
		String lastFourDigits = ssn.substring(5);	
		System.out.println(firstFiveDigits + lastFourDigits);
		
		scan.close();
	}
}
