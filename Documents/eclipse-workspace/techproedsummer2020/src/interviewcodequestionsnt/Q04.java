package interviewcodequestionsnt;

import java.util.Scanner;

public class Q04 {
	
	/*
	 Ask user to print how many fibonacci numbers.

	 1      1     2      3      5      8      13      21 ...

	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many fibonacci numbers do you want to see?");
		int num = scan.nextInt();
		
		int f1 = 1;
		int f2 = 1;
		int fn = 0;
		System.out.print(f1 + " ");
		System.out.print(f2 + " ");
		
		for(int i=1; i<=num-2; i++) {
			fn = f1 + f2;
			f1 = f2;
			f2 = fn;
			System.out.print(fn + " ");
		}

	}

}
