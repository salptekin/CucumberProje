package day06ifstatement;

import java.util.Scanner;

public class Swap01 {

	public static void main(String[] args) {
		/*
		 a variable'inin degeri 12, b variable'inin degeri 25 olsun.
		 Oyle bir kod yaziniz ki a 25, b 12 olsun.
		 Sayilari kullanicidan alin.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Iki sayi giriniz");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		System.out.println("===========");
		
		//1. Yol: Ucuncu bir variable kullandik
		double temp = 0;
		temp = a; // temp = 12    a = 12     b = 25
		a = b;    // temp = 12    a = 25     b = 25
		b = temp; // temp = 12    a = 25     b = 12
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		System.out.println("===========");
		
		//2. Yol: Ucuncu bir variable kullanma
		a = a + b;
		b = a - b;
		a = a - b; 
		System.out.println("a: " + a);
		System.out.println("b: " + b);

	}

}
