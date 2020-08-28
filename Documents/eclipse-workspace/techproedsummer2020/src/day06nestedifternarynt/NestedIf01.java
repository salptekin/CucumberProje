package day06nestedifternarynt;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		// Ask user to enter gender and age
		// If the gender is "male" then check if the age is less than 20 or not.
		// If the age is less than 20 print "Boy" on the console, otherwise print "Man"
		// If the gender is "female" then check if the age is less than 20 or not.
		// If the age is less than 20 print "Girl" on the console, otherwise print "Woman"
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your gender");
		//If you want to convert all letters in a String to lowercase use toLowerCase() 
		String gender = scan.next().toLowerCase();
		System.out.println("Enter your age");
		int age = scan.nextInt();
		
		if(gender.equals("male")) {
			
			if(age<20) {
				System.out.println("Boy");
			}else {
				System.out.println("Man");
			}
			
			
		}else if(gender.equals("female")) {
			
			if(age<20) {
				System.out.println("Girl");
			}else {
				System.out.println("Woman");
			}

		}else {
			System.out.println("There is no any definition for other genders");
		}
		scan.close();
	}
}
