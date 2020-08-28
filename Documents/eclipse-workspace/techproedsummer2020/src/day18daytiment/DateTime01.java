package day18daytiment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime01 {

	public static void main(String[] args) {
		// How to get current date
		System.out.println(LocalDate.now());
		
		//How to get current time
		System.out.println(LocalTime.now());//10:46:07.706
		
		//How to get current date and current time together
		System.out.println(LocalDateTime.now());//2020-06-28T10:48:53.890
		
		//How to update current date to future date
		LocalDate date1 = LocalDate.now();
		System.out.println(date1.plusDays(3));//2020-07-01
		System.out.println(date1.plusMonths(1));//2020-07-28
		System.out.println(date1.plusYears(4));//2024-06-28
		
		//How to update current date to past date
		LocalDate date2 = LocalDate.now();
		System.out.println(date2.minusDays(5));//2020-06-23
		System.out.println(date2.minusMonths(3));//2020-03-28
		System.out.println(date2.minusYears(1));//2019-06-28
		
		//How to update current time to future time
		LocalTime time1 = LocalTime.now();
		System.out.println("Current: " + time1);//current time
		System.out.println("Updated current: " + time1.plusSeconds(20));//updated current time
		System.out.println("Updated current: " + time1.plusMinutes(12));//Updated current date
		System.out.println("Updated current: " + time1.plusHours(2));//Updated current time
		
		//How to update current time to past time
		LocalTime time2 = LocalTime.now();
		System.out.println("Current: " + time2);
		System.out.println("Updated current: " + time2.minusSeconds(30));
		System.out.println("Updated current: " + time2.minusMinutes(5));
		System.out.println("Updated current: " + time2.minusHours(2));

	}

}
