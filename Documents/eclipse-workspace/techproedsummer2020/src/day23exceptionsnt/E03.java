package day23exceptionsnt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03 {

	public static void main(String[] args) throws IOException {
		
		/*
		 If there is no any parent-child relationship between the exceptions you can put them 
		 any order. In the following example FileNotFoundException is the first ArithmeticException is 
		 the second, but if you want you can switch.
		 
		 Note: When Java finds an exception stops execution and puts the message on the console. Because of
		 that from try-catch block you can get just one error message. I mean when you have multiple catch
		 blocks just one of them runs.
		 
		 Note: After catch blocks, at the end sometimes we use finally block, it runs under every condition.
		       If your code creates exception finally block runs, if your code is okay finally block runs.
		       
		 Note: Most of the time, we use finally block to close files which are in cloud memory. Because 
		       if you do not close a file in the cloud memory it will charge constantly.      
		*/
		
		FileInputStream f = null;
		try {			
			f = new FileInputStream("src/day23exceptionsnt/TextFile01");			
			int num = 12/2;//In math a number cannot be divided by zero
			               //If you are sure about the problem but you are not getting red underline
			               //it means it is "unchecked exception"
			               //In Java, the problems about the mathematical operations is caught by 
			               //"ArithmeticException" class
		} catch (FileNotFoundException e) {		
			System.out.println("Path is wrong or file is deleted");	
		} catch(ArithmeticException e) {		
			System.out.println("A number cannot be divided by zero");	
		} finally {
			f.close();
		}
	}
}
