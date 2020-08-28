package interviewcodequestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		
		System.out.println("Enter list elements (to stop press 'S')");		
		removeDuplicates();
	}
	
	public static void removeDuplicates() {
		Scanner scan = new Scanner(System.in);
		String s = "";
		List<String> list = new ArrayList<>();
		while(!s.equals("S")) {
			s = scan.next();
			if(!s.equals("S")) {
				list.add(s);
			}
		} 
		System.out.println(list);
		Set<String> set = new HashSet<>(list);
		System.out.println(set);
		scan.close();
	}
	

}
