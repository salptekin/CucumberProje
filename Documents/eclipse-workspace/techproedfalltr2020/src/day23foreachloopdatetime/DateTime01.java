package day23foreachloopdatetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

	public static void main(String[] args) {
		
		//Java'da LocalDate class'i var
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);//2020-10-08
		
		System.out.println(date1.plusDays(3));//2020-10-11
		System.out.println(date1.plusMonths(2));//2020-12-08
		System.out.println(date1.plusYears(4));//2024-10-08
		System.out.println(date1.plusDays(3).plusMonths(2));//2020-12-11
		
		System.out.println(date1.minusDays(11));//2020-09-27
		System.out.println(date1.minusMonths(11));//2019-11-08
		System.out.println(date1.minusYears(4));//2016-10-08
		System.out.println(date1.plusYears(3).minusMonths(4));//2023-06-08
		
		//Java'da LocalTime class'i var
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);//15:45:37.021
		
		System.out.println(time1.plusMinutes(12));
		System.out.println(time1.plusHours(3));
		
		System.out.println(time1.minusMinutes(13));
		System.out.println(time1.minusHours(3));

		//Baska ulkelerin saatini bulmak
		LocalTime time2 = LocalTime.now(ZoneId.of("Europe/Moscow"));
		System.out.println(time2);
		
		//Tarihlerin formatlarini degistirmek
		//Tarih formatlarini degistirmek icin DateTimeFormatter class'ini kullaniriz
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd:MM:yyyy");
		System.out.println(date1.format(dtf1));//08:10:2020
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd:MMM:yyyy");
		System.out.println(date1.format(dtf2));//08:Oct:2020
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		System.out.println(date1.format(dtf3));//08:October:2020
		
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("d/MMMM/yyyy");
		System.out.println(date1.format(dtf4));//8/October/2020
		
		DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MMMM/d");
		System.out.println(date1.format(dtf5));//October/20/8
		
		//Zaman formatini degistirmek
		DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(time1.format(dtf6) + "pm");//04:14pm
		
		DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(time1.format(dtf7));//16:14
	
	}

}
