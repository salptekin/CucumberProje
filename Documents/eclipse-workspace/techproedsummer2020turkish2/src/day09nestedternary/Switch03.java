package day09nestedternary;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		/*
		 Kullanicidan ay numarasini
		 Ay numarasi girilince o ay ve sonraki tum aylarin isimleri ekrana yazilsin
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ay numarasini giriniz");
		int ay = scan.nextInt();
		
		switch(ay) {
			case 1:
				System.out.println("Ocak");
			case 2:
				System.out.println("Subat");
			case 3:
				System.out.println("Mart");
			case 4:
				System.out.println("Nisan");
			case 5:
				System.out.println("Mayis");
			case 6:
				System.out.println("Haziran");
			case 7:
				System.out.println("Temmuz");
			case 8:
				System.out.println("Agustos");
			case 9:
				System.out.println("Eylul");
			case 10:
				System.out.println("Ekim");
			case 11:
				System.out.println("Kasim");
			case 12:
				System.out.println("Aralik");
				break;
			default:
				System.out.println("Gecersiz ay sayisi");
		}
		
		scan.close();

	}

}
