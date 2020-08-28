package techproedturkish01.techproedturkish01api;

import org.junit.Before;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class TestBase {
	
	protected RequestSpecification spec01;
	protected RequestSpecification spec02;
	protected RequestSpecification spec03;
	
	@Before
	public void setUp01() {		
		spec01 = new RequestSpecBuilder().
				             setBaseUri("https://restful-booker.herokuapp.com").
				             build();		
	}
	
	@Before
	public void setUp02() {		
		spec02 = new RequestSpecBuilder().
				             setBaseUri("http://dummy.restapiexample.com/api/v1/employees").
				             build();		
	}
	
	@Before
	public void setUp03() {		
		spec03 = new RequestSpecBuilder().
				             setBaseUri("https://jsonplaceholder.typicode.com/todos").
				             build();		
	}
	
	

}
