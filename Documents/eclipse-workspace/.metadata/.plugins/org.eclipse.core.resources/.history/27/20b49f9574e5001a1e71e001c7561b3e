package techproedturkish01.techproedturkish01api;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PostRequest03 extends TestBase  {
	
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
	
	@Test
	public void post01(){
		
		Response response = createRequestBodyByMap();
		
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
		softAssert.assertEquals(json.getString("booking.firstname"), "Suleyman");
		
		//lastname assertion
		softAssert.assertEquals(json.getString("booking.lastname"), "Alptekin");
		
		//totalprice assertion
		softAssert.assertEquals(json.getInt("booking.totalprice"), 123);
		
		//depositpaid assertion
		softAssert.assertEquals(json.getBoolean("booking.depositpaid"), true);
		
		//checkin assertion
		softAssert.assertEquals(json.getString("booking.bookingdates.checkin"), "2020-05-02");
		
		//checkout assertion
		softAssert.assertEquals(json.getString("booking.bookingdates.checkout"), "2020-05-05");
		
		//additionalneeds assertion
		softAssert.assertEquals(json.getString("booking.additionalneeds"), "Wifi");
		
		softAssert.assertAll();
	
	}

}
