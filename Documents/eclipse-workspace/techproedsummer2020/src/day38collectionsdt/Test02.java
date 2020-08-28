package day38collectionsdt;

import java.util.LinkedList;

public class Test02 {
	public static void main(String[] args) {
		LinkedList<String> sll = new LinkedList<>();
		sll.add("B");
		sll.add("A");
		sll.addFirst("B");
		sll.addFirst("C");
		sll.add("B");
		System.out.println(sll.getLast() + sll.getFirst() + sll.get(2));
	}
}
