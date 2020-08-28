package techproedturkish01.techproedturkish01api;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Delete01 extends TestBase {

	@Test
	public void delete01() {
		
		Response responseBeforeDelete = given().
				                          spec(spec03).
				                        when().
				                          get("198");
		responseBeforeDelete.prettyPrint();
		
		Response responseAfterDelete = given().
				                          spec(spec03).
				                       when().
				                          delete("/198");
		responseAfterDelete.prettyPrint();
		
		Response getResponseAfterDelete = given().
                                             spec(spec03).
                                             when().
                                             get("/198");
		getResponseAfterDelete.prettyPrint();
		
		
		responseAfterDelete.
		              then().
		              assertThat().
		              statusCode(200);
		
		assertTrue(responseAfterDelete.getBody().asString().equals(null));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
