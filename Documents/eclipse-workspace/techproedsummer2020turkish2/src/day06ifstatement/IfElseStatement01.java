package day06ifstatement;

public class IfElseStatement01 {

	public static void main(String[] args) {
		
		int num = -2;
		
		//if - else statement'da ya if bolumu veya else bolumu calisir asla
		//ikisi birden calismaz.
		
		//Condition true ise "if" bolumu calisir, condition false ise "else" bolumu calisir
		
		if(num<0) {
			System.out.println("Negatif");
		}else {
			System.out.println("Negatif degil");
		}
		
		if(num<0) {
			System.out.println("Negatif");
		}
		if(num>=0) {
			System.out.println("Negatif degil");
		}

	}

}
