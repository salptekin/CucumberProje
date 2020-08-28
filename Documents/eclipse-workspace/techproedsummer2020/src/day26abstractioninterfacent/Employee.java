package day26abstractioninterfacent;

public interface Employee {
	
	void salary();
	void task();
	void applicationForm();
	
	/*
	 1) If you need a concrete method in an interface use "default" keyword before 
	    return type then create method with body.
	 2) If you use default keyword before return type you have to create method body
	    otherwise Java will complain.    
	 */
	default void sickDays() {
		System.out.println("8 days in a year");
	}
	
	/*
	 1) If you need a concrete method in an interface use "static" keyword before 
	    return type then create method with body.
	 2) If you use "static" keyword before return type you have to create method body
	    otherwise Java will complain.    
	 */	
	static void training() {
		System.out.println("Trained well");
	}

}
