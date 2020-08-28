package day17foreachloopnt;

import java.util.ArrayList;
import java.util.List;

public class Test08 {

	public static void main(String[] args) {
		int arr[] = {3, 4, 5, 6};
		List<Integer> list1 = new ArrayList<>();
		for(int w : arr) {
			list1.add(w);
		}
		System.out.println(list1.get(2));
	}

}
