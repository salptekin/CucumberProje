package day28setsnt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test06 {

	public static void main(String[] args) {
		List<String> m = new ArrayList<>();
		m.add("B");
		m.add("C");
		m.add("A");
		Collections.reverse(m);
		for(int i = 0; i<m.size(); i++) {
			System.out.print(m.get(i) + " ");
		}
	}

}
