package day32exceptionsdt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

	/*
	 * To handle a Compile Time Exception you have 2 options 
	 * a) You can use "throws" keyword between ")" and "{" 
	 * b) You can use "try-catch" block. This is better to use
	 */
	
	/*
	 If you use more than 1 catch block and if there is parent-child relationship between
	 exception classes you have to use child exception class first. Otherwise, you will get 
	 Compile Time Error.
	 */
	
	/*
	 finally block runs under every condition. If there is exception finally block runs,
	 if there is no exception finally block runs.
	*/

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;		
		try {
			fis = new FileInputStream("src/day31exceptionsdt/TextFile");
			
			int i = 0;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			System.out.println(5/2);
					
		} catch (FileNotFoundException e) {
			System.out.println("The path is wrong or the file is not accessible");
		} catch(IOException e) {
			System.out.println("The file is not okay to read or close");
		} catch(ArithmeticException e) {
			System.out.println("Do not divide by 0");
		} finally {
			fis.close();
			System.out.println("Done!");
		}
	}
}
