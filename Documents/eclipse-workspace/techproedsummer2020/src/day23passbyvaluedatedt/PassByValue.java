package day23passbyvaluedatedt;

public class PassByValue {
	
	public static void main(String[] args) {
		
		String name = "Ali";	
		String copyName = upper(name);
		System.out.println(copyName);//ALI
		System.out.println(name);//Ali
		
	}
	
	public static String upper(String name) {
		return name.toUpperCase();
	}

	/*
	 Note: 1) When a method wants to use a value of a variable, Java creates the copy of value
	          and sends(pass) the copy into the method. When method runs the value of copy is updated.
	          Original value cannot be updated in Java. That one is called "Pass by Value"
	       2) Java is a pass by value language 
	       3) In "Pass by Reference" copy of reference is created but original reference and 
	          copy reference points the same value, if a method uses the original or copy reference
	          there will be no difference between them because both will point the same value. 
	*/

}
