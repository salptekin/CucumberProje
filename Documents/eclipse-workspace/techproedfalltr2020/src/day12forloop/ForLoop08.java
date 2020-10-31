package day12forloop;

import java.util.Scanner;

public class ForLoop08 {

	public static void main(String[] args) {
		/*
		 Kullanicidan baslangic ve bitis degerlerini aliniz.
		 Baslangic ve bitis degerleri nasil olursa olsun baslangic degerinden 
		 bitis degerine kadar tum sayilarin carpimini hesaplayan programi yaziniz.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic degerini giriniz");
		int bas = scan.nextInt();
		System.out.println("Bitis degerini giriniz");
		int bit = scan.nextInt();
		
		int carpim = 1;
		
		if(bas<=bit) {
			
			for(int i=bas; i<=bit; i++) {
				carpim = carpim * i;
			}
		
			
		} else {
			
			for(int i=bas; i>=bit; i--) {
				carpim = carpim * i;
			}		
			
		}
		
		System.out.println("Carpim: " + carpim);
		
		scan.close();

	}

}
