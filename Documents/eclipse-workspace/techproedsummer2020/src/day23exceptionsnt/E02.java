package day23exceptionsnt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
	
	/*
	 The benefits of using try-catch 1) You can produce understandable messages by non-technical people
	                                 2) You can create unique messages for every exception
	 Note: You can use multiple catch blocks for single try block. 
	       But if there is parent-child relationship between the exceptions, child exception
	       must be the first otherwise you get Compile Time Error. Because using child exception after
	       parent is not meaningful, child exception cannot catch anything after the parent.
	 Note: If there is no any parent-child relationship between exceptions the order is not important   
	 Note: After try block definitely you have to use at least on catch block                                  
	*/

	public static void main(String[] args) {		
		try {			
		   FileInputStream f = new FileInputStream("src/day23exceptionsnt/TextFile01");		   
		   int i = 0;
			while ((i = f.read()) != -1) {
				System.out.print((char) i);	
			}
			f.close();	   
		} catch(FileNotFoundException e) {		
			System.out.println("Most probably path is wrong or someone deleted my file");		
		} catch(IOException e) {		
			System.out.println("Text could not be read or the file could not be closed");		
		} finally {
			System.out.println("Do not forget to close the file!");
		}
	}
}
