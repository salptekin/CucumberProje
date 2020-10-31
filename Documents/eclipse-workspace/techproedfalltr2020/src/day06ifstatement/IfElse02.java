package day06ifstatement;

import java.util.Scanner;

public class IfElse02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir character aliniz.
		 Bu character harf ise console'a "Harf" yazdirin
		 Harf degil ise console'a "Harf Degil" yazdirin.
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir character giriniz");
		char ch = scan.next().charAt(0);
		
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
			System.out.println("Harf");
		}else {
			System.out.println("Harf Degil");
		}
		
		scan.close();

	}

}
