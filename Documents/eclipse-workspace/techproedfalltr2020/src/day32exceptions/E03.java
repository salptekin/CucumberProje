package day32exceptions;

public class E03 {
	
	/*
	 printStackTrace() olusan Exception'in tum detaylarini verir. Console'da detayli bir hata mesaji 
	 almak isterseniz "e.printStackTrace();" kullaniniz.
	 */

	public static void main(String[] args) {
		
		int arr[] = {11, 12, 13, 14};
		
		try {
			
			System.out.println(arr[4]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
			
		}

	}

}
