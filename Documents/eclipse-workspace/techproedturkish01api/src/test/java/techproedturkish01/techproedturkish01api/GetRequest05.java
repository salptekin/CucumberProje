package techproedturkish01.techproedturkish01api;
import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;
import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetRequest05 {
	/*
	     When I send a GET request to REST API URL 
		      https://restful-booker.herokuapp.com/booking/5   
	     Then HTTP Status Code 200 olsun
	     And Response content type “application/JSON” olsun
	     And "firstname" "Jim" olsun
	     And "totalprice" 602 olsun
		 And "checkin" "2015-06-12" olsun	
	 */
	@Test
	public void getMethod01() {
		
		Response response = given().
							when(). 
								get("https://restful-booker.herokuapp.com/booking/5");
		response.prettyPrint();
		
		response.
			then().
			assertThat().
			statusCode(200).
			contentType(ContentType.JSON).
			body("firstname", Matchers.equalTo("Mark"),
				 "totalprice", Matchers.equalTo(892),
				 "bookingdates.checkin", Matchers.equalTo("2018-03-21"));
		}
	
}
