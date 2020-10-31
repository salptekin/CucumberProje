package day06ifstatement;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		/*
		 If it rains I will cancel picnic
		 */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Iki sayi giriniz");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
	
		if(a > b) {
			System.out.println("Ilk sayi buyuk");
		}
		
		if(a < b) {
			System.out.println("Ikinci sayi buyuk");
		}
		
		if(a == b) {
			System.out.println("Iki sayi birbirine esit");
		}
		
		scan.close();

	}

}
