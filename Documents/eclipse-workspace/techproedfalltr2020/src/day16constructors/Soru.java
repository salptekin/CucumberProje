package day16constructors;

import java.util.Scanner;

public class Soru {
	
	/*
	 Kullanıcıya sayı girmesini söyleyin. 
	 Kullanıcı sıfır girdiğinde, ekrana o ana kadar girmiş olduğu tüm sayıların toplamını yazdırınız.
     Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdırın
	*/

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
	    int i=1;
		int num=0;
		
		do {
			System.out.println("Bir sayi giriniz");
			
			i = scan.nextInt();
			
			num = num + i;
			
		}while(!(i==0));

		System.out.println("Girilen sayilarin toplami: "+num);
		
		scan.close();
	}
		
}
