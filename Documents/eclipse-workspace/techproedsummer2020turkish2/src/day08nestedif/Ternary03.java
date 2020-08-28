package day08nestedif;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir character alın 
		 Eğer character bir harf ise ekrana “Harf” yazdırın. 
         Diğer durumlarda ekrana “Harf değil” yazdırın.
         Ternary kullanin.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir character giriniz");
		char ch = scan.next().charAt(0);
		
		String result = (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ? "Harf" : "Harf degil";
		System.out.println(result);

		scan.close();
	}
}
