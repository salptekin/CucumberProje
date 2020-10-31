package day07ifelseifnestedif;

import java.util.Scanner;

public class IfSoru01 {

	public static void main(String[] args) {
		
		/*
		 Kullanıcıdan bir gun alın eğer gun 
		 “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdırın.
         “Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdırın. 
         “Pazar” ise ekrana “Hıristiyanlar icin kutsal gün” yazdırın
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir gun ismi giriniz");
		String day = scan.next();
		
		//String'lerde kesinlikle "==" kullanmayiniz.
		//"==" primitive data type'larinda kullanin.
		//equals() methodu iki String'i buyuk kucuk harfe dikkat ederek karsilastirir. 
		//equalsIgnoreCase() iki String'i buyuk kucuk harfi dikkate almadan karsilastirir.
		//String'ler ayni ise true, farkli ise false return eder
		if(day.equalsIgnoreCase("Cuma")) {
			System.out.println("Müslümanlar icin kutsal gün");
		}
		if(day.equalsIgnoreCase("Cumartesi")) {
			System.out.println("Yahudiler icin kutsal gün");
		}
		if(day.equalsIgnoreCase("Pazar")) {
			System.out.println("Hristiyanlar icin kutsal gün");
		}
		if(!day.equalsIgnoreCase("Cuma") && !day.equalsIgnoreCase("Cumartesi") && !day.equalsIgnoreCase("Pazar")) {
			System.out.println("Oyle bir kutsal gun yok");
		}
		scan.close();
	}

}
