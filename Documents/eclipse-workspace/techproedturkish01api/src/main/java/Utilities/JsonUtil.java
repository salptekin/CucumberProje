package Utilities;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {
	
	private static ObjectMapper mapper;
	
	static {
		mapper = new ObjectMapper();
	}
	
	//Java object'ini Json formatina ceviren method ==> Serialization
	public static String convertJavaToJson(Object object) {
		String jsonResult = "";
		
		try {
			jsonResult = mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			System.out.println("Java Obje'sini Json'a cevirirken exception olustu" + e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("Java Obje'sini Json'a cevirirken exception olustu" + e.getMessage());
		} catch (IOException e) {
			System.out.println("Java Obje'sini Json'a cevirirken exception olustu" + e.getMessage());
		}	
		return jsonResult;
	}
	
	//Json formatindaki data'yi Java object'ine ceviren method ==> De-Serialization
	public static <T> T convertJsonToJava(String json, Class<T> cls) {
		
		T javaResult = null;
		
		try {
			javaResult  = mapper.readValue(json, cls);
		} catch (JsonParseException e) {
			System.out.println("Json'i Java'ya cevirirken Exception olustu" + e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("Json'i Java'ya cevirirken Exception olustu" + e.getMessage());
		} catch (IOException e) {
			System.out.println("Json'i Java'ya cevirirken Exception olustu" + e.getMessage());
		}		
		return javaResult;	
		
	}
	
	
	
	
	
	
	
	

}
