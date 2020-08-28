package day34abstractclassdt;

public abstract class School {
	
	/*
	 1)Abstract classes need child classes to be meaningful, if you make
	 an abstract class final it means it cannot have child classes this
	 is contradiction because of that Java complains about being final for
	 an abstract class. In conclusion; abstract classes cannot be final.
	 2)An abstract method cannot be final because final methods cannot be 
	 overridden but the reason to create abstract methods is 
	 to make mandatory overriding
	 3)An abstract method's access modifier can be public or protected
	 do not use private because private methods cannot be accessed from other classes.
	 If you use default be careful about the package
	 */

	public static void main(String[] args) {

	}
}
