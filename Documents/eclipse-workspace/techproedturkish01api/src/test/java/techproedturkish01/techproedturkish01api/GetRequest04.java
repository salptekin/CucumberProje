package techproedturkish01.techproedturkish01api;

import org.hamcrest.Matchers;
import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetRequest04 {

	/*
	 Positive Scenario:
		 When I send a GET Request to  
		     http://dummy.restapiexample.com/api/v1/employees   
	     And Accept type  “application/JSON” olsun
	     Then 
	         HTTP Status Code 200 olsun
	     And Response'in format "application/JSON" olsun
	     And 24 employees olsun
	     And "Ashton Cox" employee'lerden biri olsun
	     And 21, 61, ve 23 employee yaslarindan biri olsun
	*/
	
	@Test
	public void get01() {
		Response response = given().
				               accept(ContentType.JSON).//"application/JSON" da kullanilir ama bu daha iyi
				            when().
				               get("http://dummy.restapiexample.com/api/v1/employees"); 
		response.prettyPrint();
		
		response.
		   then().
		   assertThat().
		   statusCode(200).
		   contentType(ContentType.JSON).//"application/JSON" da kullanilir ama bu daha iyi
		   body("data.id", Matchers.hasSize(24)).
		   body("data.employee_name", Matchers.hasItem("Ashton Cox")).
		   body("data.employee_age",Matchers.hasItems("21", "61", "23"));
	}
}
