package day22overridingnt;

public class Test extends Derived {
	
	public void getDetails() {
		System.out.println("Test Class ");
		super.getDetails();
	}

	public static void main(String[] args) {
		//For obj1 the output will be "Test Class" and "Derived Class" because
		//Java selects the methods according to the constructors. In the following example
		//the constructor is from Test class so obj1.getDetails() will get from Test class
		Derived obj1 = new Test();
		obj1.getDetails();
		
		//For obj2 the output will be "Derived Class" because Java will select the getDetails()
		//according to the construdtor. The constructor is from Derived Class so Java will use 
		//getDetails() method from Derived Class not from Test Class.
		Derived obj2 = new Derived();
		obj2.getDetails();
	}

}
