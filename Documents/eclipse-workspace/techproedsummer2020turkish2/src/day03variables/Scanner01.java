package day03variables;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Tam isminizi giriniz");
		
        //Kullanicidan String almak icin next() veya nextLine() method'lari kullanilir.
		//next() kullanirsaniz kullanicinin girdigi sadece ilk kelimeyi alabilirsiniz.
		//nextLine() kullanirsaniz kullanicinin girdigi herseyi alirsiniz
		String tamIsim = scan.nextLine();
		System.out.println(tamIsim);
		
		scan.close();

	}

}
