package day30mapsnt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lambda03 {

	public static void main(String[] args) {
		
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
		
		sumStructured(list);//77
		System.out.println(sumFunctional(list));//77
		System.out.println(productFunctional(list));//48522240
		System.out.println(maxValue(list));//15
		System.out.println(minValue(list));//2

	}
	
	// Find the sum of all elements in the given list by using "Structured" way
	public static void sumStructured(List<Integer> list) {
		int sum = 0;
		for(int w : list) {
			sum = sum + w;	
		}
		System.out.println(sum);
	}
	
	// Find the sum of all elements in the given list by using "Functional" way
	public static int sumFunctional(List<Integer> list) {
		return list.stream()
		           .reduce(0, (t,u)->t+u);
	}
	
	//Find the multiplication of all elements by using Functional Programming
	public static int productFunctional(List<Integer> list) {
		return list.stream()
				   .reduce(1, (t, u) -> t*u);
	}
	
	//Find the element whose value is maximum from the list by using Functional Programming
	public static int maxValue(List<Integer> list) {
		return list.stream()
				   .reduce(Integer.MIN_VALUE, (t,u) -> t>u ? t : u);
	}
	
	//Find the element whose value is minimum from the list by using Functional Programming
	public static int minValue(List<Integer> list) {
		return list.stream()
				   .reduce(Integer.MAX_VALUE, (t,u) -> t<u ? t : u);
	}

}
