package day33exceptionsdt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
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
