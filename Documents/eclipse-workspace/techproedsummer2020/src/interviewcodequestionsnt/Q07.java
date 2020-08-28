package interviewcodequestionsnt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Q07 {
	
	/*
	 Ask user to enter a String
	 Print the repeated characters on the console
	 "programming" ==> r=2, g=2, m=2
	*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to see repeated characters");
		String s = scan.nextLine();
		
		Map<String, Integer> map = new HashMap<>();
		String a[] = s.split("");
		
		for(String w : a) {
			if(!map.containsKey(w)) {
				map.put(w, 1);
			}else {
				map.put(w, map.get(w)+1);
			}
		}
		Set<String> set = new HashSet<>();
		for(String w : a){
			if(map.get(w)>1) {
				set.add(w + " = " + map.get(w));
			}
		}
		System.out.println(set);

	}

}
