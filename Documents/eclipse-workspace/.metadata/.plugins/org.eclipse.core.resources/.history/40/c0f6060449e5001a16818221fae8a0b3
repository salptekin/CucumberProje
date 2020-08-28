package techproedturkish01.techproedturkish01api;

import static io.restassured.RestAssured.*;
import java.util.ArrayList; 
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import com.google.gson.Gson;

import io.restassured.response.Response;

public class GetRequest12 extends TestBase {

	/*
	 GSON: GSON, 1) Json formatindaki data'lari Java Objectlerine donusturur. (De-Serialization) 
	             2) Java Object'lerini Json formatindaki data'lara donusturur.(Serialization)
	             
	 Note: GSON ile ayni isi yapan ObjectMapper Class da var
	*/

	@Test
	public void get01() {
		
		Response response = given().
	                          spec(spec03).
	                        when(). 
	                          get();
		
        response.prettyPrint();
        
        //By using GSON
        
        List<Map<String, Object>> listOfMapsByGson = response.as(ArrayList.class);
        
        System.out.println("Convertod to Java Object by GSON: " + listOfMapsByGson);
        System.out.println(listOfMapsByGson.get(0));
        
        SoftAssert softAssert = new SoftAssert();
        
        //200 tane id oldugunu 'verify' ediniz.
        softAssert.assertTrue(listOfMapsByGson.size()==200,"Id sayisi istenen gibi degil");
             
        //121. elemanin completed degerinin true oldugunu verify ediniz
        softAssert.assertEquals(listOfMapsByGson.get(120).get("completed"), true, "Istenen gibi degil");
        
        //Sondan bir onceki elemanin title'inin 'numquam repellendus a magnam' oldugunu verify ediniz
        softAssert.assertEquals(listOfMapsByGson.get(listOfMapsByGson.size()-2).get("title"), "numquam repellendus a magnam");
        
        //How to convert Java Object into Json by using GSON
        Gson gsonObj = new Gson();
        System.out.println(gsonObj.toJson(listOfMapsByGson));
		
        
        //By Using Jackson ObjectMapper
        
		List<Map<String, Object>> listOfMapsByJackson = JsonUtil.convertJsonToJava(response.asString(), ArrayList.class);
		System.out.println("Convertod to Java Object by Jackson: " + listOfMapsByJackson);
		
		//200 tane id oldugunu 'verify' ediniz.
        softAssert.assertTrue(listOfMapsByJackson.size()==200,"Id sayisi istenen gibi degil");
             
        //121. elemanin completed degerinin true oldugunu verify ediniz
        softAssert.assertEquals(listOfMapsByJackson.get(120).get("completed"), true, "Istenen gibi degil");
        
        //Sondan bir onceki elemanin title'inin 'numquam repellendus a magnam' oldugunu verify ediniz
        softAssert.assertEquals(listOfMapsByJackson.get(listOfMapsByJackson.size()-2).get("title"), "numquam repellendus a magnam");
		softAssert.assertAll();
		
		//How to convert Java Object into Json by using Jackson
		String jsonString = JsonUtil.convertJavaToJson(listOfMapsByJackson);
		System.out.println("Java Object converted into Json" + jsonString);
		
		
		
		
		
		
		
		
    
	}
}
