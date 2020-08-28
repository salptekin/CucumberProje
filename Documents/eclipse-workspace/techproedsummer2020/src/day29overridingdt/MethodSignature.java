package day29overridingdt;

public class MethodSignature {

	public static void main(String[] args) {

	}
	/*
	 Method Signature contains just method name and parameters.
	 Access modifiers, return type, method body or other keywords are not in Method Signature
	*/
	public void add() {
		System.out.println("Addition");
	}
	
    public int add(int i) {
    	System.out.println("Addition");
    	return 5;
	}
    
    private int add(String str) {
    	System.out.println("Addition");
    	return 5;
	}

}
