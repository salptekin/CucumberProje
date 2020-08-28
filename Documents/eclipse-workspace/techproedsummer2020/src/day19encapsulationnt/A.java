package day19encapsulationnt;

public class A {
	
	private String name = "Ali";
	private int age = 32;
	private boolean student = true;

	public static void main(String[] args) {
		/*
		 1) Create class A
         2) Create class B
         3) Create a String, an int, and a boolean variable inside the class A 
         and encapsulate them all
         4) Make String variable just readable
         5) Make int variable just updatable 
         6) Make Boolean variable both readable and updatable
		*/

	}

	//If the data type of variable is boolean get method starts with "is" instead of "get"
	public boolean isStudent() {
		return student;
	}

	public void setStudent(boolean student) {
		this.student = student;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
