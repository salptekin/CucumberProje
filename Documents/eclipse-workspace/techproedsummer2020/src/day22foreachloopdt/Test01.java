package day22foreachloopdt;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(21);
		list.add(22);
		list.add(23);
		
		int a = 0; 
		for(int w : list) {
				System.out.print(w + " ");
				a++;
				if(a==2) {
					break;
				}
		}
		
		System.out.println();
		
		int b = 0; 
		for(int w : list) {
				b++;
				if(b==2) {
					continue;
				}
				System.out.print(w + " ");
		}
		
		System.out.println();
		
		int c=0;
		for(int w : list) {
			c++;
			if(c<3) {
				System.out.print(w + " ");	
			}	
		}

	}

}
