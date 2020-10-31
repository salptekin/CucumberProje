package day37collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList01 {

	public static void main(String[] args) {
		/*
		 Node'lari "Ali", "Veli", "Can" ve "Ayse" olan bir LinkedList olusturun.
		 Kullanicidan bir isim alin.
		 Bu isim LinkedList'de varsa silin ve kullaniciya "Bu isim LinkedList'de vardi ve silindi"
		 diye mesaj verin.
		 Bu isim LinkedList'de yoksa "Bu isim LinkedList'de yok bu yuzden silinemedi" diye mesaj verin.
		*/
		LinkedList<String> ll1 = new LinkedList<>();
		ll1.add("Ali");
		ll1.add("Veli");
		ll1.add("Can");
		ll1.add("Ayse");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir isim giriniz");
		String isim = scan.nextLine();
		
		System.out.println(ll1);
		
		if(ll1.remove(isim)) {
			System.out.println("Bu isim LinkedList'de vardi ve silindi");
			System.out.println(ll1);
		}else {
			System.out.println("Bu isim LinkedList'de yok bu yuzden silinemedi");
			System.out.println(ll1);
		}
		
		scan.close();

	}

}
