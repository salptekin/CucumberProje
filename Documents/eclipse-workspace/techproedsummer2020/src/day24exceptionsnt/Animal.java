package day24exceptionsnt;

public class Animal {

	public static void main(String[] args) {
		
		int i = 12;//you can update 12
		i = i + 2;
		System.out.println(i);//14
		
		final double pi = 3.14;//no update for pi because I made it final

	}
	
	public void add() {
		System.out.println("Addition");
	}
	
	public final void product() {
		System.out.println("Multiplication");
	}
	
	
	/*
	 What are final, finally, and finalize()?
	 1) final is keyword, finally is code block, finalize() is method.
	 ==> final: final keyword can be used for "variables", "methods" and "classes"
	            ==> final variables: If a variable is declared as final, it means you cannot update its value.
	            ==> final methods: If a method is final, it means you cannot override it.
	            ==> final classes: If a class is final, it means the class cannot have a child.
	 ==> finally: finally block is used after try-catch block. It runs every time, I mean if there is exception
	              finally block runs, if there is no exception finally block runs.To close files after using
	              finally block is good. 
	 ==> finalize(): finalize is a method, it is called before Garbage Collector destroys the objects.                          
	*/

}
