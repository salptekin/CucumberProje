package day05incrementdecrement;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/*
		 0)Sayilari kullanicidan alin
		 1)Iki tane integer variable olusturun a=5 ve b=3 gibi
		 2)Sonra bu integerlarin degerlerinin yerlerini degistirin(swap) yani; a=3 ve b=5 olsun
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayiyi giriniz");
		int s1 = scan.nextInt();
		System.out.println("Ikinci sayiyi giriniz");
		int s2 = scan.nextInt();		
		System.out.println(s1 + " " + s2);
		
		s1 = s1 + s2;		
		s2 = s1 - s2;		
		s1 = s1 - s2;		
		System.out.println(s1 + " " + s2);
		
		scan.close();

	}

}
