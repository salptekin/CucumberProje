package day29overriding;

public class Animal {

	public void ses() {
		System.out.println("Kediler miyavlar");
	}
	
	protected int add() {
		return 3+4; 
	}
	
	public Integer multiply() {
		return 3*4;
	}
	
	public Animal create() {
		return new Animal();
	}
	
}
