package techproedturkish01.techproedturkish01api;

import org.codehaus.jackson.annotate.JsonProperty;

public class Booking {
	
	/*
	 POJO'da olmasi gerekenler;
	 http://www.jsonschema2pojo.org/ ==> bu web sitesinden POJO uretebilirsiniz
	 1)JSON'da key olanlar icin variable olusturun ve variable'larin access modifier'larini private yapin
	 2)Her variable icin getter ve setter method'lari olustrurn
	 3)Parametresiz constructor olusturun (icinde super() olmasin)
	 4)Olusturdugunuz variable'lari parametre kabul eden parametreli constructor olustrun (icinde super() olmasin)
	 5)toString() methodu olusturun 
	*/
	
	@JsonProperty("firstname")
	private String firstname;
	@JsonProperty("lastname")
	private String lastname;
	@JsonProperty("totalprice")
	private int totalprice;
	@JsonProperty("depositpaid")
	private boolean depositpaid;
	@JsonProperty("bookingdates")
	private BookingDates bookingdates;
	@JsonProperty("additionalneeds")
	private String additionalneeds;

	@JsonProperty("firstname")
	public String getFirstname() {
	return firstname;
	}

	@JsonProperty("firstname")
	public void setFirstname(String firstname) {
	this.firstname = firstname;
	}

	@JsonProperty("lastname")
	public String getLastname() {
	return lastname;
	}

	@JsonProperty("lastname")
	public void setLastname(String lastname) {
	this.lastname = lastname;
	}

	@JsonProperty("totalprice")
	public int getTotalprice() {
	return totalprice;
	}

	@JsonProperty("totalprice")
	public void setTotalprice(Integer totalprice) {
	this.totalprice = totalprice;
	}

	@JsonProperty("depositpaid")
	public boolean getDepositpaid() {
	return depositpaid;
	}

	@JsonProperty("depositpaid")
	public void setDepositpaid(Boolean depositpaid) {
	this.depositpaid = depositpaid;
	}

	@JsonProperty("bookingdates")
	public BookingDates getBookingdates() {
	return bookingdates;
	}

	@JsonProperty("bookingdates")
	public void setBookingdates(BookingDates bookingdates) {
	this.bookingdates = bookingdates;
	}

	@JsonProperty("additionalneeds")
	public String getAdditionalneeds() {
	return additionalneeds;
	}

	@JsonProperty("additionalneeds")
	public void setAdditionalneeds(String additionalneeds) {
	this.additionalneeds = additionalneeds;
	}

	public Booking() {

	}

	public Booking(String firstname, String lastname, Integer totalprice, Boolean depositpaid,
			BookingDates bookingdates, String additionalneeds) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.totalprice = totalprice;
		this.depositpaid = depositpaid;
		this.bookingdates = bookingdates;
		this.additionalneeds = additionalneeds;
	}

	@Override
	public String toString() {
		return "Booking [firstname=" + firstname + ", lastname=" + lastname + ", totalprice=" + totalprice
				+ ", depositpaid=" + depositpaid + ", bookingdates=" + bookingdates + ", additionalneeds="
				+ additionalneeds + "]";
	}

}
