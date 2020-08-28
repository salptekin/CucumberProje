package day22foreachloopdt;

public class Question02 {

	public static void main(String[] args) {
		/*
		 Find the sum of the elements whose indexes are same in the given 
		 two multidimensional arrays
         a = { {1,2}, {3,4,5}, {6} }  and b = { {7,8,9}, {10,11}, {12} }  
		*/		
		int a[][] = { {1,2}, {3,4,5}, {6} };
		int b[][] = { {7,8,9}, {10,11}, {12} };
		int c = 0;
		int sum = 0;
		
		if(a.length <= b.length) {
			c =  a.length;
		}else {
			c =  b.length;
		}
		
		for(int i =0; i<c; i++) {
			
				if(a[i].length<=b[i].length) {
					for(int k=0; k<a[i].length; k++) {
					    sum = sum + a[i][k] + b[i][k];
					}
				}else {
					for(int k=0; k<b[i].length; k++) {
					    sum = sum + a[i][k] + b[i][k];
					}
				}
		}
		System.out.println(sum);
	}

}


