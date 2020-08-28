package day17staticblock;

public class Test02 {
	static int i;
	static {
		i = 5;
	}
	static {
		i = i*2;
	}
	public static void main(String[] args) {
		System.out.println("i value is " + i);
	}
}
