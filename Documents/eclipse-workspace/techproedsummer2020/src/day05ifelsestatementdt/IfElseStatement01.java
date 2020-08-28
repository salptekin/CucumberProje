package day05ifelsestatementdt;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
	//Ask user to give you an integer, 
	//If the integer is less than 10, print "You won!" on the console
    //Otherwise, print "You lost!" on the console.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me an integer to play");
		int a = scan.nextInt();
		
		//1. Way: Solve the question by using if-else statement
		//In if-else there is just one condition; because of that
		//Java checks just one condition. But if you use double if, 
		//you will have two conditions to check, it is more task to do.
		//Therefore, we prefer to use if-else instead of double if
		if(a<10) {
			System.out.println("You won!");
		} else{
			System.out.println("You lost!");
		}
		System.out.println("The game finished");
		
		//1. Way: Solve the question just by using if statement
		if(a<10) {
			System.out.println("You won!");
		}
		if(a>=10) {
			System.out.println("You lost!");
		}
		System.out.println("The game finished");
		
        scan.close();
	}
}
