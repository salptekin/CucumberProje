package day05typecasting;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan aldiginiz sekille asagidaki gibi bir gorunum olusturun
		      A
		     A A
		    A A A 
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir character giriniz");
		char ch = scan.next().charAt(0);
		
		System.out.println("  " + ch + "  ");
		System.out.println(" " + ch + " " + ch + " ");
		System.out.println(ch + " " + ch + " " + ch);

		scan.close();
	}

}
