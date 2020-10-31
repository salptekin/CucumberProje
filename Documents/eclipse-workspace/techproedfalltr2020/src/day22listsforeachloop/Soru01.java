package day22listsforeachloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 1)Elemanlarini kullanicinin girdigi bir String list olusturunuz, String'lerin tamami rakamlardan olussun
		 2)Bu listin elemanlarinin carpimini ekrana yazdiriniz.
		*/
		
		Scanner scan = new Scanner(System.in);
		String str = "";
		
		List<String> list = new ArrayList<>();
		
		do {	
			System.out.println("Rakamlardan olusan String'ler giriniz.");
			System.out.println("String girmeyi durdurmak icin 'S' giriniz");
			str = scan.next().toUpperCase();
			if(!str.equals("S")) {
			  list.add(str);
			}
			
		}while(!str.equals("S"));
		
		System.out.println(list);
		
		int carpim = 1;	
		for(int i=0; i<list.size(); i++) {		
			carpim = carpim * Integer.parseInt(list.get(i));
		}		
		System.out.println(carpim);
		
		scan.close();

	}

}
