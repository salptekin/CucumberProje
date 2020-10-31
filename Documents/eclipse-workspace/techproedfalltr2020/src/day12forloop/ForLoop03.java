package day12forloop;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alin o sayidan kucuk ve esit olan tum pozitif tek sayilari 
		 buyukten kucuge dogru ayni satirda aralarina bosluk birakarak yazdirin
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayi giriniz");
		int s = scan.nextInt();
		
		if(s<1) {	
			System.out.println("Pozitif bir tamsayi giriniz");	
		} else {
			for(int i=s; i>=1; i--) {
				
				if(i%2!=0) {
					System.out.print(i + " ");
				}	
			}
		}		
		scan.close();
	}

}
