package questions;

abstract class Q29 {

   protected void m1() {
	   System.out.println("Method 1");
   }
   
   abstract int m2();

}

class C29 extends Q29{

	//What can be the access modifier of m2()?
	//What can be the return type of m2()?
	int m2() {
		System.out.println("Method 2");
		return 3;
	}
	
	//What can be the access modifier of m1()?
	//What can be the return type of m1()?
	protected void m1() {
		   System.out.println("Method 1 is overridden");
	}
	
}
