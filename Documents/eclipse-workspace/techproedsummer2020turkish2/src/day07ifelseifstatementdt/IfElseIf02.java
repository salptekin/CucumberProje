package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir harf alin
		 Bu harf 'a' veya 'A' ise ekrana "Ilk harf" yazdirin
		 Bu harf 'b' veya 'B' ise ekrana "Ikinci harf" yazdirin
		 Bu harf 'c' veya 'C' ise ekrana "Ucuncu harf" yazdirin
		 Diger harfler icin "Sirasini bilmiyorum" yazdirin
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		char harf = scan.next().charAt(0);
		
		if(harf=='a' || harf=='A') {
			System.out.println("Ilk harf");
		}else if(harf=='b' || harf=='B') {
			System.out.println("Ikinci harf");
		}else if(harf=='c' || harf=='C') {
			System.out.println("Ucuncu harf");
		}else {
			System.out.println("Sirasini bilmiyorum");
		}
		
		scan.close();

	}

}
