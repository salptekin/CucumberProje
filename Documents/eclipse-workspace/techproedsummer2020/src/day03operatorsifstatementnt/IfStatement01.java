package day03operatorsifstatementnt;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		//Ask user to enter an integer, if the integer is odd
		//then print it on the console, otherwise do not print
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter an integer");
		int a = scan.nextInt();
		
		if(a%2 != 0){
			System.out.println("The number is odd: " + a);
		}	
		scan.close();
	}
}
