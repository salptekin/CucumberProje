package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		/*
		 Kullanicidan sayi alin
		 Bu sayi 0'dan 9'a kadar ise ekrana "Rakam" yazdirin ==> &&
		 9'dan buyuk veya 0'dan kucuk ise ekrana "Sayi" yazdirin ==> ||
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int num = scan.nextInt();
		
		if(num>=0 && num<=9) {
			System.out.println("Rakam");
		}
		
		if(num<0 || num>9) {
			System.out.println("Sayi");
		}
		
		scan.close();

	}

}
