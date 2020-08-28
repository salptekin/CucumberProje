package techproedturkish01.techproedturkish01api;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetRequest09 extends TestBase{
	
	@Test
	public void get01() {
		
		Response response = given().
				              spec(spec02).
				            when().
				              get();
		response.prettyPrint();
		
		//JsonPath objesi olusturun
		JsonPath json = response.jsonPath();
		
		//Tum employee isimlerini console'a yazdiriniz
		System.out.println(json.getList("data.employee_name"));
		
		//Ikinci iscinin(index 1) isminin 'Garret Winters' oldugunu "verify"(soft assertion) ediniz
		//data bir list oldugundan istenen elemana index ile ulasiriz
		
		//Hard Assertion ile yaptik halbuki soruda "verify" diyor. Bu yuzden soft assertion kullanmaliyiz
		assertEquals("Isim istenen gibi degil", "Garrett Winters", json.getString("data[1].employee_name"));
		
		/*
		 Soft Assertion icin 3 adim takip edilmelidir: 1) SoftAssert class'indan bir obje (softAssert) olustur
		                                               2) Objeyi (softAssert) kullanarak assertion yap
		                                               3) softAssert.assertAll();
		*/
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(json.getString("data[1].employee_name"),"Garrett Winters", "Isim istenen gibi degil");
		
		//Iscilerin arasinda Herrod Chandler'in var oldugunu "verify" ediniz.
		softAssert.assertTrue(json.getList("data.employee_name").contains("Herrod Chandler"),"Herrod Chandler yok");
			
		//24 tane isci oldugunu verify ediniz
		softAssert.assertEquals(json.getList("data.id").size(), 24, "24 isci yok");
		
		//7. iscinin maasinin 137500 oldugunu verify ediniz
		softAssert.assertEquals(json.getString("data[6].employee_salary"), "137500", "Maas istenen gibi degil");
		softAssert.assertAll();
	}

}
