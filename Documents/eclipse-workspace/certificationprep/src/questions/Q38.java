package questions;

import java.io.IOException;

public class Q38 {

	public static void main(String[] args) {
		Q38 obj = new Q38();
		String firstName = "John";
		String lastName = "Walker";
		
		//Why is it complaining when I uncomment?
		
//		obj.m1(firstName);
//		obj.m2(lastName);

	}
	
	public void m1(String firstName) throws IOException{
		System.out.println("Print firstname");
	}
	
	public void m2(String lastName) throws RuntimeException{
		System.out.println("Print lastname");
	}

}
