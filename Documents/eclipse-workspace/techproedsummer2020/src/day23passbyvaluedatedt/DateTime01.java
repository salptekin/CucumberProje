package day23passbyvaluedatedt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime01 {

	public static void main(String[] args) {
		// How to get current date
		System.out.println(LocalDate.now());//2020-06-30
		
		//How to get future dates
		LocalDate date1 = LocalDate.now();
		System.out.println(date1.plusDays(5));//2020-07-05
		System.out.println(date1.plusMonths(4));//2020-10-30
		System.out.println(date1.plusYears(3));//2023-06-30
		
		//How to get past dates
		System.out.println(date1.minusDays(7));//2020-06-23
		System.out.println(date1.minusMonths(2));//2020-04-30
		System.out.println(date1.minusYears(5));//2015-06-30
		
		// How to get current time
		System.out.println(LocalTime.now());//12:17:07.289 ==> 289 is nanoseconds
		
		//How to get future times
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		System.out.println(time1.plusSeconds(5));
		System.out.println(time1.plusMinutes(2));
		System.out.println(time1.plusHours(4));
		
		//How to get past times
		System.out.println(time1);
		System.out.println(time1.minusSeconds(5));
		System.out.println(time1.minusMinutes(2));
		System.out.println(time1.minusHours(4));
		
		//How to get date and time together
		System.out.println(LocalDateTime.now());//2020-06-30T12:28:04.165 ==> T stands for time

	}

}
