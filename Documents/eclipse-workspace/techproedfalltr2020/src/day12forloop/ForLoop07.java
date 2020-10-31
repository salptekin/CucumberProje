package day12forloop;

public class ForLoop07 {

	public static void main(String[] args) {
		/*
		 3'den 6'a kadar tum tamsayilarin carpimini hesaplayan programi yaziniz
		*/
		int carpim = 1;

		for(int i=3; i<=6; i++) {
			carpim = carpim * i;
		}

		System.out.println("Carpim: " + carpim);
	}

}
