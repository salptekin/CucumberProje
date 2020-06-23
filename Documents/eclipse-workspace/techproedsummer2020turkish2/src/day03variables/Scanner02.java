package day03variables;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		//1) Kullanicidan Tam ismini alin ekrana yazin
		//2) Kullanicidan yasini alin ekrana yazin
		//3) Kullanicidan isminin ilk harfini alin ekrana yazin alin
		//4) Kullanicinin cocuk sayisini byte ile aliniz
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Tam isminizi giriniz");
		String tamIsim = scan.nextLine();
		System.out.println(tamIsim);
		
		System.out.println("Yasinizi giriniz");
		//Data type int ise; nextInt() methodunu kullaniniz
		int yas = scan.nextInt();
		System.out.println(yas);
		
		System.out.println("Isminizin ilk harfini giriniz");
		//Kullanicidan char almak icin scan.next().charAt(0); kullanilir
		char ilkHarf = scan.next().charAt(0);
		System.out.println(ilkHarf);
		
		System.out.println("Cocuk sayinizi giriniz");
		byte cocukSayisi = scan.nextByte();
		System.out.println(cocukSayisi);
		
		scan.close();

	}

}
