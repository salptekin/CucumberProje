package day11stringmethods;

import java.util.Scanner;

public class String03 {

	public static void main(String[] args) {
		
		/*
		 1)Kullanicidan ad ve soyadini ve 11 haneli kimlik numarasini aliniz.
		 2)Kulanici ad ve soyadini yazarken hatayla bas ve sona space koyarsa siliniz
		 3)Ad ve soyadin ilk harfleri buyuk diger harfleri kucuk olmali
		 4)Kimlik numarasinin son 4 rakami haric hepsi * yapilmali
		 			Ornek: Ali Can *******1234
		*/
		
		//1)Kullanicidan ad ve soyadini ve 11 haneli kimlik numarasini aliniz.
		Scanner scan =new Scanner(System.in);
		System.out.println("Ilk adinizi giriniz");
		String ad = scan.nextLine();
		System.out.println("Soy adinizi giriniz");
		String soyAd = scan.nextLine();
		System.out.println("Kimlik numaranizi giriniz");
		String kimlikNo = scan.nextLine();
		
		//2)Kulanici ad ve soyadini yazarken hatayla bas ve sona space koyarsa siliniz
		ad = ad.trim();
		soyAd = soyAd.trim();
		
		//3)Ad ve soyadin ilk harfleri buyuk diger harfleri kucuk olmali
		ad = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase();
		soyAd = soyAd.substring(0, 1).toUpperCase() + soyAd.substring(1).toLowerCase();
		
		//4)Kimlik numarasinin son 4 rakami haric hepsi * yapilmali
		kimlikNo = "*******" + kimlikNo.substring(kimlikNo.length()-4);
		
		System.out.println(ad);
		System.out.println(soyAd);
		System.out.println(kimlikNo);

	}

}
