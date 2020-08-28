package day14statickeywordarraysnt;

public class StaticDemo {
	int num1 = 5;
	static int num2 = 7;

	public static void main(String args[]) {
		StaticDemo s1 = new StaticDemo();
		StaticDemo s2 = new StaticDemo();
		s1.num1 = 13;
		s1.num2 = 23;
		s2.num1 = 33;
		s2.num2 = 43;
		System.out.println(s1.num1 + " " + s1.num2 + " " + s2.num1 + " " + s2.num2);

	}
}
