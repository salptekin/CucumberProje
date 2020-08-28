package questions;

public class Q15 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Good");
		
		String s1 = sb.toString();
		String s2 = s1;
		String s3 = "Good";
		String s4 = "Good";
		
		System.out.println(s1.equals(s2));//?
		
		System.out.println(s1==s2);//?
		
		System.out.println(s2==s3);//?
		
		System.out.println(s4==s3);//?
	}
}
