package day38collectionsdt;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test03 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("D");
		list.add("B");
		ListIterator<String> lit = list.listIterator();
		while(lit.hasNext()) {
			lit.next();
		}
		while(lit.hasPrevious()) {						
			System.out.print(lit.previous() + " ");
		}
	}
}
