package day29dequemapsnt;

import java.util.HashMap;
import java.util.Map;

public class M02 {
	
	//Methods of HashMap

	public static void main(String[] args) {

		Map<Integer, String> hMap = new HashMap<>();
		hMap.put(100, "Ali Can");
		hMap.put(101, "Veli Han");
		hMap.put(102, "Ayse Tan");
		hMap.put(103, "Emine Ran");
		
		System.out.println(hMap);//{100=Ali Can, 101=Veli Han, 102=Ayse Tan, 103=Emine Ran}
		
		System.out.println(hMap.remove(101));//Veli Han
		System.out.println(hMap);//{100=Ali Can, 102=Ayse Tan, 103=Emine Ran}
		
		hMap.remove(102, "Kemal Yan");//returns false
		System.out.println(hMap);//{100=Ali Can, 102=Ayse Tan, 103=Emine Ran}
		
		System.out.println(hMap.keySet());//[100, 102, 103]
		System.out.println(hMap.values());//[Ali Can, Ayse Tan, Emine Ran]
		
		System.out.println(hMap.size());//3
		
		System.out.println(hMap.isEmpty());//false
		
		System.out.println(hMap.getClass());
		
		hMap.clear();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
