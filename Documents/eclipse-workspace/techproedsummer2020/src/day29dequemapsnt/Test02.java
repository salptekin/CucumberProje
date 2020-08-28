package day29dequemapsnt;

import java.util.HashMap;

public class Test02 {
	public static void main(String[] args){ 
        HashMap<String, Integer> map = new HashMap<>(); 
        map.put("A", 100); 
        map.put("B", 101); 
        map.put("C", 102); 
        System.out.println(map);
        for(Integer w : map.values()) {
        	System.out.print(w + " ");
        }
    } 
}
