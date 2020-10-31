package day06ifstatement;

import java.util.Scanner;

public class IfStatement04 {

	public static void main(String[] args) {
		/*
		 Kullanicidan pozitif bir tamsayi alin
		 Sayi 3 basamakli ise console'a "3 Basamakli" yazdirin
		 Sayi 2 basamakli ise console'a "2 Basamakli" yazdirin
		 Sayi 3 basamakli veya 2 basamakli degil ise console'a "Ikisi de degil" yazdirin
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir pozitif integer giriniz");
		int a = scan.nextInt();
		
		if(a>99 && a<1000) {
			System.out.println("3 Basamakli");
		}
		if(a>9 && a<100) {
			System.out.println("2 Basamakli");
		}
		if(!(a>99 && a<1000) && !(a>9 && a<100)) {
			System.out.println("Ikisi de degil");
		}
		
		scan.close();
	}

}
