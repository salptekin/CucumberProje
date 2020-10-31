package day08ternary;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir tamsayı alın. 
		 Eğer tamsayı 0 dan kucuk ise ekrana “Negatif” yazdırın. 
         Diğer durumlarda ekrana “Negatif degil” yazdırın.
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int s = scan.nextInt();
		
		String result = s<0 ? "Negatif" : "Negatif değil";
		System.out.println(result);
		
		scan.close();
	}

}
