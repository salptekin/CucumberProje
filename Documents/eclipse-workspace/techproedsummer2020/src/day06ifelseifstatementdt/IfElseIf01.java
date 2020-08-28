package day06ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {
		// Ask user to enter an integer
		// If the number is greater than 0 print "Positive" on the console
		// If the number is less than 0 print "Negative" on the console
		// If the number is equal to 0 print "Neutral" on the console
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me an integer");
		int a = scan.nextInt();
		
		//If you want you can use else if() for every condition
		if(a>0) {
			System.out.println("Positive");
		}else if(a<0) {
			System.out.println("Negative");
		}else if(a==0) {
			System.out.println("Neutral");
		}
		
		//If you are sure the last condition covers all other possibilities
		//you can use just else instead of else if()
		if(a>0) {
			System.out.println("Positive");
		}else if(a<0) {
			System.out.println("Negative");
		}else {
			System.out.println("Neutral");
		}
		
		scan.close();
	}
}
