package day06nestedifternarynt;

public class TernaryOperator01 {

	public static void main(String[] args) {
		
		//Ternary operator is updated format of if-else statement
		
		int a = 9;
		
		if(a>10) {
			System.out.println("Good for if-else");
		}else {
			System.out.println("Bad for if - else");
		}
			
		String result = a>10 ? "Good for ternary" : "Bad for ternary";
		System.out.println(result);
	}
}
