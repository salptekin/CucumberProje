package day14statickeywordarraysnt;

import java.util.Arrays;
import java.util.Collections;

public class Arrays03 {

	public static void main(String[] args) {

		//Short way to create an array and to assign values
		int arr[] = {3, 1, 5, 2, 7, 4};
		
		// How to sort array elements
        Arrays.sort(arr); //sort() puts the elements in ascending order
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 7]
        
        /*
         Create a String array
         Print the array on the console
         Sort the elements
         Print the array on the console
        */
        
        String str[] = {"Ali", "Ahmet", "Kemal", "Can"};
        System.out.println(Arrays.toString(str));//[Ali, Ahmet, Kemal, Can]
        
        Arrays.sort(str);//sort() puts the elements in alphabetical order
        System.out.println(Arrays.toString(str));//[Ahmet, Ali, Can, Kemal]
        
        //Note: Ascending order and alphabetical order both are called "Natural Order"
        
        
        /*
         Create a char array
         put the elements in reverse order
         */
        char ch[] = {'c', 'a', 'd', 'b'};
        
        //Use sort() first
        Arrays.sort(ch);
        System.out.println("===>"+ch[1]);
        System.out.println(Arrays.toString(ch));//[a, b, c, d]
        
        //Use loops
        for(int i=ch.length-1;i>=0;i--) {
        	System.out.print(ch[i] + " ");
        }
  
	}

}
