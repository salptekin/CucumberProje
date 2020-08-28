package day27inheritancedt;

public class Mammal extends Animal {
	
	//smell variable has default access modifier
	//because of that you cannot inherit other packages
	//In day26 packages we created Rabbit class but we
	//could not inherit smell variable

	String smell = "They smell well";
	static boolean die = true;

	public static void main(String[] args) {

	}
	
	/*
	 public and protected variables or methods can be
	 inherited without any issue.
	*/
	
	/*
	 Child class = sub class <==> Parent class = super class
	*/
	
	/*
	 Static variables and methods cannot be inherited
	 */
	
	public void feed() {
		System.out.println("They feed their babies");
	}

}
