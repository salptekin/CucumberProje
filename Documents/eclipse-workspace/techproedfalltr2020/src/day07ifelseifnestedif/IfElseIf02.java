package day07ifelseifnestedif;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın eğer, 
		 Uç kenar uzunluğu birbirine eşit ise ekrana “Eşkenar Uçgen” yazdırın. 
		 Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar Uçgen” yazdırın. 
		 Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar Uçgen” yazdirin
		*/
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Ucgenin 3 kenar uzunlugunu giriniz" );
		double k1=scan.nextDouble();
		double k2=scan.nextDouble();
		double k3=scan.nextDouble();
		
		if(k1==k2 && k2==k3) {
			System.out.println("Eskenar Ucgen");
		}else if(k1==k2 || k2==k3 || k1==k3) {
			System.out.println("Ikizkenar Ucgen");
		}else {
			System.out.println("Cesitkenar Ucgen");
		}
		scan.close();
	}

}
