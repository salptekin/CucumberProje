package day18daytiment;

public class AccessModifier02 {
	
	//For default access modifier do not type any access modifier
	
	/* What is the difference between "default" (package private) and 
	   "protected" access modifiers?
	  
	   Answer: 1) If sth is default, you can access it from just inside the package
	              If sth is protected, you can access it from inside the package + form
	              child classes inside the other packages
	           2) To make sth "default" we do not type access modifier but for 
	              "protected" we have to type protected   
	*/
	
	static int num1 = 12;

	public static void main(String[] args) {
		
	}

}
