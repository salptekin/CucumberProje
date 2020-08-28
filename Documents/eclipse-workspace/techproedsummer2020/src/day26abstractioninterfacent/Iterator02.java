package day26abstractioninterfacent;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Xmnopr");
		list.add("Ymnopr");
		list.add("Zmnopr");
		
		for(String w : list) {
			w = w + "!";
		}
		System.out.println(list);
		
		ListIterator<String> it = list.listIterator();		
		while(it.hasNext()) {	
			String el = it.next();
			it.set(el.replace(el.substring(el.length()-3), "***"));			
		}
		System.out.println(list);
	}
}
