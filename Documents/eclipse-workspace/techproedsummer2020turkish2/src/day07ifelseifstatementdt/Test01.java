package day07ifelseifstatementdt;

public class Test01 {

	public static void main(String[] args) {
		int a = 4;
		int b = 4;
		int c = 4;
		if (a < b && c < b) {
			System.out.print("x");
		} else if (a < b || c < b) {
			System.out.print("y");
		} else {
			System.out.print("z");
		}
	}
}
