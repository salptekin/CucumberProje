package day33projectsnt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q01 {
	
	/*
		                              Warm Up - 15 Minutes

		1) Create a package, name it as "projectsnt"
		2) Create a class, name it as Q01
		3) Get personal names from user
		4) Create 'unique' id numbers for every personnel
		5) If some personnel has completely same names, ask personnel to select a nick name 
		   and use nickname at the end of the name.
		6) When user enters 'q' it will end the program 
		7) Print the personnel names and unique ids like => {John Walker=202035, Mark Twain=202036, John Walker Nick=202037} 
    */

	static int id = 20203500;
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		String name = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter personnel name");
		System.out.println("If you want to quit and see the personnal list press 'q'");
		
		while(!name.equals("q")) {
			name = scan.nextLine();
			
			if(!name.equals("q")) {
				
				if(map.containsKey(name)) {
					System.out.println(name + " exists, please enter a nickname");
					String nickName = scan.nextLine();
					name = name  + nickName;
				}
				
				map.put(name, id);
				id++;
			}
	
		}
		 System.out.println(map);

		 scan.close();

	}

}
