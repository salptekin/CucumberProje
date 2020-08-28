package day29overridingdt;

public class Test {
	int a = 11;
	public Test() {
		m();
	}
	void m() {
		System.out.print(a);
	}
}

class Sub extends Test {
	int b = 12;
	void m() {
		System.out.print(b);//y0 because before object is created
		                    // b is used so the value of b is 0
	}
	public static void main(String[] args) {
		Sub mySub = new Sub();
	}
}
