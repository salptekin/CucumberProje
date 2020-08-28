package day17foreachloopnt;

public class ForEachLoop01 {

	public static void main(String[] args) {
		// When we have a collection(Arrays and Lists) using for-each loop 
		// is the best option. The other name of for-each loop is "Enhanced Loop"
		
		int arr[] = {1, 2, 3, 4, 5};
		
		//Print the elements of "arr" one by one on the console
		for(int w : arr) {
			System.out.println(w);
		}
		
		//Find the sum of all elements in "arr"
		int sum =0;
		for(int w : arr) {
			sum = sum + w;
		}
		System.out.println(sum);
		
		//Find the multiplication of all elements in "arr"
		int product = 1;
		for(int w : arr) {
			product = product * w;
		}
		System.out.println(product);//120
		
		//Print the even elements in the same line with space between them
		for(int w : arr) {
			if(w%2==0) {
			   System.out.print(w + " ");
			}
		}

	}

}
