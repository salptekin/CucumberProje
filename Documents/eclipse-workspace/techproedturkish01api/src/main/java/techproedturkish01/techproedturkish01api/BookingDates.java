package techproedturkish01.techproedturkish01api;

import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

public class BookingDates {
	/*
	 POJO'da olmasi gerekenler;
	 1)JSON'da key olanlar icin variable olusturun ve variable'larin access modifier'larini private yapin
	 2)Her variable icin getter ve setter method'lari olustrurn
	 3)Parametresiz constructor olusturun (icinde super() olmasin)
	 4)Olusturdugunuz variable'lari parametre kabul eden parametreli constructor olustrun (icinde super() olmasin)
	 5)toString() methodu olusturun 
 	*/
	
	@JsonProperty("checkin")
	private String checkin;
	@JsonProperty("checkout")
	private String checkout;

	@JsonProperty("checkin")
	public String getCheckin() {
	return checkin;
	}

	@JsonProperty("checkin")
	public void setCheckin(String checkin) {
	this.checkin = checkin;
	}

	@JsonProperty("checkout")
	public String getCheckout() {
	return checkout;
	}

	@JsonProperty("checkout")
	public void setCheckout(String checkout) {
	this.checkout = checkout;
	}

	public BookingDates(String checkin, String checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public BookingDates() {
		
	}

	@Override
	public String toString() {
		return "BookingDates [checkin=" + checkin + ", checkout=" + checkout + "]";
	}

}
