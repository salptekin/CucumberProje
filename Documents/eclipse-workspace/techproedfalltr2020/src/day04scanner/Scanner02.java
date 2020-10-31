package day04scanner;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Isminizi giriniz");
		//Data type String oldugu zaman nextLine() methodunu kullanin
		//Data type String oldugu zaman next() methodu da kullanilabilir.
		//Ama next() methodu sadece ilk kelimeyi alir devamini almaz.
		//nextLine() is kullanicinin girdigi String'in tamamini alir.
		String name = scan.nextLine();
		System.out.println(name);
		scan.close();
		
	}
}
