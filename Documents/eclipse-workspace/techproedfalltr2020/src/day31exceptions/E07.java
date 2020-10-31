package day31exceptions;

import java.util.Scanner;

public class E07 {
	
	/*
	 		IllegalArgumentException
	*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yasinizi giriniz");
		int age = scan.nextInt();
		
		if(age<0) {
			throw new IllegalArgumentException();
		}else {
			System.out.println(age);
		}

	}

}
