package day30polymorphismdt;

public class Test03 {
	public static void main(String[] args) {
		int x = add(2, 8);
		double y = add(3, 4.5);
		double z = add(x, y, 20);

		System.out.println(z);
	}
	static int add(int i, int j){
		return i + j;
	}
	static double add(double i, double j){
		return i + j;
	}
	static double add(int i, double j, int k) {
		return i + j + k;
	}
}
