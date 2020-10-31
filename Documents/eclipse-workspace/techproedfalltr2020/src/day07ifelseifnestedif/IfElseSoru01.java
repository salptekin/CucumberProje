package day07ifelseifnestedif;

import java.util.Scanner;

public class IfElseSoru01 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. 
		 Eğer urun miktarı 1000'den fazla ise kullanıcıya %10 indirim yapın ve 
		 ödemesi gereken toplam parayı ekrana yazdırın. 
		 Diğer durumlarda ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın.
	    */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Urun miktarini giriniz");
		int qty = scan.nextInt();
		System.out.println("Urun birim fiyatini giriniz");
		double price = scan.nextDouble();
		
		if(qty>1000) {
			System.out.println("%10 indirimli fiyat: " + price*0.9*qty);
		} else {
			System.out.println("Indirimsiz fiyat: " + price*qty);
		}
		scan.close();
	}

}
