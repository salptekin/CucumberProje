package day14methodcreation;

public class InstanceLocalVariables01 {

	int i = 12;//Instance variable
	
	public static void main(String[] args) {
		
		/*
		 1)Instance(Gorunum/Object) Variable = Object Variable 
		 2)Main methodun disinda class'in icinde uretilen variable'lara instance 
		   variable denir.
		 3)Instance variable'lar class'in icindeki tum methodlar tarafindan kullanilabilir   
		*/
		
		/*
		 1)Local Variable = Method'un body'si icinde veya Methodun method parantezi 
		                    icinde uretilen variable'lardir.
		 2)Local variable'lar sadece method body'si icinde kullanilabilirler                   
		 */
		
		/*
		 1) Instance Variable'larin scope'u icinde bulundugu class'in heryeridir. 
		    Yani; Instance variable'lar class'in icinde heryerde kullanilabilir.
		 2) Local variable'larin scope'u icinde bulunduklari method'un body'sidir.
		    Yani; Local variable'lar method body'si kullanilabilirler. 
		 3) Bir variable'i kullanmak icin once onu create etmek lazim. Create etmeden
		    method body'si icinde kullaniyorum falan olmasin...      
		*/
		
		/*
		 Note: Instance variable'lara deger atamasi yapmazsaniz Java onlara default
		       deger atamasi yapar. Ama local variable'lara deger atamasi yapmazsaniz
		       Java onlara default deger atamasi yapmaz ve o variable'i kullanmak
		       istediginizde Compile Time Error verir.
		*/

	}
	
	public void toplama() {
		int sonuc;
		i++;
		System.out.println();
	}
	
	public void cikarma(int n1) {
		n1++;
		i--;
		System.out.println("Cikarma");
	}

}
