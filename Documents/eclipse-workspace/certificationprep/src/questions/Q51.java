package questions;

import java.util.HashMap;

public class Q51 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>(); 
        map.put("A", map.size()); 
        map.put("B", map.size()); 
        map.put("C", map.size()); 
        
        System.out.println(map);//?

        for(Integer w : map.values()) {
        	System.out.print(w + " ");//?
        }
	}
}
