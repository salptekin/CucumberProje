package questions;

public class Q32 {
	
	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder(7);
		String str = "";
		
		if(stb.equals(str)) {
			System.out.println("Good");
		}else if(stb.toString() == str) {
			System.out.println("Bad");
		}else if(stb.toString().equals((str))){
			System.out.println("Ugly");
		}else {
			System.out.println("Normal");
		}
	}
}
