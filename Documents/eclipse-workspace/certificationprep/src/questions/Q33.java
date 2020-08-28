package questions;

interface I33 {
	
	public void m1();
	public void m2();
	
}

abstract class A33 implements I33 {
	
	public void m2() {
		System.out.println("Good");
	}
	
}

//Why is it complaining when I uncomment?

//public class Q33 extends A33 {
//
//	public void m2() {
//		System.out.println("Bad");		
//	}
//
//}
