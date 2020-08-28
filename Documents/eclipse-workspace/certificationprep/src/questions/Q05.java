package questions;

public class Q05 {

	public static void main(String[] args) {
	
		int a[] = {11, 22, 33, 44};
		int length = a.length;
		int idx = 0;
		
		do{
			idx++;
		}while(idx>=length);
		
		System.out.println(a[idx]);
				
//		while(idx<length) {
//			idx++;
//		}
//		System.out.println(a[idx]);
			
//		do {			
//			idx++;		
//		}while(idx<length-1);		
//		System.out.println(a[idx]);
		
//		do {
//			idx++;				
//		}while(idx<=length);		
//		System.out.println(a[idx]);
		
//		while(idx<=length-1) {
//			idx++;
//		}
//		System.out.println(a[idx]);
  }

}
