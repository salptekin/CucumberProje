package day41mapsdt;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectForMaps {
	
	/*
	 1)Create a text file inside the day30mapsnt package
	 2)Type the following text inside the text file
	    Java is easy to learn.
	    Learn Java, earn money?
	    Java is easy if you study well.
	    To learn Java, type codes.
	 3)Type code to print every word is used how many times in the text. 
	*/

	public static void main(String[] args) throws IOException {
		
        Map<String,Integer> wordCounter = new HashMap<>();
        
        List<String> lines = Files.readAllLines(Paths.get("src/day41mapsdt/TextFile"), StandardCharsets.UTF_8);

        for(String w : lines) {
        	
        	String words[] = w.split(" ");
       	
        	for(String m : words) {        		
        		if(m.endsWith(",") || m.endsWith(".") || m.endsWith("?")) {
        			m= m.substring(0, m.length()-1);
        		}      		
        		if(!wordCounter.containsKey(m)) {
        			wordCounter.put(m, 1);
        		}else {
        			wordCounter.put(m, wordCounter.get(m)+1);
        		}
        	}      	
        }   	
    	System.out.println(wordCounter);
	}
}
