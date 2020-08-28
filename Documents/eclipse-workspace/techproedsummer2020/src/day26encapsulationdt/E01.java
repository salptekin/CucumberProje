package day26encapsulationdt;

public class E01 {
	
	private int ssn = 123456789;
	private String name = "Suleyman Alptekin";
	private int salary = 80000;
	boolean retired = false;

	public static void main(String[] args) {
		/*
		 What is "encapsulation"?
		 Encapsulation is "data hiding"
		 
		 How do you do "encapsulation"?
		 I make the access modifiers "private"
		*/

	}
	/*
	 1)After hiding a data, if you want to read the value of the data from 
	   other classes you should create "getter methods"
	 2)We use getter methods to read the values of encapsulated data from other
	   classes 
	 3)When you create getter method a)Make the access modifier public (sometimes protected)
	                                 b)Make the return type same with the data type of
	                                   variable
	                                 c)The name of the getter method will start with "get"
	                                 then type the name of the variable, apply camel case      
	*/
	public String getName() {
		return name;
	}
	
	public int getSsn() {
		return ssn;
	}
	
	/*
	 1) To update encapsulated(hidden) data we have to create setter methods
	 2) Make the access modifier public(sometimes protected), make the return type
	    "void", make the data type of parameter same with the data type of the variable
	    and the name of the parameter will be same with the name of the variable
	 3) Inside the method body type something like "this.salary = salary;" 
	 4) After using setter method if you want to read the updated data you have to create
	    and use getter method    
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}

}
