package day31exceptions;

public class E06 {
	/*
	 		ClassCastException
	*/

	public static void main(String[] args) {
		
		Object obj = new Object();
		try {
			
			String sObj = (String)obj;
			
		}catch(ClassCastException e) {
			
			System.out.println("Object data type'i String data type'ina donusturulemez");
			
		}

	}

}
