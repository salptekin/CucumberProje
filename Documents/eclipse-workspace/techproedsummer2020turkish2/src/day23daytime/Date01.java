package day23daytime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date01 {
	
	/*
	 1) Anlik tarihi almak
	 2) Tarihi ilerletmek veya geriletmek
	 3) Tarihi farkli formatlarda yazmak
	 */

	public static void main(String[] args) {
		
		//Anlik tarihi nasil alinir?
		LocalDate ld = LocalDate.now(); 
		System.out.println(ld);//2020-07-21
		
		//Ileri tarihler ekrana nasil yazdirilir?
		System.out.println(ld.plusDays(275));//2021-04-22
		System.out.println(ld.plusMonths(3));//2020-10-21
		System.out.println(ld.plusYears(3));//2023-07-21
		
		//Gecmis tarihler ekrana nasil yazdirilir?
		System.out.println(ld.minusDays(34));//2020-06-17
		System.out.println(ld.minusMonths(6));//2020-01-21
		System.out.println(ld.minusYears(4));//2016-07-21
		
		//Tarihi nasil farkli formatta yazdirabiliriz?
		// MM ==> Kacinci ay       MMM ==> Ayin ilk 3 harfi     MMMM ==> Ayin isminin tamami
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		System.out.println(dtf1.format(ld.plusMonths(1)));//21/August/2020
		
		
		// d ==> 10 dan kubuk gunler icin tek rakam basar ama 10 ve yukarisi icin cift rakam basar
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM.d.yy");
		System.out.println(dtf2.format(ld));//Jul.21.20

	}

}
