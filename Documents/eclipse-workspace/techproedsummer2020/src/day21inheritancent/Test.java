package day21inheritancent;

public class Test {

	public static void main(String[] args) {
		int i = 0;
		int x = 5;
		x = i++;
		System.out.println(i + "," + x);
		x = ++i;
		System.out.println(i + "," + x);
	}

}
