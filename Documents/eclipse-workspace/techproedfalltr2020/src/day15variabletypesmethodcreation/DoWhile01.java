package day15variabletypesmethodcreation;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir String alin.
		 Bu String'in icinde kac tane harf, kac tane rakam, kac tane harf ve rakam disi
		 karakter oldugunu gosteren programi yaziniz.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir String giriniz");
		String s = scan.nextLine().toLowerCase();
		
		int harfCounter = 0;
		int rakamCounter = 0;
		int digerCounter = 0;
		int k = 0; 
		
		do {
			if(s.charAt(k)>='a'&&s.charAt(k)<='z') {
				harfCounter++;
			}else if(s.charAt(k)>='0'&&s.charAt(k)<='9') {
				rakamCounter++;
			}else {
				digerCounter++;
			}
			k++;
		}while(k < s.length());
		
		System.out.println("Harf sayisi: " + harfCounter);
		System.out.println("Rakam sayisi: " + rakamCounter);
		System.out.println("Diger karakter sayisi: " + digerCounter);

		scan.close();
	}

}
