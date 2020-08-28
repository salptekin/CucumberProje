package day06ifstatement;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alin bu sayi 3'e bolunuyorsa ekrana
		 "3'un kati" yazdirin.
		 3'e bolunmuyorsa ekrana "3'e bolunmuyor" yazdirin
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayi giriniz");
		int num = scan.nextInt();
		
		//1 tane "=" koyarsaniz olmaz, "==" koyun
		if(num%3==0){
			System.out.println("3'un kati");
		}		
		if(num%3!=0) {
			System.out.println("3'e bolunmuyor");
		}

		scan.close();
	}

}
