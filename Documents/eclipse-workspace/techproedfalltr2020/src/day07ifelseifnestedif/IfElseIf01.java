package day07ifelseifnestedif;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {
		
		/*
		 Kullanıcıdan bir sayı alın 
		 Eğer tamsayı 0 dan kucuk ise ekrana “Negatif” yazdırın. 
         0 ise ekrana “Nötr” yazdırın. 
         0 dan büyük ise ekrana “Pozitif” yazdırın.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		double d = scan.nextDouble();
		
		if(d<0) {
			System.out.println("Negatif");
		} else if(d==0) {
			System.out.println("Notr");
		} else {
			System.out.println("Pozitif");
		} 
		scan.close();
	}

}
