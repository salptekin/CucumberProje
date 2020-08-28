package day04ifstatementnt;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		/*
		 Type java code by using if-else statement.
         A shop will give discount of 10% if the cost of purchased quantity 
         is more than 1000. Ask user for quantity and unit price then 
         judge and print total cost for user. 
         If the quantity is less than 1000 output will be “No discount.”
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the quantity");
		int qty = scan.nextInt();
		System.out.println("Enter the unit price");
		int unitPrice= scan.nextInt();
		
		if(qty>1000) {
			System.out.println(unitPrice*0.90*qty);
		}else {
			System.out.println("No discount");
		}
		scan.close();
	}
}
