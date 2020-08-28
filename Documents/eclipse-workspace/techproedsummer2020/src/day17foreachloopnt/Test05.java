package day17foreachloopnt;

public class Test05 {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2 }, { 3 }, { 4, 5, 6 } };
		for (int[] w : arr) {
			for (int z : w) {
				System.out.print(z + " ");
			}
		}
		
	}
}
