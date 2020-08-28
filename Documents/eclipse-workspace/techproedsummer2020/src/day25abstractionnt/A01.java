package day25abstractionnt;

public abstract class A01 {
	
	/*
	 1)To create an abstract class type "abstract" between "access modifier" and "class" keyword.
	 2)If a class is abstract it means you cannot create an object by using abstract class.
	 3)Why do we need abstract classes?
	   Abstract classes are used as a "to-do" list.
	 4)Inside the abstract classes we have two types of methods a)Concrete Methods (Methods with body)
	                                                            b)Abstract Methods (Methods without body)
	 5)Abstract classes can have "concrete" and "abstract" methods but concrete classes can have just 
	   concrete methods. If you create abstract methods inside a concrete class you will get CTE.                                                          
	*/

	public static void main(String[] args) {
		
	}
	
	//Concrete method
	public void add() {
		System.out.println("Addition");
	}
	
	//Abstract method ==> a)Do not put body if you put body for abstract method you CTE
	//                    b)To make a method abstract you have to type "abstract" keyword.
	public abstract void run();
	
	
	
	
	
	
	
	
	
	
	
	
	

}
