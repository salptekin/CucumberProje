package day39collectionsdt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test01 {
	public static void main(String[] args) {
	    String sentence = "onessfivejjthreekktehrekkonwstwo";
	    Map<String, Integer> map = new HashMap<>();
	    map.put("zero", 1);
	    map.put("one", 1);
	    map.put("two", 2);
	    map.put("three", 3);
	    map.put("four", 4);
	    map.put("five", 5);
	    map.put("six", 6);
	    map.put("seven", 7);
	    map.put("eight", 8);
	    map.put("nine", 9);
	    Set<String> keySet = map.keySet();
	    List<Integer> list=new ArrayList<>();
	    Iterator iterator=keySet.iterator();
	    while (iterator.hasNext()) {
	        String number = iterator.next().toString();
	        while (sentence.contains(number)) {
	            System.out.println(number);
	            sentence=sentence.replaceFirst(number, "");
	            list.add(map.get(number));
	        }
	    }
	    Collections.sort(list);
	    list.stream().forEach(System.out::print);
	}
}
