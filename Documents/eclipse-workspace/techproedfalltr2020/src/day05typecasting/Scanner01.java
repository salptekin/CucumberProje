package day05typecasting;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		/*
		 Kenar uzunlukları kullanıcıdan alınan bir üçgenin çevresini hesaplayan bir 
         program yazınız. (byte kullanınız)
         Not: Üçgenin Cevresi: a + b + c
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ucgenin kenar uzunluklarini giriniz");
		byte k1 = scan.nextByte();
		byte k2 = scan.nextByte();
		byte k3 = scan.nextByte();
		
		int cevre = k1 + k2 + k3;
		
		//Parantez iclerini mumkun oldugu kadar basit tutun
		System.out.println("Cevre: " + cevre);

		scan.close();
	}

}
