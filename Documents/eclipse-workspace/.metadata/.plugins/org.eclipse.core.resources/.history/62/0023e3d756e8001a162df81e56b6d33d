package techproedturkish01.techproedturkish01api;

import static org.hamcrest.Matchers.*;
import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class GetRequest06 extends TestBase01 {
  //TestBase class olusturup her testte kullanilan data'lari TestBase class'a koyup
  //tekrar tekrar ayni seyleri yazmaktan kurtulacagiz.
	
	/*
	    When I send a GET request to REST API URL 
		https://restful-booker.herokuapp.com/booking/5   
	    Then HTTP Status Code should be 200
	    And response content type is “application/JSON”
	    And response body should be like; 
	    {
		    "firstname": "Sally",
		    "lastname": "Jones",
		    "totalprice": 249,
		    "depositpaid": false,
		    "bookingdates": {
		        "checkin": "2016-04-18",
		        "checkout": "2016-11-15"
		     }
		 }
	 */
	
	@Test
	public void get01() {
		Response response = given().
				               spec(spec01).
				            when().
				               get("/booking/5");
		response.prettyPrint();
		
		response.
		    then().
		    assertThat().
		    statusCode(200).
		    contentType(ContentType.JSON).
		    body("firstname", equalTo("Eric"),
		    	 "lastname", equalTo("Jackson"),
		    	 "totalprice",equalTo(249),
		    	 "depositpaid",equalTo(false),
		    	 "bookingdates.checkin",equalTo("2016-04-18"), 
		    	 "bookingdates.checkout",equalTo("2019-07-02"),
		    	 "additionalneeds", equalTo("Breakfast"));
	}
}