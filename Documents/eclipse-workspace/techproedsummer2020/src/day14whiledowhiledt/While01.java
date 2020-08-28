package day14whiledowhiledt;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		/* Interview Question
		 Type java code by using while loop, 
         Write a program that prompts the user to input a positive integer. 
         It should then print factorial of that number. 
                      5 factorial(5!) = 1x2x3x4x5
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		
		//1. Way by using for-loop
		int product = 1;		
		for(int i=1; i<=num; i++) {		
			product = product * i;			
		}		
		System.out.println(product);
		
		//2. Way by using while loop
		int prdct = 1;
		int i =1;
		while(i<=num) {
			prdct = prdct * i;
			i++;
		}
		System.out.println(prdct);	
		
		scan.close();

	}

}
