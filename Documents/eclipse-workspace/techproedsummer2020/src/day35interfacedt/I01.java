package day35interfacedt;

public interface I01 {
	/*
	 1)In interfaces all variables are public, static, and final
	    a)So no variables can be updated in interfaces
	    b)If you do not initialize(Assigning first value) a variable, you
	      will get compile time error.
	    c)It is common variable for all child class objects. 
	 */
	
	int x = 12;
	
	/*
	 1)Interface is NOT a class, interface is interface.
	 2)There are 2 type of abstraction a) Partial Abstraction 
	                                      If you create an abstract class, some methods are
	                                      abstract, some are concrete. As you see, all methods
	                                      are not abstract because of that we name using
	                                      abstract classes "partial abstraction" 
	                                   b) Full Abstraction
	                                      In full abstraction, all methods must be abstract.
	                                      If you use "interface", it is must to make all methods 
	                                      abstract inside an interface. Because of that
	                                      using "interfaces" is named as "Full Abstraction"
	 3)In interfaces all methods are "abstract" automatically, because of that
	 when you create a method no need to type "abstract" 
	 4)In interfaces all methods are "public" even you type or not 
	 5)You cannot create object by using interfaces.
	 6)All methods are abstract in interfaces, and we know abstract methods must be
	   overridden  by concrete child classes. So all methods in interfaces must be 
	   overridden by concrete child classes.                                  
	 */
	
	void add1();
	public void add2();
	public abstract void add3();
	abstract void add4();

}

