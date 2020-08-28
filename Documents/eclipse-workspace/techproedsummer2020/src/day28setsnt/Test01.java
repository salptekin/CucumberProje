package day28setsnt;

import java.util.LinkedList;
import java.util.Queue;

public class Test01 {
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(3);
		queue.add(5);
		queue.add(7);
		queue.add(9);
		queue.add(11);
		queue.add(13);

		int count = 0;
		while (queue.isEmpty() == false) {
			queue.remove();
			count++;
			if(count == 3) {
				break;
			}
		}
		System.out.println(queue);
	}
}
