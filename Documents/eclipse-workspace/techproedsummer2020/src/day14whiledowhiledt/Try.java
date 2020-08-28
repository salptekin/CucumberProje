package day14whiledowhiledt;

public class Try {

	public static void main(String[] args) {
		int a = 80;
		int b = 20;
		while(a>=b){
			a -= 10;
			b += 10;
			System.out.println(a + "," + b);
		}
	}
}
