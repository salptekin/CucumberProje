package day33exceptionsdt;

public class Test01 {

	public static void main(String[] args) {
		Integer z = 0;
		try {			
		   String s = "abcd";
		   z = Integer.parseInt(s);		   
		}catch(NumberFormatException e) {			
			System.out.println("Good");			
		}
		System.out.println(z);
		
		String s = "abcd";
		try {
			Object obj = new Integer(12);
			s = (String)obj;
		}catch(ClassCastException e){
			System.out.println("Good");
		}
		System.out.println(s);
	}

}
