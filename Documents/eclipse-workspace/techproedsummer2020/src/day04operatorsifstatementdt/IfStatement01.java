package day04operatorsifstatementdt;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		//Get an integer from user, 
		//if the integer is positive print "Positive" on the console
		//if the integer is negative print "Negative" on the console
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me an integer");
		int num = scan.nextInt();
		
		if(num>0) {
			System.out.println("Positive");
		}
		
		if(num<0) {
			System.out.println("Negative");
		}
		
		if(num==0) {
			System.out.println("Neither positive nor negative");
		}
		scan.close();
	}
}
