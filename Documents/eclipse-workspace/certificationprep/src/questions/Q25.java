package questions;

import java.util.ArrayList;
import java.util.List;

public class Q25 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add(null);
		
		list.add("A");
		
		list.add("B");
		
		list.add("C");
		
		list.add(null);	
		
		if(list.remove("B")) {
			list.remove(null);
		}
		
		System.out.println(list);//?
	}
}
