package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan sayi alin
	     Bu sayi 10'dan 99'a kadar ise ekrana "Ikibasamakli sayi" yazdirin
	     Aksi takdirde; "Iki basamakli degil" yazdirin
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int num = scan.nextInt();
		
		if(num>=10 && num<=99) {
			System.out.println("Iki basamakli");
		}else {
			System.out.println("Iki basamakli degil");
		}
		
		scan.close();
		
	}

}
