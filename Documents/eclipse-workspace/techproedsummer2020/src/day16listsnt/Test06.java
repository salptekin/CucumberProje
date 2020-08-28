package day16listsnt;

import java.util.ArrayList;

public class Test06 {

		public static void main(String[] args) {
			ArrayList<Character> list = new ArrayList<Character>();

			for (char i = 'a'; i <= 'e' ; i++) { 
				list.clear();
	            list.add(i);
	        } 
			
			System.out.println(list);
		}

}
