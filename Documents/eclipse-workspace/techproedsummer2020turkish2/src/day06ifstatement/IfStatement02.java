package day06ifstatement;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
	/*
	 Kullanıcıdan bir gun alın eğer gun 
	 “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdırın.
     “Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdırın. 
     “Pazar” ise ekrana “Hristiyanlar icin kutsal gün” yazdırın
	*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir gun giriniz");
		String gun = scan.next();
		//String'leri karsilastirirken sakin haaa "==" kullanmayin
		//String'leri karsilastirirken kesinlikle equals() kullanin
		//equals() boolean return eder.
						
		if(gun.equals("Cuma")) { 
			System.out.println("Müslümanlar icin kutsal gün");
		}	
		if(gun.equals("Cumartesi")) {
			System.out.println("Yahudiler icin kutsal gün");
		}		
		if(gun.equals("Pazar")) { 
			System.out.println("Hristiyanlar icin kutsal gün");
		}
		
		scan.close();		
	}
}
