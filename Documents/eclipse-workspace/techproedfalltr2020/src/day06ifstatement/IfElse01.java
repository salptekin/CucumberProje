package day06ifstatement;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		// if it rains I will go to Mall else I will go to picnic
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir integer giriniz");
		int a = scan.nextInt();
		
		//if-else sadece 1 tane condition icerir, ikili if ise iki tane condition icerir.
		//Java her condition'i kontrol etmek zorundadir, iki condition'i kontrol etmek
		//daha uzun zaman gerektirir ve bu da Java'yi yavaslatir.
		
		if(a >= 0) {
			System.out.println("Negatif degil");
		} else {
			System.out.println("Negatif");
		}
		
		System.out.println("================");
		
		if(a>=0) {
			System.out.println("Negatif degil");
		}
		if(a<0) {
			System.out.println("Negatif");
		}
		
		scan.close();

	}

}
