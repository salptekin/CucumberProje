package questions;

public class Q41 {

	public static void main(String[] args) {
	
		char c = 'z';
		
		char d = c--;
		
		char e = --c;
		
		char f = c-=2;

		char result = (d>e) ? (e>f) ? f : (d<f) ? e : d : f;

		System.out.println(result);//?

	}

}
