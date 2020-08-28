package techproedturkish01.techproedturkish01api;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import org.json.JSONObject;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PatchRequest01 extends TestBase {
	
	@Test
	public void patch01() {
		
		Response responseBeforePatch = given().
				                         spec(spec03).
				                       when().
				                         get("/200");
		
		responseBeforePatch.prettyPrint();
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("title", "Kemal Can");
		
		Response responseAfterPatch = given().
				                         contentType(ContentType.JSON).
				                         spec(spec03).
				                         body(jsonObject.toString()).
				                      when().
				                         patch("/200");
		responseAfterPatch.prettyPrint();
		
		responseAfterPatch.
		              then().
		              assertThat().
		              statusCode(200);
		
		JsonPath json = responseAfterPatch.jsonPath();
		
		//title'i hard assertion yapalim
		assertEquals(jsonObject.get("title"),json.get("title"));
		
		//title'i soft assertion yapalim
		SoftAssert softAssert = new SoftAssert();	
		softAssert.assertEquals(json.getString("title"),jsonObject.get("title"));
		softAssert.assertAll();
		
	}

}
