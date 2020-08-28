package day18daytiment;

public class Question01 {

	public static void main(String[] args) {
		
		//String concatenation works with all primitive data types not just with integers
		//Look at the following example, I concatenated String with a char and with a
		//boolean
		String a = "";	
		a+=2;
		a+='c';
		a+=false;	
		if(a=="2cfalse") {
			System.out.println("==");
		}	
		if(a.equals("2cfalse")) {
			System.out.println("equals");
		}
	}
}
