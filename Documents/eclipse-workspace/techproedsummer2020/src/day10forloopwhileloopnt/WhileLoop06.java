package day10forloopwhileloopnt;

import java.util.Scanner;

public class WhileLoop06 {

	public static void main(String[] args) {
		/*
		 Type java code by using while loop, 
         write a program to count the factors of an integer which is entered by user.
         For example; if user enters 12 ==> 1, 2, 3, 4, 6, 12 ==> print on the console 6
                      if user enters 10 ==> 1, 2, 5, 10 ==> print 4 on the console
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		
		int i=1;
		int count=0;
		
		while(i<=num) {
			if(num%i==0) {
				System.out.print(i + " ");
				count++;
			}
			i++;
		}
		System.out.println();
		
		System.out.println("The number of factors: " + count);
		
		scan.close();

	}

}
