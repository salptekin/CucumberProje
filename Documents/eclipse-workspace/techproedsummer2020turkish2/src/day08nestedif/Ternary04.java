package day08nestedif;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alin
		 Bu sayi tek sayi ise karesini ekrana yazdirin
		 Bu sayi cift sayi ise yarisini ekrana yazdirin
		 Ternary kullanin
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi = scan.nextInt();
		
		int result = sayi%2==0 ? sayi/2 : sayi*sayi;
		System.out.println(result);
		
		scan.close();
	
	}

}
