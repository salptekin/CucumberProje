package day13whileloop;

public class ForLoop02 {

	public static void main(String[] args) {
		/*
		 For loop kullanarak asagida verilen sekli olusturunuz
		 			*
		 			**
		 			***
		 			****
		 			*****
		 */
		
		
		
		for(int i=1; i<=10; i++) {//==> i satir sayisini gosteriyor

			for(int k=1; k<=i; k++) {//==>Yildiz sayisini gosteriyor
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}

}
