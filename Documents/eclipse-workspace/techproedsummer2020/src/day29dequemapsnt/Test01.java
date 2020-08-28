package day29dequemapsnt;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
	public static void main(String[] args){
			Map<Integer, Object> sampleMap = new HashMap<Integer, Object>();
			sampleMap.put(1, null); 
			sampleMap.put(5, null); 
			sampleMap.put(3, null); 
			sampleMap.put(null, 7); 
			sampleMap.put(null, null); 
	 
	       System.out.println(sampleMap);
	}
}
