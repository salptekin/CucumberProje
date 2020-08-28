package day19staticblockarraysdt;

public class StaticBlock {
	
	static int i;
	static double pi;

	static {
		pi = 3.14;
		System.out.println("2nd static block");
	}
	
	static {
		i = 12;
		System.out.println("1st static block");
	}
	
	StaticBlock(){
		System.out.println("I am a constructor");
	}
	
	public static void main(String[] args) {
	/*
	 1)Static block is a code block
	 2)We use Static Blocks to initialize(Assigning first value) static variables
	 3)Static Blocks are executed before all methods, before main method,
	   before all constructors
	 4)If you have more than one static blocks, Java runs the above one first  
	*/
		System.out.println("I am main method");
		
		StaticBlock obj1 = new StaticBlock();

	}

}
