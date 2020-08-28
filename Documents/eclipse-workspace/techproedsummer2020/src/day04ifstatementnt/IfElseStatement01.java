package day04ifstatementnt;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		
		//Ask user to enter an integer.
		//If the integer is positive print "Positive" on the console
		//Otherwise print "Not positive" on the console
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		
		//Solve the task by using if-else statement
		if(num>0) {
			System.out.println("Positive if else");
		}else {
			System.out.println("Not positive if else");
		}
		
		//Solve the task by using if statement
		if(num>0) {
			System.out.println("Positive if");
		}
		if(num<=0) {
			System.out.println("Not positive if");
		}	
		scan.close();
	}
}
