package questions;

import java.util.Arrays;

public class Q10 {

	public static void main(String[] args) {
		
		String c[] = {"A", "B", "C", "D"};
		int idx = 0;
		
		for(String w : c) {
			c[idx] += w;			
			idx++;
		}
		
		System.out.print(Arrays.toString(c) + " ");
		
		System.out.println(idx);

	}

}
