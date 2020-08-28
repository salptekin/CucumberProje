package day13dowhileloop;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir sayi alın ve bu rakam icin çarpım tablosunu ekrana yazdırın.
         Kullanıcının hata yapmadığını farz edin. 
         Ornegin kullanıcı 3 girerse;
         3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int s = scan.nextInt();
		
		int i =1;
		while(i<=10) {
			System.out.println(s + "x" + i + "=" + s*i);
			i++;
		}
		
		scan.close();

	}

}
