package techproedturkish01.techproedturkish01api;

import org.junit.Test;
import org.testng.asserts.SoftAssert;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PostRequest02 extends TestBase {
	
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
	public void post01() {
	
		Response response = createRequestBodyByJsonObjectClass();//JSONObject Class kullandik
		
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
		softAssert.assertEquals(json.getString("booking.firstname"), jsonRequestBody.getString("firstname"));
		
		//lastname assertion
		softAssert.assertEquals(json.getString("booking.lastname"), jsonRequestBody.getString("lastname"));
		
		//totalprice assertion
		softAssert.assertEquals(json.getInt("booking.totalprice"), jsonRequestBody.getInt("totalprice"));
		
		//depositpaid assertion
		softAssert.assertEquals(json.getBoolean("booking.depositpaid"), jsonRequestBody.getBoolean("depositpaid"));
		
		//checkin assertion
		softAssert.assertEquals(json.getString("booking.bookingdates.checkin"), jsonBookingDatesBody.getString("checkin"));
		
		//checkout assertion
		softAssert.assertEquals(json.getString("booking.bookingdates.checkout"), jsonBookingDatesBody.getString("checkout"));
		
		//additionalneeds assertion
		softAssert.assertEquals(json.getString("booking.additionalneeds"), jsonRequestBody.getString("additionalneeds"));
		
		softAssert.assertAll();
	
	}

}
