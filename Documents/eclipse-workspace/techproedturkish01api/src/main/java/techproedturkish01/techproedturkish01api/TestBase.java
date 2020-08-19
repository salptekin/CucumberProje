package techproedturkish01.techproedturkish01api;

import org.junit.Before;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class TestBase {
	
	protected RequestSpecification spec01;
	
	@Before
	public void setUp01() {		
		spec01 = new RequestSpecBuilder().
				             setBaseUri("https://restful-booker.herokuapp.com").
				             build();		
	}
	
	

}
