package questions;

import java.util.HashMap;
import java.util.Map;

public class Q50 {
	public static void main(String args[]){

        Map<String, Object> obj = new HashMap<>();
        obj.put("A", new Integer(1));
        obj.put("B", new Integer(2));
        obj.put("C", new Integer(3));
        
        obj.replace("B", 5);
        System.out.println(obj);//?
        
        obj.replace("B", 2, 11);
        System.out.println(obj);//?
        
        obj.replace("C", "D");
        System.out.println(obj);//?

    }
}
