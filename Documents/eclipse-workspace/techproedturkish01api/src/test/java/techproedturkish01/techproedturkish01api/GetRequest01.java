package techproedturkish01.techproedturkish01api;

import org.junit.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class GetRequest01 {
	
//Rest-Assured kullanarak API Testing yapacagiz	
	
	@Test
	public void getMethod01() {
		
		given().
		when().
		   get("https://restful-booker.herokuapp.com/booking").
		then().
		   assertThat().
		   statusCode(200);		
	}
	
	//GET ile aldigim data'yi console'da gormek istiyotum
	@Test
	public void getMethod02() {
		
		Response response = given().
		                    when().
		                    get("https://restful-booker.herokuapp.com/booking/5");
		//Response body'i console'a yazdirmak icin response.prettyPrint(); kullanilir.
		response.prettyPrint();	
		
		//statuscode'u console'da gormek icin;  
		System.out.println("Status code: " + response.getStatusCode());
		
		//statusline'i console'da gormek icin;
		System.out.println("Status line: " + response.getStatusLine());
		
		//Response body'deki data'nin content(icerik) type
		//1. Yol:
		System.out.println("Content Type 1.Yol: " + response.getContentType());
		//2. Yol
		System.out.println("Content Type 2.Yol: " + response.getHeader("Content-Type"));
		
		//Headers'daki tum bilgileri almak icin;
		System.out.println(response.getHeaders());
		
		//Headers'dan istenen specific bir data'yi almak
		System.out.println(response.getHeader("Date"));
		
		//Assertion yapalim
		
		//1)Status code 200
		//assertThat() kullanirsaniz "Hard Assertion" yapiyorsunuz demektir.
		//Yani; ilk hatada code execution durur ve hata raporu verilir. 
		//Ilk hatadan sonraki kodlar calistirilmaz.
		response.
		then().
		assertThat().
		statusCode(200).
		statusLine("HTTP/1.1 200 OK").
		contentType("application/json; charset=utf-8");
	
	}

}
