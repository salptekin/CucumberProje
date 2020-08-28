package day06ifstatement;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alin 
		 Sayi negatif ise ekrana "Negatif" yazdirin
		 Sayi pozitif ise ekrana "Pozitif" yazdirin
		 Sayi 0 ise ekrana "Notr" yazdirin
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int num = scan.nextInt();
		
		if(num>0) {
			System.out.println("Pozitif");
		}
		if(num<0) {
			System.out.println("Negatif");
		}
		if(num==0) {
			System.out.println("Notr");
		}
		
		scan.close();

	}

}
