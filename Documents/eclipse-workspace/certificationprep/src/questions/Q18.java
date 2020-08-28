package questions;

public class Q18 {	
	
	int i;
	
	public static void main(String[] args) {
		
		Q18 obj = new Q18();
		obj.i = 11;
		String s = "Good";
		int i = 22;
		
		m1(i);//?
		m1(obj.i);//?
		m1(s);//?
		
	}
	
	public static void m1(int x) {
		x = x + x + x;
		System.out.println(x);
	}
	
	public static void m1(String s) {
		s = s + "!";
		System.out.println(s);
	}
}
