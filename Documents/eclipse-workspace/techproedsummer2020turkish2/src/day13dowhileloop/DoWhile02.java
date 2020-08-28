package day13dowhileloop;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alin
		 Sayi cift sayi ise ekrana "Kazandiniz" yazdirin
		 Sayi tek sayi ise ekrana "Kaybettiniz" yazdirin ve yeni bir sayi isteyin
		 */
		
		Scanner scan = new Scanner(System.in);
		int s = 12;
		
		do {
			if(s%2!=0) {
				System.out.println("Kaybettiniz");
			}
			System.out.println("Bir sayi giriniz");
			s = scan.nextInt();			
		}while(s%2!=0);		
		System.out.println("Kazandiniz");
		
		scan.close();

	}

}
