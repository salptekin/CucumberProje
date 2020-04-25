package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Lambda05 {

	public static void main(String[] args) {
		// Find the sum of all elements in the given list by using both "Structured" and "Functional" programming	
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		
		sumOfAllStructured(list);
		System.out.println(sumOfAllFunctional01(list));
		System.out.println(sumOfAllFunctional02(list));
		System.out.println(sumOfAllFunctional03(list));

	}
	
	//By using "Structured"
	public static void sumOfAllStructured(List<Integer> list) {
		int sum = 0;
		for(int w:list) {
			sum = sum + w;
		}
		System.out.println(sum);
	}
	
	//By using "Functional"
	//1) Method Reference ==> I used the method I created
	private static int sum(int a, int b) {
		return a+b;
	}
	public static int sumOfAllFunctional01(List<Integer> list) {		
		return list.stream()
		           .reduce(0,Lambda05::sum);// Combines the elements into one result, uses the initial value
		                                   // 0+12=12 => 12+9=21 ==> 21+13=34 ==> ... 62+15=77		     
    }
	
	//2) Method Reference ==> I used the method Java created
			public static int sumOfAllFunctional02(List<Integer> list) {		
				return list.stream()
				           .reduce(0,Integer::sum);		     
		    }
	
	//3) By Lambda Expression 
		public static int sumOfAllFunctional03(List<Integer> list) {		
			return list.stream()
			           .reduce(0,(x,y)->x+y);		     
	    }

}
