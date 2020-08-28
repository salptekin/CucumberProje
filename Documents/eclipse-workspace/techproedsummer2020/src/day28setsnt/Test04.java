package day28setsnt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test04 {
	public static void main(String[] args) {
       List<String> l = new ArrayList<>();
       l.add("John");
       l.add("Mark");
       l.add("Leo");
       System.out.println(l);
       
       Queue<String> q = new PriorityQueue<>();
       q.add("Teddy");
       q.add("Mark");
       q.add("Leo");
       q.remove();
       System.out.println(q);
       
	}
}
