package questions;

import java.util.ArrayList;
import java.util.List;

public class Q24 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(null);
		
		list.add(3);
		
		list.add(2);
		
		list.add(1);
		
		list.add(null);	
		
		list.remove(1);
		
		list.remove(null);
		
		System.out.println(list);//?
	}
}
