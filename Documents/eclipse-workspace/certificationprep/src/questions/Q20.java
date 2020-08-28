package questions;

public class Q20 {

	public static void main(String[] args) {
		int i;
		try {
			int k = 11;
			int m = 0;
			
			i = k / m;
		}catch(ArithmeticException e) {
			i = 0;
		}catch(Exception e) {
			i = 1;
		}
		System.out.println(i);//?
	}
}
