package day04ifstatementnt;

import java.util.Scanner;

public class IfQuestion02 {

	public static void main(String[] args) {
		/*
		 Type java code by using if statement. When you enter the name 
		 of the day of a week, output will be “Weekday” or “Weekend day” 
		 according to the name of the day.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the day");
		String day = scan.nextLine();
		//For Strings do not use "==" as a comparison operator
		//To compare two Strings use equals() method
		if(day.equals("Monday")) {
			System.out.println("Weekday");
		}
		if(day.equals("Tuesday")) {
			System.out.println("Weekday");
		}
		if(day.equals("Wednesday")) {
			System.out.println("Weekday");
		}
		if(day.equals("Thursday")) {
			System.out.println("Weekday");
		}
		if(day.equals("Friday")) {
			System.out.println("Weekday");
		}
		if(day.equals("Saturday")) {
			System.out.println("Weekend day");
		}
		if(day.equals("Sunday")) {
			System.out.println("Weekend day");
		}	
		scan.close();
	}
}
