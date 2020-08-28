package day18daytiment;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test03 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.plusMonths(2));
		System.out.println(date.minusDays(5));
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		System.out.println(dtf1.format(date));
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.plusMinutes(11));
		System.out.println(time.minusHours(2));
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf2.format(time));

	}

}
