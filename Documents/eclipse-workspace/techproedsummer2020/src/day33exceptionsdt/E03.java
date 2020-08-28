package day33exceptionsdt;

public class E03 {

	public static void main(String[] args) {
		
		long x = 1234;
		int y = (int)x;//Explicit narrowing
		
		try {			
		   String s = "John";
		   Integer z = Integer.parseInt(s);		   
		}catch(NumberFormatException e) {			
			System.out.println("Strings cannot be parsed to integer");			
		}
	}
}
