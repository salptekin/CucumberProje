package day22listsforeachloop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan tam ismini alin
		 Ismin harflerini bir list'e ekleyin
		 Harfleri alfabetik sirada buyuk harfler olarak yazin
		 Harfleri alfabetik siranin tersinde buyuk harfler olarak yazin
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Tam isminizi giriniz");
		String name = scan.nextLine().replace(" ", "").toUpperCase();
		
		//Ismin harflerini var olan sirada yazdirmak
		List<Character> harfler = new ArrayList<>();
		for(int i=0; i<name.length(); i++) {
			harfler.add(name.charAt(i));
		}
		System.out.println(harfler);
		
		//Alfabetik siralama
		Collections.sort(harfler);
		System.out.println(harfler);
		
		//Alfabetik siralamanin tersi
		//1.Yol
		List<Character> harflerTers = new ArrayList<>();
		for(int i=harfler.size()-1; i>=0; i--) {
			harflerTers.add(harfler.get(i));
		}
		System.out.println(harflerTers);//[Z, Y, V, U, T, M, H, E, A, A]
		
		//2.Yol
		Collections.reverse(harfler);
		System.out.println(harfler);//[Z, Y, V, U, T, M, H, E, A, A]
		
		scan.close();

	}

}
