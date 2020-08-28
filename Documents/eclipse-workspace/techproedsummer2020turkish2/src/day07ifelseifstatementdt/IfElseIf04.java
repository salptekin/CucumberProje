package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf04 {

	public static void main(String[] args) {
		/*
		 Kullanicidan iki not aliniz 
		 Ortalama = (not1 + not2) / 2
		 Ortalama 50 nin altinda ise "Kaldiniz"
		 Ortalama 70 in altinda ise "C ile gectiniz"
		 Ortalama 85 in altinda ise "B ile gectiniz"
		 Ortalama 100 ve 100 un altinda ise "A ile gectiniz"
		 Diger durumlarda(Negatif ve 100 den buyuk) "Gecerli not giriniz"
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ilk notunuzu giriniz");
		int ilk = scan.nextInt();
		System.out.println("Ikinci notunuzu giriniz");
		int ikinci = scan.nextInt();
		
		double ortalama = (ilk + ikinci)/2.0;
		
		boolean bl = ilk<0 || ikinci<0 || ilk>100 || ikinci>100;
		
		if(bl) {
			System.out.println("Gecerli not giriniz");
		}else if(ortalama<50) {
			System.out.println("Kaldiniz");
			System.out.println(ortalama);
		}else if(ortalama<70) {
			System.out.println("C ile gectiniz");
			System.out.println(ortalama);
		}else if(ortalama<85) {
			System.out.println("B ile gectiniz");
			System.out.println(ortalama);
		}else if(ortalama<=100) {
			System.out.println("A ile gectiniz");
			System.out.println(ortalama);
		}
		
		scan.close();

	}

}
