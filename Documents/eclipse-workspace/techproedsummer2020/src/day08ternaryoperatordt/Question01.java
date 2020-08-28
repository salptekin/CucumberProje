package day08ternaryoperatordt;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 Ask user to enter his/her age and gender. 
		 If the age is more than 65 and the gender is male
         then output will be “Hey man you retired!” else output will be “No need to work"
		*/		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your gender");
		String gender = scan.next();
		System.out.println("Enter your age");
		int age = scan.nextInt();
		
		if(age>65 && gender.equalsIgnoreCase("male")) {
			System.out.println("Hey man, you are retired!");
		}else {
			System.out.println("No need to work");
		}
		scan.close();
	}
}
