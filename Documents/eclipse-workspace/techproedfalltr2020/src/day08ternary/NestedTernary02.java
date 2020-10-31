package day08ternary;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {
		/*
		 Artik Yil(Lep Year): 100'e bolunen yillardan 400'e bolunenler artik yildir.
		                      100'e bolunmeyenlerden 4'e bolunenler artik yildir.
		 Kullanicidan alinan yilin artik yil olup olmadigini belirleyen kodu yaziniz.
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir yil giriniz");
		int yil = scan.nextInt();
		
		String result = yil%100 == 0 ? (yil%400==0 ? "Artik yil" : "Artik yil degil") : (yil%4==0 ? "Artik yil" : "Artik yil degil");
		
		System.out.println(result);
		
		scan.close();
	}

}
