package day10stringmethods;

import java.util.Scanner;

public class StringMethods02 {

	public static void main(String[] args) {
		//9. Method equals()
        String a = "Java";
        String b = "Java";
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Java gir");
        String c = scan.next();
        
        System.out.println(a==b);//true
        System.out.println(a.equals(b));//true
        
        System.out.println(a==c);//false
        System.out.println(a.equals(c));//true
        
        scan.close();
        
        //10. Method equalsIgnoreCase()
        String d = "suleyman";
        String e = "SULEYMAN";
        String f = "Suleyman";
        System.out.println(d.equalsIgnoreCase(e));//true
        System.out.println(e.equalsIgnoreCase(f));//true
  
	}

}
