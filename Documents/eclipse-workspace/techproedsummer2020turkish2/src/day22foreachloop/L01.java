package day22foreachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L01 {

	public static void main(String[] args) {
		
		String s[] = {"A", "B", "C"};
		
		List<String> sl = new ArrayList<>();
		
		//Bir array'i nasil list'e cevirebiliriz?
        sl = Arrays.asList(s); 
        System.out.println(sl);//[A, B, C]
        
        //Bir list nasil array'e cevrilir?
        /*
         Java'da her class'in en az 1 tane parent'i vardir.
         Parent'i olmayan tek class Object class'dir.
         Object class tum class'larin ortak babasidir.
        */       
        Object[] listtenArray = sl.toArray();

	}
}
