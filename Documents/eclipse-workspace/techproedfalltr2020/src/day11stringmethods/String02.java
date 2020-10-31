package day11stringmethods;

import java.util.Scanner;

public class String02 {

	public static void main(String[] args) {
		
		/*
		 1)Kullanicidan password'unu aliniz
		 2)Password a)Ilk character'i buyuk harf olacak
		            b)son character'i sayi olacak
		            c)en az 6 character uzunlugunda olacak
		   sartlarini sagliyorsa ekrana "Password basariyla olusturuldu" yaziniz
		 3)Password yukaridaki sartlardan herhangi birini saglamiyorsa "Tekrar deneyiniz" yazdirin            
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Password'unuzu giriniz");
		String pwd = scan.nextLine();
		
		if((pwd.charAt(0)>='A' && pwd.charAt(0)<='Z') &&
		   (pwd.charAt(pwd.length()-1)>='0' && pwd.charAt(pwd.length()-1)<='9') &&
			pwd.length()>5) {
			System.out.println("Password basariyla olusturuldu");
		} else {
			System.out.println("Tekrar deneyiniz");
		}
		
		scan.close();

	}

}
