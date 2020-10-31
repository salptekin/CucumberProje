package day13whileloop;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		
		/*
		 Kullanıcıdan başlangıç ve bitiş harflerini alın ve başlangıç harfinden başlayıp bitiş harfinde 
         biten tüm harfleri büyük harf olarak ekrana yazdırın.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic ve bitis harflerini veriniz");
		char bas = scan.next().toUpperCase().charAt(0);
		char bit = scan.next().toUpperCase().charAt(0);
		
		if(!(bas>='A' && bas<='Z') || !(bit>='A' && bit<='Z')) {
			
			System.out.println("Lutfen harf giriniz");
			
		}else if(bas<=bit) {
			
			for(char i=bas; i<=bit; i++) {
				System.out.print(i + " ");
			}
			
		} else {
			
			for(char i=bas; i>=bit; i--) {
				System.out.print(i + " ");
			}
			
		}
		
		scan.close();

	}

}
