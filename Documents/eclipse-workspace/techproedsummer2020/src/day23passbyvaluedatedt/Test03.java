package day23passbyvaluedatedt;

public class Test03 {

	public static void main(String[] args) {
		String str = "Ayhan BEYHAN";
		System.out.println(str.replace(str.substring(0), "AYHAN beyhan"));
		
		int a[] = {1, 2};
		int b[] = {3, 2, 1};
		
		for(int w : a) {
			for(int m : b) {
				System.out.print(w + m + " ");
			}
		}

	}

}
