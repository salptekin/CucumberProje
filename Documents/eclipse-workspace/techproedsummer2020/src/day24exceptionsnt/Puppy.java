package day24exceptionsnt;

public class Puppy {
	/*
	 Puppy wants to extend to class Dog but Java does not let to extend because Dog class
	 is declared as final. So final class cannot be parent or final class cannot have a child.
	*/
	
	public static void main(String[] args) {
		
		printAge(-12);//12
		
	}
	
	public static void printAge(int age) {		
		try {			
			if(age < 0) {
				throw new IllegalArgumentException();
			}
			System.out.println(age);
			
		}catch(IllegalArgumentException e) {
			
			System.out.println("Do not use negative numbers for age");
			
		}	
	}
	
	/*
	 1) "throw" keyword is used together with an object. To create an object you have to use "new" keyword
	    and the constructor. So every time after "throw" you will see "new" and constructor. But "throws" 
	    keyword is used together with the exception class name.
	 2) "throw" keyword is used inside the method body but "throws" keyword is used after the method 
	    parentheses outside of the method body.
	 3) If you want to use multiple exceptions with "throws" type "throws" once then put the names of exception
	    classes. But for "throw" you have to type "throw" for every exception again and again 
	 4) "throw" keyword is used for exceptions which we decide they are exceptions.      
	*/


}
