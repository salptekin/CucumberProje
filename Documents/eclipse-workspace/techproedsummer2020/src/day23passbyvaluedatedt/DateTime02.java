package day23passbyvaluedatedt;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {

	public static void main(String[] args) {
		
		// How to update date format ==> 2020-06-30 --> 2020/06/30 --> 30/06/2020 --> 06$30$20
		LocalDate date = LocalDate.now();
		System.out.println(date);//2020-06-30
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dtf.format(date));//30/06/2020
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		System.out.println(dtf1.format(date));//30/Jun/2020
		
		//If you use MMMM, Java prints the full names of the months
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		System.out.println(dtf2.format(date.plusMonths(2)));//30/August/2020
		
		//How to update time format
		LocalTime time = LocalTime.now();
		
		//If you use lower case "h"s, Java will use 12 hours system (AM/PM)
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf3.format(time.plusHours(3)));//03:43
		
		//If you use upper case "H"s, Java will use 24 hours system (No AM/PM)
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(dtf4.format(time.plusHours(3)));//15:43
		
		//How to get local time
		System.out.println(LocalTime.now(ZoneId.of("Turkey")));
		System.out.println(LocalTime.now(ZoneId.of("Japan")));
		System.out.println(LocalTime.now(ZoneId.of("Europe/Moscow")));

	}

}
