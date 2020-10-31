package day08ternary;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın 
		 Eğer iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar Ucgen” yazdırın. 
		 Diğer durumlarda ekrana “Ikizkenar değil” yazdırın.
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Ucgenin 3 kenar uzunlugunu giriniz");
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		int k3 = scan.nextInt();

		String result = k1==k2||k1==k3||k2==k3 ? "Ikizkenar ucgen" : "Ikizkenar ucgen degil"; 
		System.out.println(result);
		
		scan.close();
	}

}
