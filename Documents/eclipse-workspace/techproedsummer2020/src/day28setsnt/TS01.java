package day28setsnt;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TS01 {
	
	/*
	 1)TreeSet is a set so no duplication
	 2)TreeSet is similar with HashSet. If you need the elements in natural order you should
	   use TreeSet
	 */

	public static void main(String[] args) {
		
//		LocalTime timeBeforeTreeSet = LocalTime.now();
//		System.out.println(timeBeforeTreeSet);//20:18:24.543
//		TreeSet<String> ts = new TreeSet<>();
//		ts.add("A");
//		ts.add("B");
//		ts.add("C");
//		LocalTime timeAfterTreeSet = LocalTime.now();
//		System.out.println(timeAfterTreeSet);//20:18:24.638
//		
//		
//		LocalTime timeBeforeHashSet = LocalTime.now();
//		System.out.println(timeBeforeHashSet);//20:18:24.638
//		HashSet<String> hs = new HashSet<>();
//		hs.add("A");
//		hs.add("B");
//		hs.add("C");
//		LocalTime timeAfterHashSet = LocalTime.now();
//		System.out.println(timeAfterHashSet);//20:18:24.638
		
		/*If you need a list which has unique elements in natural order. 
		  Which class do you use?
		  Answer: TreeSet
		  
		  TreeSet is very slow, how can you make that task faster?
		  Answer: I will create HashSet, add the elements into HashSet first, 
		  then I will convert the HashSet to a TreeSet
		*/
		
		//This is the answer for the first part
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);//20:49:53.245
		TreeSet<String> tSet = new TreeSet<>();
		tSet.add("Z");
		tSet.add("Y");
		tSet.add("X");
		tSet.add("X");
		System.out.println(tSet);//[X, Y, Z]
		LocalTime time2 = LocalTime.now();
		System.out.println(time2);//20:49:53.315
		
		//This is the answer for the second part
		LocalTime time3 = LocalTime.now();
		System.out.println(time3);//20:49:53.315
		HashSet<String> hSet = new HashSet<>();
		hSet.add("Z");
		hSet.add("Y");
		hSet.add("X");
		hSet.add("X");
		System.out.println(hSet);
		
		TreeSet<String> convertedTreeSet = new TreeSet<>(hSet);
		System.out.println(convertedTreeSet);
		LocalTime time4 = LocalTime.now();
		System.out.println(time4);//20:49:53.315

	}

}
