package day12forloop;

import java.util.Scanner;

public class ForLoop06 {

	public static void main(String[] args) {
		/*
		 Baslangic ve bitis degerlerini kullanicidan alin.
		 Baslangic degerinden bitis degerine kadar tum tamsayilarin toplamini hesaplayan programi yaziniz
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic degerini giriniz");
		int bas = scan.nextInt();
		System.out.println("Bitis degerini giriniz");
		int bit = scan.nextInt();
		
		int toplam = 0;

		for(int i=bas; i<=bit; i++) {	
			toplam = toplam + i;	
		}
		System.out.println("Toplam: " + toplam);

		scan.close();
	}

}
