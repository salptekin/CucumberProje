package day26abstractioninterfacent;

public abstract class ItDepartment implements Employee {
	
	/*
	 When you are in an abstract class if you do not override abstract methods from an interface
	 it is fine. You will not get compile time error but when you are in a concrete class you
	 have to override otherwise you will get compile time error
	*/

	public static void main(String[] args) {

	}

	@Override
	public void salary() {
		System.out.println("60 dollars hourly");		
	}

	@Override
	public void task() {
		System.out.println("Automation tester");		
	}

	@Override
	public abstract void applicationForm();

}
