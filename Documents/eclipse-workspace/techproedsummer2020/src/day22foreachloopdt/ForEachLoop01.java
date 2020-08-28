package day22foreachloopdt;

public class ForEachLoop01 {

	public static void main(String[] args) {
		
		/*
		 1) For Each Loop works with collections (Arrays, Lists)
		 2) The other name of For Each Loop is "Enhanced Loop"
		*/
		
		int arr[] = {1, 2, 3, 4, 5};
		
		//How to print all elements of an array on the console
		for(int w : arr) {			
			System.out.print(w + " ");		
		}
		
		System.out.println();
		
		//Find the sum of all elements of arr by using for-each loop
		int sum = 0;	
		for(int w : arr) {		
			sum = sum + w;			
		}
		System.out.println(sum);
		
		//Print the even elements on the console by using for-each loop
		for(int w : arr) {
			if(w%2==0) {
				System.out.print(w + " ");
			}
		}
		
		System.out.println();
		
		//Print the even elements on the console by using for-each loop and continue
		for(int w : arr) {		
			if(w%2!=0) {
				continue;
			}			
			System.out.print(w + " ");
		}
		
		System.out.println();
		
		//Find the multiplication of odd elements by using for-each loop and continue
		int product = 1;
		for(int w : arr) {
			if(w%2==0) {
				continue;
			}
			product = product * w;
		}
		System.out.println(product);//1*3*5 ==> 15
		
		//Find the sum off all elements except 3 by using for-each loop and continue
		int sum1 = 0;
		for(int w : arr) {
			if(w==3) {
				continue;
			}
			sum1 = sum1 + w;
		}
		System.out.println(sum1);//12

	}

}
