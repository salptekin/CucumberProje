package day23daytime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Time01 {

	public static void main(String[] args) {
	
		LocalTime lt = LocalTime.now();
		System.out.println(lt);//15:20:50.701 ==> 701 nanosecond
		
		//Zamanda ileri nasil gidilir?
		System.out.println(lt.plusMinutes(7));//15:27:50.701
		System.out.println(lt.plusHours(6));//21:20:50.701
		
		//Zamanda nasil geri gidilir?
		System.out.println(lt.minusSeconds(23));//15:20:27.701
		
		//Time formati nasil degistirilir?
		//hh ==> 12'lik sistem kullanir     HH==> 24'luk sistem kullanir
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf1.format(lt));//03:29
		
		//Farkli ulkelerdeki yerel saati nasil yazdirabilirim?
		System.out.println(LocalTime.now(ZoneId.of("Turkey")));
		System.out.println(LocalTime.now(ZoneId.of("Japan")));
		System.out.println(LocalTime.now(ZoneId.of("Europe/Moscow")));
	}
}
