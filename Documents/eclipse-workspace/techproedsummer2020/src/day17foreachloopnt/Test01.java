package day17foreachloopnt;

public class Test01 {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5 };
		int x = 0;
		for (int w : arr) {
			x = x + w * w;
		}
		System.out.print(x);
	}

}
