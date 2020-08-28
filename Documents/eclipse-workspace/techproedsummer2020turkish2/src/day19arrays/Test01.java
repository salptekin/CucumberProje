package day19arrays;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		String str = "Cok calis, mutevazi ol"; 
		String strArray[] = str.split("X");
		System.out.println(Arrays.toString(strArray));
	}
}
