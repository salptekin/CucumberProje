package questions;

public class Q02 {
	
	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		if(++x > y++) {
			System.out.println("Good");
		}else {
			System.out.println("Bad");
		}
		System.out.println("x=" + x + " y=" + y);
	}
	
}
