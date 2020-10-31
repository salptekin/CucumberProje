package day08ternary;

import java.util.Scanner;

public class NestedIfSoru01 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan cinsiyetini girmesini isteyin.
		  
         Erkek ise yaşını kontrol edin. 
         Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
         Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
         
         Kadin ise yasini kontrol edin. 
         Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
         Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Cinsiyetinizi giriniz: Erkek / Kadin");
		String c = scan.next();
		System.out.println("Yasinizi giriniz");
		int y = scan.nextInt();
		
		if(c.equalsIgnoreCase("Erkek")) {
			if(y<18) {
				System.out.println("Erkek cocuk");
			} else {
				System.out.println("Adam");
			}
		} else if(c.equalsIgnoreCase("Kadin")) {
			if(y<18) {
				System.out.println("Kiz cocuk");
			} else {
				System.out.println("Kadin");
			}
		} else {
			System.out.println("Bu cinsiyet tanimli degil");
		}
		scan.close();
	}
}
