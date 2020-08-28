package questions;

import java.util.Arrays;
import java.util.List;

public class Q23 {

	public static void main(String[] args) {
		
		String s[] = {"Good", "Bad", "Ugly", "Normal"};
		List<String> sl = Arrays.asList(s);
		
		System.out.println(sl.stream()
			                 .anyMatch(t->t.length()==5));//?
		
		System.out.println(sl.stream()
                             .noneMatch(t->t.length()==5));//?
		
		System.out.println(sl.stream()
                             .allMatch(t->t.length()==3));//?
		
		System.out.println(sl.stream()
                             .reduce("", (t, u)->t + u));//?
	}

}
