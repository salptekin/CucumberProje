package day17foreachloopnt;

import java.util.ArrayList;
import java.util.List;

public class Test07 {
	
	public static void main(String[] args) {	
		List<Integer> list1 = new ArrayList<>();
		list1.add(21);
		list1.add(22);
		list1.add(23);
		list1.add(24);
		for (int w : list1) {
			System.out.print(w + " ");
			if (w % 2 == 0) {
				continue;
			}
		}
	}
}
