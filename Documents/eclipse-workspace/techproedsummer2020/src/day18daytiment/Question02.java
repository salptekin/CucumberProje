package day18daytiment;

public class Question02 {

	public static void main(String[] args) {
		String s1 = "Java";
		StringBuilder s2 = new StringBuilder("Java");
		
		//Do not try to compare two different data types by using "==" 
		//you get Compile Time Error
//		if(s1 == s2) {
//			System.out.println("1");
//		}
		
		//If you use equals() to compare String and StringBuilder you will not get 
		//Compile Time Error but Java will not return true even the values are same
		if(s1.equals(s2)) {
			System.out.println("2");
		}
	}

}
