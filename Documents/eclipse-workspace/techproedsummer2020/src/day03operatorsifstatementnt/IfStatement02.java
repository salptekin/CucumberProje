package day03operatorsifstatementnt;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
    //Get the number from user.
	//Type java code, if an integer is even, output will be “The integer is even”. 
	//If the integer is odd, output will be “The integer is odd”.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me an integer");
		int a = scan.nextInt();
		
		if(a%2==0) {
			System.out.println("The integer is even");
		}
		if(a%2!=0) {
			System.out.println("The integer is odd");
		}
		scan.close();
	}
}
