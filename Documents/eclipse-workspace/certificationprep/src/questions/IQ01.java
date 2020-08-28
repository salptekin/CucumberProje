package questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class IQ01 {
	
	/*				
								Warm Up - 10 Minutes
								
				 1)Create a package, name it as questions
				 2)Create a class, name it as IQ01
				 3)Create an array like {2, 3, 1, 5, 3, 2, 2, 3, 3}
				 4)Print the repeated elements on the console
				 5)Use 'structured programming'
				 6)Try to do by using 'functional programming'
				 
	*/

	public static void main(String[] args) {
		
		String arr[] = {"A", "B", "D", "C", "B", "A", "A", "B", "B"};
		Set<String> set1 = new HashSet<>();
		
		//1. Way:
		for (int i = 0; i < arr.length; i++) { 			
			for (int j = i + 1 ; j < arr.length; j++) {			
				if (arr[i]== arr[j]) { 
					set1.add(arr[i]);
				} 		
			} 		
		}		
        System.out.println(set1);
        
        //2. Way
        Set<String> set2a = new HashSet<>();
        Set<String> set2b = new HashSet<>();
        for (String w : arr) { 
        	if (set2a.add(w) == false) { 
                set2b.add(w);
        	} 
        }
        System.out.println(set2b);
        
        
        //3. Way
        List<String> list = Arrays.asList(arr);
        list.stream()
            .filter(t -> Collections.frequency(list, t) > 1)
            .collect(Collectors.toSet())
            .forEach(t->System.out.print(t + " "));
        
        System.out.println();
        
        
        //4. Way
        Map<String, Integer> map = new HashMap<>();
        for (String w : arr) { 
        	int count = 1;
        	if(!map.containsKey(w)) {
        		map.put(w, count);
        	}else {
        		map.put(w, map.get(w)+1);
        	}     	
        }
        System.out.println(map);

	}
}
