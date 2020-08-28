package techproedturkish01.techproedturkish01api;

import static io.restassured.RestAssured.*;
import java.util.ArrayList; 
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.testng.asserts.SoftAssert;
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
        
        List<Map<String, Object>> listOfMaps = response.as(ArrayList.class);
        
        System.out.println(listOfMaps);
        System.out.println(listOfMaps.get(0));
        
        SoftAssert softAssert = new SoftAssert();
        
        //200 tane id oldugunu 'verify' ediniz.
        softAssert.assertTrue(listOfMaps.size()==200,"Id sayisi istenen gibi degil");
             
        //121. elemanin completed degerinin true oldugunu verify ediniz
        softAssert.assertEquals(listOfMaps.get(120).get("completed"), true, "Istenen gibi degil");
        
        //Sondan bir onceki elemanin title'inin 'numquam repellendus a magnam' oldugunu verify ediniz
        softAssert.assertEquals(listOfMaps.get(listOfMaps.size()-2).get("title"), "numquam repellendus a magnam");
		softAssert.assertAll();
    
	}
}
