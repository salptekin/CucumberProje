package day18daytiment;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {

	public static void main(String[] args) {
		// How to update date format ==> 06/28/2020 ==> 06-28-2020 ==> 28-Jun-2020
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);//2020/06/28
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		System.out.println(dtf.format(date1));//28-06-2020
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("M*dd*yy");
		System.out.println(dtf1.format(date1));//6*28*20
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy|MMM|d");
		System.out.println(dtf2.format(date1));//2020|Jun|28
		
		//How to update time format
		LocalTime time1 = LocalTime.now();
		
		//If you use "hh" for hours it will use 12 hours system
		//If you use "HH" for hours it will use 24 hours system
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf3.format(time1));//11:42
		System.out.println(dtf3.format(time1.plusHours(3)));//02:45
		
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(dtf4.format(time1.plusHours(3)));//14:45
		
		//How to get local time
		System.out.println(LocalTime.now(ZoneId.of("Europe/Moscow")));
		
	}

}
