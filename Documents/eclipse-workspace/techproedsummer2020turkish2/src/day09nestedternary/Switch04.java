package day09nestedternary;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		/*
		 Kullanici ay ismini girince o ayin mevsimini ekrana yazdirin
		*/
		
		//Not: Switch'lerde boolean, float, double, long kullanilmaz.
		//     char, byte, short, int, String kullanilir
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ay ismini giriniz");
		String ay = scan.next();
		
		switch(ay) {
		    
		case "Aralik":
		case "Ocak":
		case "Subat":
			System.out.println("Kis");
			break;
		case "Mart":
		case "Nisan":
		case "Mayis":
			System.out.println("Ilkbahar");
			break;
		case "Haziran":
		case "Temmuz":
		case "Agustos":
			System.out.println("Yaz");
			break;
		case "Eylul":
		case "Ekim":
		case "Kasim":
			System.out.println("Sonbahar");
			break;
		default:
			System.out.println("Gecerli ay ismi giriniz");

		}
		
		scan.close();

	}

}
