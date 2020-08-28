package day17foreachloopnt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test09 {

	public static void main(String[] args) {
		String arr[] = {"Java", "Python", "Ruby"};
		List<String> list1 = new ArrayList<>();
		for(String w : arr) {
			list1.add(w);
		}
		System.out.println(list1);
		
		List<String> list2 = Arrays.asList(arr);
		System.out.println(list2);

	}

}
