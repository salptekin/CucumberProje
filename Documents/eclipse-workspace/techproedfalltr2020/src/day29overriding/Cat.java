package day29overriding;

public class Cat extends Animal {

	@Override //Annotation
	public void ses() {
		System.out.println("Kediler miyavlar");
	}

	@Override
	protected int add() {
		return 1+2;
	}

	@Override
	public Integer multiply() {
		return 1*2;
	}

	@Override
	public Cat create() {
        return new Cat();
	}

	
	
}
