package questions;

public class Q39 {

	public static void main(String[] args) {
	
		char c = 'a';
		while(m(c)) {
			System.out.print(c);//?
			c++;
		}
		
		System.out.println();
		
		char d = 'a';
		while(m(d)) {
			d++;
			System.out.print(d);//?	
		}
		
		System.out.println();
		
		char e = 'a';
		while(m(e)) {
			System.out.print(e);//?	
		}

	}
	
	public static boolean m(char x) {
		return x++ < 'e' ? true : false;
	}

}
