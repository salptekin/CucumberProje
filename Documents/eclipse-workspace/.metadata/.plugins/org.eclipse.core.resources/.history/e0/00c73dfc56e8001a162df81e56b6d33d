package techproedturkish01.techproedturkish01api;

import static io.restassured.RestAssured.*;
import org.junit.Test;
import org.testng.asserts.SoftAssert;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PostRequest05 extends TestBase01 {
	
						/*
								POST Scenario:
							Accept type Json olsun(Content Type demektir)
							When 
							POST request yolladigimda
							1) https://restful-booker.herokuapp.com/booking
							2) Request Body 
							{
							"firstname": "Suleyman",
							"lastname": "Alptekin",
							"totalprice": 123,
							"depositpaid": true,
							"bookingdates": {
							"checkin": "2020-05-02",
							"checkout": "2020-05-05"
							},
							"additionalneeds": "Wifi"
							}
							Then 
							Status Code 200 olmali
							Response Body'nin, Request Body ile ayni oldugunu verify ediniz.
						*/
	
	/*
	 POJO: Plain Old Java Object
	 */
	
	@Test
	public void post01() {
		
		BookingDates bookingDates = new BookingDates("2020-05-02", "2020-05-05");
		Booking booking = new Booking("Ayse", "Yildiz", 333, true, bookingDates, "Wifi");
		
		Response response = given().
				                contentType(ContentType.JSON).
				                spec(spec01).
				                auth().
				                basic("admin", "password123").
				                body(booking).
				            when().
				                post("/booking");
		response.prettyPrint();
		
		//Status Code 200 olmali
		response.
		     then().
		     assertThat().
		     statusCode(200);
		
		//JsonPath kullanarak assertion yapalim
		JsonPath json = response.jsonPath();
		SoftAssert softAssert = new SoftAssert();
		
		//firstname assertion
		softAssert.assertEquals(json.getString("booking.firstname"), booking.getFirstname());
		
		//lastname assertion
		softAssert.assertEquals(json.getString("booking.lastname"), booking.getLastname());
		
		//totalprice assertion
		softAssert.assertEquals(json.getInt("booking.totalprice"), booking.getTotalprice());
		
		//depositpaid assertion
		softAssert.assertEquals(json.getBoolean("booking.depositpaid"), booking.getDepositpaid());
		
		//checkin assertion
		softAssert.assertEquals(json.getString("booking.bookingdates.checkin"), booking.getBookingdates().getCheckin());
		
		//checkout assertion
		softAssert.assertEquals(json.getString("booking.bookingdates.checkout"), booking.getBookingdates().getCheckout());
		
		//additionalneeds assertion
		softAssert.assertEquals(json.getString("booking.additionalneeds"), booking.getAdditionalneeds());
		
		softAssert.assertAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

