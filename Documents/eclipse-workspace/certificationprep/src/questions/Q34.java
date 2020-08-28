package questions;

public class Q34 {

	public static void main(String[] args) {
		String s1 = "X ";
		s1 = s1 + "Y ";
				
		String s2 = "A ";
		s2 = s2.concat("B ");
		
		s2.concat(s1);
		System.out.println(s2);//?
		
		s2 = s2.replace(" ", "-");
		System.out.println(s2);//?

	}

}
