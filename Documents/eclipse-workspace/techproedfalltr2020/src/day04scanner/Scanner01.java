package day04scanner;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		//Kullanicidan data almak icin;
		
		//1. Step: Scanner class'indan object uretin
		Scanner scan = new Scanner(System.in);
		//2.Step: Kullaniciya mesaj verin
		System.out.println("Yasinizi giriniz");
		//3.Step: Kullanicinin verdigi data'yi saklamak icin bir variable olusturun
		int age = scan.nextInt();
		System.out.println(age);
		scan.close();

	}

}
