package techproedturkish01.techproedturkish01api;

import static org.junit.Assert.assertEquals;

import org.hamcrest.Matchers;
import org.junit.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetRequest03 {

	/*
	 Positive Scenario:
	 When Asagidaki Endpoint'e bir GET request yolladim 
	 https://restful-booker.herokuapp.com/booking/7   
     And Accept type “application/json” dir
     Then 
     HTTP Status Code 200
     And Response format "application/json"
     And firstname "Sally"
     And lastname "Jackson"
     And checkin date "2017-04-19"
     And checkout date "2020-03-22"
	*/
	
	@Test
	public void get01() {
		
		Response response = given().
				               accept("application/json").
				            when().
				               get("https://restful-booker.herokuapp.com/booking/7");
		response.prettyPrint();
		
		//Status code icin 1.Yol:
		response.
		then().
		assertThat().
		statusCode(200).
		contentType("application/json").
		body("firstname", Matchers.equalTo("Sally")).
		body("lastname", Matchers.equalTo("Jackson")).
		body("totalprice", Matchers.equalTo(5000)).
		body("depositpaid", Matchers.equalTo(true)).
		body("bookingdates.checkin", Matchers.equalTo("2015-02-03")).
		body("bookingdates.checkout", Matchers.equalTo("2015-03-12")).
		body("additionalneeds", Matchers.equalTo("BALIK_EKMEK_LIMON_TURSU_ve_Baklavada_Yemiyek_mi"));
		
		//Tekrarli body() kullanmadan nasil yapilir?
		response.
		then().
		assertThat().
		statusCode(200).
		contentType("application/json").
		body("firstname", Matchers.equalTo("Sally"),
			 "lastname", Matchers.equalTo("Jackson"),
			 "totalprice", Matchers.equalTo(5000),
			 "depositpaid", Matchers.equalTo(true),
			 "bookingdates.checkin", Matchers.equalTo("2015-02-03"),
			 "bookingdates.checkout", Matchers.equalTo("2015-03-12"),
			 "additionalneeds", Matchers.equalTo("BALIK_EKMEK_LIMON_TURSU_ve_Baklavada_Yemiyek_mi"));

		//Status code icin 2.Yol:
		assertEquals(200, response.getStatusCode());
	
	}

}
