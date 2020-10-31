package day18staticblockarrays;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		String s = "I like Java but I need to study hard";
		
		String ch[] = s.split("");
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		
		int counter = 0;
		
		for(int i = 1; i<ch.length; i++) {
			if(ch[i-1].equals(ch[i])) {
				counter++;
			}else {
				System.out.println("The number of " + ch[i-1] + ": " + (counter + 1));
				if(i==ch.length-1) {
					System.out.println("The number of " + ch[i] + ": " + (counter + 1));
				}
				counter = 0;
			}
		}

	}

}
