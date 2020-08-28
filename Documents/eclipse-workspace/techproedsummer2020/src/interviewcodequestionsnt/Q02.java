package interviewcodequestionsnt;

import java.util.Arrays;
import java.util.Scanner;

public class Q02 {
	
	/*
	 Create a function that takes an array and returns the difference between the biggest and the smallest numbers.
	 Ask user to enter array elements.
	*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = scan.nextInt();
		int a[] = new int[length];
		
		System.out.println("Enter the array elements");
		for(int i=0; i<length; i++) {
			a[i] = scan.nextInt();
		}		
		System.out.println(Arrays.toString(a));		
		Arrays.sort(a);		
		System.out.println(Arrays.toString(a));
		System.out.println(a[a.length-1] - a[0]);	
		
	}
}
