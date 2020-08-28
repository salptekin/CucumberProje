package day22overridingnt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions01 {

	public static void main(String[] args) throws IOException {
		
		//FileInputStream class is used to get data from a file
		
		/*
		 1)When you type a code Java checks all possible problems(Exceptions) and asks you to
		   tell something about what to do if the exceptions occur. Go over the red underline wait for a
		   second and select "Add throws declaration" option it will fix your problem
		 2)If you have more than one red underline in your code, Java selects the exception which handles 
		   all but if there is no any exception which handle all then Java selects more than 1 exceptions. 
		 */
		FileInputStream fis = new FileInputStream("src/day22overridingnt/TextFile01");
		
		int i;
		
		while((i = fis.read()) != -1) {
			
			System.out.println((char)i);
			
		}
		
		fis.close();

	}

}
