package day30exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03 {

	public static void main(String[] args) {
			
		FileInputStream fis = null;
				
		try {
			//Dosyaya ulasin
			fis = new FileInputStream("src/day30exceptions/TextFileTr");
			
			//Dosyayi okuyun
			int k;
			while((k=fis.read()) != -1) {
				System.out.print((char)k);
			}			
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Ya path yanlis veya dosya silinmis");
			
		} catch(IOException e) {

			System.out.println("Dosya okurken problem olustu");
			
		} finally {
			try {
				fis.close();
				System.out.println("Kapandi");
			} catch (IOException e) {
				System.out.println("Kapanmadi");
			}
		}

	}

}
