package day30polymorphismdt;

public class Test05 {
	int x = 11;

	public void go() {
		System.out.println("Good");
	}
}

class Test extends Test05 {
	int x = 12;
	public void go() {
		System.out.println("Bad");
	}
	public static void main(String args[]) {
		Test05 obj = new Test();
		obj.go();
		System.out.println(obj.x);
	}
}
