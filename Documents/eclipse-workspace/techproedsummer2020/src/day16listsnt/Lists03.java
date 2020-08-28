package day16listsnt;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {

	public static void main(String[] args) {
		
        List<String> l1 = new ArrayList<>();
        l1.add("Red");
        l1.add("Pink");
        l1.add("Blue");
        System.out.println(l1);//[Red, Pink,Blue]
        
        System.out.println(l1.remove("Pink"));
        //boolean, if the element is exist Java will remove it and return true, it 
        //means operation is completed
        System.out.println(l1);//[Red, Blue]
        
        System.out.println(l1.remove("Black"));
        //If the element is not exist Java cannot remove it and return false, it means
        //operation is failed
        System.out.println(l1);//[Red, Blue]
        
        //How to update an element
        System.out.println(l1.set(1, "Black"));
        //set() returns the deleted data for that example you will get Blue
        System.out.println(l1);//[Red, Black]
        
        //Note: Do not try to use set() to add new data to a list
        
        //How to delete all elements
        l1.clear();//clear() returns void
        System.out.println(l1);//[]

	}

}
