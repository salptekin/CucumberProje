package day12forloop;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan başlangıç ve bitiş değerlerini alın 
		 Başlangıç değerinden başlayıp bitiş değerinde biten tüm tamsayıları ekrana yazdırın.
		 Ornek: Kullanici 10 ve 15 verirse ==> 10 11 12 13 14 15
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic degerini giriniz");
		int bas = scan.nextInt();
		System.out.println("Bitis degerini giriniz");
		int bit = scan.nextInt();
		
		if(bas>bit) {
			System.out.println("Baslangic degeri bitis degerinden kucuk olmali");
		}else {
			for(int i=bas; i<=bit;     i++) {
				System.out.print(i + " ");
			}	
		}
		scan.close();

	}

}
