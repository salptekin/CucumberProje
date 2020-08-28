package day17foreachloopnt;

public class Test03 {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9 };
		for (int w : arr) {
			System.out.print(w + " ");
			if(w>4) {
				break;
			}
		}
		
	}
}
