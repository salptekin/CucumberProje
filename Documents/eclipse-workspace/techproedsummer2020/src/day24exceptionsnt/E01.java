package day24exceptionsnt;

public class E01 {

	public static void main(String[] args) {
		
		String str1 = "";
		System.out.println(str1.length());//0
		
		//1st way to send an error message to the console
		String str2 = null;		
		try {
		    System.out.println(str2.length());
		}catch(NullPointerException e) {
			System.out.println("null object do not have length");
		}
		//2nd to send an error message to the console
		try {
			measureLength(str2);
		}catch(NullPointerException e){
			e.printStackTrace();//returns detailed information about the exception
		}		
	}	
	public static void measureLength(String str) {
		if(str.equals(null)) {
			throw new NullPointerException();
		}else {
			System.out.println(str.length());
		}
	}

}
