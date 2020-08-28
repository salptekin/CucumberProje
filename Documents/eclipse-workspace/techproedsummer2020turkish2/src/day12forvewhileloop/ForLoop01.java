package day12forvewhileloop;

public class ForLoop01 {

	public static void main(String[] args) {
		// Ilk 30 sayma sayisinin toplamini ekrana yazdiran program yaziniz
		int sum = 0;	
		for(int i=1; i<=30; i++) {			
			sum = sum + i;			
		}
		//Sadece final sonucu gormek isterseniz System.out.println(sum); ifadesini
		//for-loop'un disina yaziniz.(Genellikle bu kullanilir)
		//Her loop'dan sonraki toplami gormek isterseniz System.out.println(sum);
		//ifadesini for-loop'un icine yaziniz.
		System.out.println(sum);
		
		//Ilk 10 sayma sayisinin carpimini ekrana yazdiran programi yaziniz.
		//Matematikte 1x2x3x4x5 ifadesine 5 fakoryel denir ve 5! ile gosterilir.
		//Mesela; 7! = 1x2x3x4x5x6x7
		//INTERVIEW SORUSU Faktoryel hesabini yapan bir program yaziniz
		int product = 1;
		for(int i=1; i<=10; i++) {
			product = product * i;
		}
		System.out.println(product);
		
		//100 ile 200 arasindaki 3 ile bolunebilen sayilarin toplamini bulan bir 
		//program yaziniz
		int sum1 = 0;		
		for(int i=101; i<=199; i++) {			
			if(i%3==0) {
				sum1 = sum1 + i;
			}			
		}
		System.out.println(sum1);

	}

}
