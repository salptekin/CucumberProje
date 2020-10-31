package day14whiledowhileloop;

public class DoWhile01 {

	public static void main(String[] args) {
		
		/*
		 while-loop ile do-while loop farki:
		 
		 1)while loop kullanirsaniz Java once sarti kontrol eder sonra loop body'si icindeki kodu calistirir.
		   do-while loop kullanirsaniz Java once loop body icindeki kodu calistirir sonra sarti kontrol eder.
		   
		 2)while loop kullanirsaniz loop body icindeki kod bazen hic calismayabilir.
		   Fakat, do-while icindeki kod en az bir kere calisir.  
		   
		   Note: do-while loop oyun programi yazmak icin iyidir
		*/
		
		int i = 1;
		while(i<1) {
			System.out.println("While Loop");
			i++;
		}
		
		
		int k = 1;
		do {
			System.out.println("Do-While Loop");
			k++;
		}while(k<1);

	}

}
