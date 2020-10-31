package day05typecasting;

import java.util.Scanner;

public class Scanner03 {

	/*
	 Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin 
	 toplamini ekrana yazdiran programi yaziniz
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("4 basamakli bir sayi giriniz");
		int s = scan.nextInt();
		
		//Bir sayinin birler basamagi lazim olursa "%10" kullanin
		int sonRakam = s % 10;
		//4 basamakli bir sayinin ilk rakamini almak icin 1000' bol
		//5 basamakli bir sayinin ilk rakamini almak icin 10000' bol
		int ilkRakam = s / 1000;
		
		System.out.println("Ilk rakam ve son rakam toplami: " + (ilkRakam + sonRakam));
		
		scan.close();
		
	}
	
}
