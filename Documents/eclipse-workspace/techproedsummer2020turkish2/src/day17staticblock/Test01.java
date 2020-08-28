package day17staticblock;

public class Test01 {
	static int a = 20;
	static int b = 20;
	public static void main(String[] args) {
		Test01.getData();
		Test01.display();
	}
	static void getData() {
		System.out.println("a = " + a);
	}
	static void display() {
		System.out.println("b = " + b);
	}
	static {
		System.out.println("Java");
		a = 3 * b;
	}
}
