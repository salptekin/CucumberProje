package day26abstractioninterfacent;

public interface I01 {
	
	public int a = 12;//If you want remove public Java will accept it as public.
	// protected int b = 13; ==> protected access modifier is not allowed to use in interface
	int c = 14; //This is actually public
	// private int d = 15; ==> private access modifier is not allowed to use in interface
	int d = 15;
	
	public static final char ch1 = 'a';
	public final char ch2 = 'b';
	public static char ch3 = 'c';
	char ch4 = 'd';
	int myMethod();

	/*
	 1) As you see when you create an "interface" Java removed "class" keyword because
	    interface is not a class. Interface is an interface.
	 2) There are 2 types abstraction a)Partial abstraction (In abstract classes we can use
	                                    abstract and concrete methods together) 
	                                  b)Full abstraction (In interface you can use just
	                                    abstract methods, you cannot use concrete methods
	                                    because of that interface is called full abstraction)  
	 3) When you create a variable in an interface the variable will be "public", "static", 
	 and "final" automatically. "public int a = 12;" and "int a = 12;" are completely same
	 for interfaces.  
	 4) When you create a variable in an interface the variable will be "final" automatically.
	 It means you cannot change its value after initializing.  
	 5) When you create a variable in an interface the variable will be "static" automatically. 
	 It means the variable will be shared by all objects form the child classes.
	 6) Do not forget to initialize variables in an interface because the variables in an interface 
	 are final and final variables must be initialized.               
	 */
}
