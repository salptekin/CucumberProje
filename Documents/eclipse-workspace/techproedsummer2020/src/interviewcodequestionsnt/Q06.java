package interviewcodequestionsnt;

import java.util.Scanner;

public class Q06 {
	
	/*
	 Type a program to check if the number user entered is the power of 2 or not?
	 2 = 2    4 = 2x2     8 = 2x2x2    16 = 2x2x2x2
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check if it is a power of two");
		int n = scan.nextInt();

		if(n==0) {
			System.out.println("It is not the power of 2");
		}else {	
			while(n!=1) {
				if(n%2!=0) {
					System.out.println("It is not the power of 2");
					break;
				}else {
					n = n/2;
				}
			}
		}
		
		if(n==1) {
			System.out.println("It is the power of 2");
		}	
	}
}
