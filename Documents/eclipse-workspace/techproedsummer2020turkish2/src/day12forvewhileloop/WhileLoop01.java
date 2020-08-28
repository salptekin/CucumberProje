package day12forvewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		
		//Ilk 10 sayma sayisini ekrana yazdiriniz
		int i = 1;
		while(i<=10) {
			System.out.print(i + " ");
			i++;
		}
		/*
		 Not 1:Yukaridaki kodda  int i = 1; ifadesi for-loop'un ilk bolgesi,
		       i<=10 for-loop'un ikinci bolgesi, i++; for-loop'un ucuncu 
		       bolgesi gibidir.
		 DIKKAT:i++; ifadesini yazmazsaniz while-loop sonsuz donguye girer bu da 
		        bilgisayariniza zarar verebilir.      
		*/
		
		System.out.println();
		
		//Ilk 10 sayma sayisini buyukten kucuge yazdiriniz, while-loop kullaniniz
		int j = 10;	
		while(j>=1) {	
			System.out.print(j + " ");			
			j--;			
		}
		/*
		 Yukaridaki kodda j--; yerine j++; yazarsaniz sonsuz dongu olusur.
		 Artirma ve azaltma bolumunde dikkatli olunuz
		*/
		
		System.out.println();
		
		//Ilk 100 cift sayma sayisini yazdiran program yaziniz, while-loop kullaniniz
		int k = 1;
		int sayma = 1;		
		while(sayma<=100) {			
			if(k%2==0) {				
				System.out.print(k + " ");				
				sayma++;
			}			
			k++;			
		}
		
		System.out.println();
		
		//j'den onceki tum kucuk harfleri yazdiran bir program yaziniz, while-loop kullaniniz
		char m = 'a';
		while(m<'j') {
			System.out.print(m + " ");
			m++;
		}
		
		System.out.println();
		
		//Ilk 5 buyuk harfin ASCII degerleri toplamini ekrana yazdiran bir program 
		//yaziniz while-loop kullaniniz
		int sum = 0;
		char n = 'A';
		while(n<='E') {			
			sum = sum + n;			
			n++;
		}		
		System.out.println(sum);

	}

}
