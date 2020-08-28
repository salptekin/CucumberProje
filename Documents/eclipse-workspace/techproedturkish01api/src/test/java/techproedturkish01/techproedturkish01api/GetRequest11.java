package techproedturkish01.techproedturkish01api;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

import com.google.gson.Gson;

import io.restassured.response.Response;

public class GetRequest11 extends TestBase {
	
	/*
	 GSON: GSON, 1) Json formatindaki data'lari Java Objectlerine donusturur. (De-Serialization) 
	             2) Java Object'lerini Json formatindaki data'lara donusturur.(Serialization)
	             
	 Note: GSON ile ayni isi yapan ObjectMapper Class'da var
	*/
	
	@Test
	public void get01() {
		Response response = given().
				               spec(spec03).
				            when(). 
				               get("/2");
		response.prettyPrint();
		
		//Json formatindaki data'yi Java Object'ini GSON kullanarak cevirme ==> De-Serialization
		HashMap<String, String> map = response.as(HashMap.class); 
		System.out.println(map);
		
		System.out.println(map.keySet());//[id, completed, title, userId]
		System.out.println(map.values());//[2.0, false, quis ut nam facilis et officia qui, 1.0]
		
		SoftAssert softAssert = new SoftAssert();
		
		//'completed' key'sinin degerinin false oldugunu 'verify' ediniz
		softAssert.assertEquals(map.get("completed"), false,"false olmaliydi ama degil");
		
		//userId degerini verify ediniz.
		softAssert.assertEquals(map.get("userId"), 1);
		
		//id degerini verify ediniz.
		softAssert.assertEquals(map.get("id"), 2);
		
		//title degerini verify ediniz.
		softAssert.assertEquals(map.get("title"), "quis ut nam facilis et officia qui");
		softAssert.assertAll();
		
		//Java Object'ini Json formatina cevirme ==> Serialization
		Gson gson = new Gson();
		String jsonFromMap = gson.toJson(map);
		System.out.println(jsonFromMap);//{"id":2,"completed":false,"title":"quis ut nam facilis et officia qui","userId":1}
		
	}

}
