package day17foreachloopnt;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop02 {

	public static void main(String[] args) {
		//Do not use specific numbers among your codes. If you do it it is called
		//"Hard Coding". If you use hard coding they will send your code back definitely.
		//For example if you need the number of elements in a list do  not use number
		//use size() to get the number of elements
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add(15);
		
		//Find the average value ( (a + b + c)/3 ) of the elements in list1. 
		double sum = 0;
		for(int w : list1) {
			sum = sum + w;
		}
		System.out.println(sum/list1.size());
		
		//Print all elements of list1 except 13 on the console
		for(int w : list1){
			if(w==13) {
				continue;
			}
			System.out.print(w + " ");
		}
		
		System.out.println();
		
		//Print odd elements by using continue
		for(int w : list1) {
			if(w%2==0) {
				continue;
			}
			System.out.print(w+ " ");
		}
		System.out.println();
		
		//Print just first 2 elements
		int count = 0;
		for(int w : list1) {
			System.out.print(w + " ");
			count++;
			if(count==2) {
				break;
			}	
		}

	}
}
