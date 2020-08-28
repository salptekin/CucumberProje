package day41mapsdt;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProjectForMaps02 {
	
	/*
	 1)Create a list for color codes
	 2)Create a list for color names
	 3)Match the color codes with color names
	 4)Print code and colors like lightsalmon = rgb(255,160,122) 
	 Note: Work with 7 colors
	 */

	public static void main(String[] args) {
		
		List<String> codes = new ArrayList<>();
		codes.add("rgb(255,160,122)");
		codes.add("rgb(250,128,114)");
		codes.add("rgb(233,150,122)");
		codes.add("rgb(240,128,128)");
		codes.add("rgb(205,92,92)");
		codes.add("rgb(220,20,60)");
		codes.add("rgb(178,34,34)");
		
		List<String> colors = new ArrayList<>();
		colors.add("lightsalmon");
		colors.add("salmon");
		colors.add("darksalmon");
		colors.add("lightcoral");
		colors.add("indianred");
		colors.add("crimson");
		colors.add("firebrick");
		
		Map<String, String> colorsCodes = new TreeMap<>();
		//You have to use loops
		colorsCodes.put(colors.get(0),codes.get(0));
		System.out.println(colorsCodes);

	}

}
