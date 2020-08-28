package day16listsnt;

import java.util.ArrayList;

public class Test02 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>() ;
		list.add( "A" );
		list.add( "B" );
		list.add( "F" );
		list.add( "D" );
		
		list.set( 2, "C" );
        System.out.println(list);
        
        list.add(1,"*");
        System.out.println(list);
        
        System.out.println(list.contains("F"));
        
        System.out.println(list.isEmpty());
	}

}
