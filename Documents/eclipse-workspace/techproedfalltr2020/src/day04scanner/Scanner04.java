package day04scanner;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		
		/*
		 Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini alip
		 o dikdortgenin alan ve cevresini hesaplayip ekrana yazdiran 
		 programi olusturunuz
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Dikdortgenin kisa kenarini giriniz");
		double kisa = scan.nextDouble();
		System.out.println("Dikdortgenin uzun kenarini giriniz");
		double uzun = scan.nextDouble();
		System.out.println("Alan= " + kisa*uzun);
		System.out.println("Cevre= " + (2*kisa + 2*uzun));
		
		scan.close();
	
	}

}
