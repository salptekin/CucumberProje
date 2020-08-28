package day34projectsnt;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Q01 {
	
			/*				
							                 Warm Up - 10 Minutes
							
						1)Create a package, name it as "day34projectsnt"
						2)Create a class, name it as IQ01
						3)Create an array like {"A", "B", "D", "C", "B", "A", "A", "B", "B"};
						4)Print the repeated elements on the console
						5)Use 'structured programming'
						6)Try to do by using 'functional programming'
			
			*/


	public static void main(String[] args) {
		
		String arr[] = {"A", "B", "D", "C", "B", "A", "A", "B", "B", "B"};
		
		//1. Way: Set and nested for loop
		Set<String> set = new HashSet<>();			
		for(int i=0; i<arr.length; i++) {		
			for(int j=i+1; j<arr.length; j++) {				
				if(arr[i].equals(arr[j])) {
					set.add(arr[i]);
				}
			}
		}
		System.out.println(set);//[A,B]
		
		//2. Way: Map and for each loop
		Map<String,Integer> map = new HashMap<>();		
		for(String w : arr) {				
			if(!map.containsKey(w)) {
				map.put(w, 1);
			}else {
				map.put(w, map.get(w)+1);
			}			
		}
		System.out.println(map);
		
		//3. Way: Functional programming
		List<String> list = Arrays.asList(arr);		
		list.stream()
		    .filter(t->Collections.frequency(list, t)>1)
		    .collect(Collectors.toSet())
		    .forEach(t->System.out.print(t+ " "));//A B

	}
}
