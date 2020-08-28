package day23exceptionsnt;

import java.io.FileInputStream;
import java.io.IOException;

public class E01 {
	
	/*
	 FileNotFoundException and IOException are "checked exception"s.
	 Checked exception means you are getting red underline about exceptions while you type code.
	 Checked exceptions must be handled while we type code otherwise our code does not run.
	 There are 2 ways to handle a checked exception 1) Using "throws" keyword
	                                                   "throws" keyword is used after method parentheses.
	                                                   After "throws" keyword you can use multiple exceptions
	                                                   by putting comma between them
	                                                2) Using try-catch block. This is better because
	                                                   when you use "throws" keyword you are getting very 
	                                                   technical messages on the console.But by using try-catch
	                                                   you can create your own error messages.   
	 */

	public static void main(String[] args) throws IOException {

		FileInputStream f = new FileInputStream("src/day23exceptionsnt/TextFile01");

		int i = 0;

		while ((i = f.read()) != -1) {
			System.out.print((char) i);
		}

		f.close();

	}

}
