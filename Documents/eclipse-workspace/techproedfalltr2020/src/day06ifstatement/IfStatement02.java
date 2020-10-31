package day06ifstatement;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
		/*
		 Kulanicidan bir sayi alin bu sayi cift sayi ise console'a "Cift"
		 tek sayi ise console'a "Tek" yazdirtin.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir integer giriniz");
		int a = scan.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("Cift");
		}
		
		if(a % 2 != 0) {
			System.out.println("Tek");
		}
		
		scan.close();

	}

}
