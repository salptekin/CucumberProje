package day30polymorphismdt;

public class Question {
	
	public Integer add() {
		return 12;
	}

}

class Number extends Question{
	/*
	 When you use wrapper classes as return type in overriding
	 return types must be same otherwise you will get compile time error.
	 We need IS-A relationship between the return types in overriding but
	 for wrapper classes Java did not create parent-child relationship because of that 
	 you cannot use different wrapper classes for return types in overriding
	 */
	public Integer add() {
		return 1;
	}
	
}
