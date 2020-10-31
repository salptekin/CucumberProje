package techproedenglish01.techproedenglish01api;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class GetRequest02 {
	
	/*
	 Positive Scenario
	 when I send a GET Request to https://restful-booker.herokuapp.com/booking
	 and I accept type "application/json"  ==> Means API is accepting data just in Json Format
	 then status code should be 200
	 and content type should be "application/json" ==> Response body must be in Json format
	 */
	
	@Test
	public void getMethod01() {
		
		Response response = given().
				               accept(ContentType.JSON).
				            when().
				               get("https://restful-booker.herokuapp.com/booking");		
		response.
		    then().
		    assertThat().
		    statusCode(200).
		    contentType(ContentType.JSON);
	}
	
	/*
	 Positive Scenario
	 when I send a GET Request to https://restful-booker.herokuapp.com/booking/5
	 then status code should be 200
	 and content type should be "application/json"
	*/
	@Test
	public void getMethod02() {
		
		Response response = given().
							when().
								get("https://restful-booker.herokuapp.com/booking/5");
		response.
			then().
			assertThat().
			statusCode(200).
			contentType(ContentType.JSON);
		
	}
	
	/*
	 Negative Scenario
	 when I send a GET Request to https://restful-booker.herokuapp.com/booking/1001
	 then status code should be 404
	 and Response Body contains "Not Found"
	 and Response Body does not contain "Suleyman" 
	*/
	
	@Test
	public void getMethod03() {
		Response response = given().
				            when().
				            get("https://restful-booker.herokuapp.com/booking/1001");
		
		response.prettyPrint();
		
		response.then().assertThat().statusCode(404);
		
		assertFalse(response.asString().contains("Suleyman"));
		
		assertTrue(response.asString().contains("Not FoundXXXX"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
