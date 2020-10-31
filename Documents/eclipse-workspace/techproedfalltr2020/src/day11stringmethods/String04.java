package day11stringmethods;

import java.util.Scanner;

public class String04 {

	public static void main(String[] args) {
		/*
		 1)Kullanicidan bir String alin
		 2)Tum rakamlari * a cevirin
		 3)Bas ve sondaki tum space'leri silin
		 4)Aralardaki tum space'leri ! isaretine cevirin
		 5)a ve z harflerini buyuk harf, diger tum harfleri kucuk harf yapin
		 6)En bas'a "(" ve en sona ")" ekleyin 
		*/
		
		//1)Kullanicidan bir String alin
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir String giriniz");
		String s = scan.nextLine();
		
		//2)Tum rakamlari * a cevirin
		s = s.replaceAll("\\d", "*");
		
		//3)Bas ve sondaki tum space'leri silin
		s = s.trim();
		
		//4)Aralardaki tum space'leri ! isaretine cevirin
		s = s.replace(" ", "!");
		
		//5)a ve z harflerini buyuk harf, diger tum harfleri kucuk harf yapin
		s = s.toLowerCase();
		s = s.replace('a', 'A');
		s = s.replace('z', 'Z');
		
		//6)En bas'a "(" ve en sona ")" ekleyin 
		s = "(".concat(s).concat(")");
		
		System.out.println(s);
		
		scan.close();

	}

}
