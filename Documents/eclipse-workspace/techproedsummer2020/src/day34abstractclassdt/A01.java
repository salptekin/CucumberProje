package day34abstractclassdt;

public abstract class A01 {
	
	/*
	 1) To make a class abstract type "abstract" keyword between "access modifier" and
	    "class" keyword.
	 2) You cannot create an object from abstract classes.
	 3) We use abstract classes as mandatory or optional "to-do" list for child classes 
	    "abstract methods" are mandatory, "concrete methods" are optional.
	 4) Abstract classes can have "abstract methods" and "non-abstract(concrete) methods" 
	    "abstract methods" ==> methods without body 
	    "non-abstract(concrete) methods" ==> methods with body
	 5) To create an abstract method a)Do not put method body
	                                 b)Use abstract keyword between access modifier and 
	                                   return type  
	                                 Note: Do not use "abstract" and "method body" together. 
	 6) Abstract methods must be overridden by concrete child classes otherwise 
	    you get compile time error  
	 7) If you create "abstract methods" it means you are
	    focusing on "what to do" instead of "how to do"
	    But concrete methods focus on "how to do" more than 
	    "what to do" . 
	 8) Abstract methods hide the body, I mean implementation
	    of the method. 
	 9) When you override an abstract method you have to 
	    create body otherwise Java complains. 
	 10)Abstract methods can be just in abstract classes
	    You cannot create abstract methods inside the concrete classes                                        
	 */

	public static void main(String[] args) {

	}
	
	public abstract void add(); //Abstract method
 
}
