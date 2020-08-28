package day28setsnt;

import java.util.LinkedList;
import java.util.List;

public class Test03 {
	public static void main(String[] args) 
    { 
        List<String> list1 = new LinkedList<>(); 
        list1.add("A"); 
        list1.add("B"); 
        list1.add("C"); 
        list1.add("D"); 
        list1.add("E"); 
  
        List<String> list2 = new LinkedList<>(); 
        list2.add("B"); 
        list2.add("D");
        list2.add("F");
  
        list1.removeAll(list2); 
  
        for (String temp : list1) 
            System.out.printf(temp + " "); 
  
        System.out.println(); 
    } 
}
