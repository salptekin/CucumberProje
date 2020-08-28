package techproedturkish01.techproedturkish01api;

import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import io.restassured.response.Response;

public class JsonUtil {
	
   private static ObjectMapper mapper;
   
   static {
	   mapper = new ObjectMapper();
   }
   
   public static String convertJavaToJson(Object obj) {
	   String jsonResult = "";
	   
	   try {
		jsonResult = mapper.writeValueAsString(obj);
	   } catch (JsonGenerationException e) {
			System.out.println("Exception occured while convertin Java object into Json" + e.getMessage());
	   } catch (JsonMappingException e) {
			System.out.println("Exception occured while convertin Java object into Json" + e.getMessage());
	   } catch (IOException e) {
			System.out.println("Exception occured while convertin Java object into Json" + e.getMessage());
	   }
		   return jsonResult;
   }
   
   public static <T> T convertJsonToJava(String jsonString, Class<T> cls) {//You can use Object as return type but we need downcasting
	   T result = null;
	   
	   try {
		result = mapper.readValue(jsonString, cls);
	   } catch (JsonParseException e) {
		System.out.println("Exception occured while converting Json into Java" + e.getMessage());
	   } catch (JsonMappingException e) {
			System.out.println("Exception occured while converting Json into Java" + e.getMessage());
	   } catch (IOException e) {
			System.out.println("Exception occured while converting Json into Java" + e.getMessage());
	   }
	   return result;
	   
   }

}
