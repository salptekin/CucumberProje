package questions;

import java.util.ArrayList;

public class Q49 {
	
	public static void main(String[] args) {

		ArrayList<String> sl = new ArrayList<>();
		String a[];
		
		try {
			
			while (true) {
				sl.add("Good");
			}
			
		} catch (RuntimeException e) {
			
			System.out.println("Bad");
			
		} catch (Exception e) {
			
			System.out.println("Ugly");
			
		}
		
	}
}
