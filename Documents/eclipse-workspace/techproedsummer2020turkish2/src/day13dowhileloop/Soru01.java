package day13dowhileloop;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve 
		 başlangıç değerinden başlayıp bitiş değerinde 
         biten tüm tamsayıların çarpımını ekrana yazdırın.
		*/	
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic degerini giriniz");
		int baslangic = scan.nextInt();
		System.out.println("Bitis degerini giriniz");
		int bitis = scan.nextInt();
		
		int product = 1;
		while(baslangic<=bitis) {	
			product = product * baslangic;
			baslangic++;	
		}
		System.out.println(product);

	}

}
