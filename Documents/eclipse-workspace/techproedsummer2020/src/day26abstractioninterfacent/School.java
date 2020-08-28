package day26abstractioninterfacent;

public abstract class School {
	
	/*
	 All access modifiers can be used for variables in an abstract class.
	 */
	private int a = 12;
	int b = 13;
	protected int c = 14;
	public int d = 15;
	
	/*
	 Initializing is optional in abstract class.
	 */
	private int e;
	int f;
	protected int g;
	public int h;
	
	/*
	 Using private, final and static is allowed for variables
	 */
	public final int i = 13;
	public static int j = 13;
	
	/*
	 We cannot create an object from an abstract class. 
	 The main reason to create an abstract class is to make it parent class.
	 If you make an abstract class "final" it means you cannot extend to it, that is 
	 it cannot be parent. This is contradiction. Because of that Java does not let you to make 
	 an abstract class final.
	*/

	public static void main(String[] args) {

	}
	
	/*
	 final methods cannot be overridden but abstract methods must be overridden by concrete
	 child classes. This is contradiction because of that Java does not let you to make an
	 abstract method final.
	*/
	public abstract void learn();
	
	
	/*
	 private methods cannot be overridden but abstract methods must be overridden by concrete
	 child classes. This is contradiction because of that Java does not let you to make an
	 abstract method private. "private" abstract void teach(); is not allowed.
	*/
	
	
	/*
	 static methods cannot be overridden but abstract methods must be overridden by concrete
	 child classes. This is contradiction because of that Java does not let you to make an
	 abstract method static. public "static" abstract void teach(); is not allowed.
	*/
	
	/*
	 When do you need abstraction?
	 1)If you want to focus on "what to do" instead of "How to do".
	 2)If you want to hide "How to do" use abstraction.
	 3)If you want to make sth mandatory to use for child classes make them abstract
	 4)If you have similar child classes which must have similar methods in different
	 implementation use abstraction.
	 5)If you do not want "final", "private" and "static" things in your project 
	 you can use abstraction as well because abstraction does not use 
	 "final", "private" and "static" things
	*/

}
