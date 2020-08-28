package day35interfacedt;

public class Test {
	public static void main(String[] args) {
		/*
		 * Aşağıdaki multi dimensional array’lerin iç array’lerinde aynı index’e sahip
		 * elemanların toplamını ekrana yazdıran bir program yazınız. (Zor soru) arr1 =
		 * { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
		 */

		int arr[][] = { { 1, 2 }, { 3, 4, 5 }, { 6 } };
		int arr1[][] = { { 7, 8, 9 }, { 10, 11 }, { 12 } };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int i1 = 0; i1 < arr1.length; i1++) {
					for (int j1 = 0; j1 < arr1[i1].length; j1++) {
						if (i == i1 && j == j1) {
							sum = sum + arr[i][j] + arr1[i1][j1];
						}
					}
				}
			}
		}
		System.out.println(sum);
	}

}
