package day07switchstatementnt;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		/*
		Use switch statement to solve the following task
		Ask user to enter the number of the day
		If the number of the day is 1 then print on the console Sunday
		If the number of the day is 2 then print on the console Monday
		.
		.
		.
		If the number of the day is 7 then print on the console Saturday
		Otherwise print "Please enter a valid day number" 
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number of day");
		int dayNum = scan.nextInt();
		
		switch(dayNum) {
			case 1:
				System.out.println("Sunday");
				//break;
			case 2:
				System.out.println("Monday");
				//break;
			case 3:
				System.out.println("Tuesday");
				//break;
			case 4:
				System.out.println("Wednesday");
				//break;
			case 5:
				System.out.println("Thursday");
				//break;
			case 6:
				System.out.println("Friday");
				//break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Enter a valid day number");
		}
		scan.close();
	}
}
