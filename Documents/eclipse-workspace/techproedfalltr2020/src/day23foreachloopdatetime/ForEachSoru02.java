package day23foreachloopdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEachSoru02 {

	static int no = 1000;
	
	public static void main(String[] args) {
		/*
		 Giris yilini, ad ve soyadini kullanicidan aliniz.
		 Giris Yili + Ad ve soyadinin ilk harfleri + Sira Numarasi seklinde ogrenci numarasi
		 olusturan programi yaziniz.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		String isim = "";
		List<String> isimler = new ArrayList<>();
		
		do {

			System.out.println("Ad ve soyadinizi giriniz");
		    isim = scan.nextLine();
		    
		    if(!isim.equalsIgnoreCase("X")) {
		        isimler.add(isim);
		    }
		   	    
		}while(!isim.equalsIgnoreCase("X"));    
		
		System.out.println(isimler);
		
		for(String w : isimler) {
			System.out.println(w + " id: "+ 20 + "" + w.charAt(0) + w.charAt(w.indexOf(" ") + 1) + no);
			no++;
		}
		
		scan.close();

	}

}
