package day04scanner;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		 Yarıçapı kullanıcıdan alınan bir dairenin çevresini ve alanını hesaplayan 
         bir program yazınız. (float kullanınız)
         Not 1: pi sayısı: 3.14159
         Not 2: Alan: 3.14159 x radius x radius
         Not 3: Cevre: 2 x 3.14159 x radius
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yaricapi giriniz");
		float r = scan.nextFloat();
		
		System.out.println("Alan= " + 3.14159*r*r);
		System.out.println("Cevre= " + 2*3.14159*r);
		
		scan.close();

	}

}
