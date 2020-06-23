package day05incrementdecrement;

public class ConcatenationSoru01 {

	public static void main(String[] args) {
		int numA = 2;
		int numB = 3;
		String str1 = "Cok";
		String str2 = "Calis";
		
		//Ekrana "Cok Calis 1" yazdirin
		System.out.println(str1 + " " + str2 + " " + (numB - numA));
		
		//Ekrana "5 Cok Calis" yazdirin
		System.out.println((numA + numB) + " "  + str1 + " " + str2);		
		System.out.println(str1 + numA + numB);//Cok23		
		System.out.println(str1 + (numA + numB));//Cok5		
		System.out.println(numA + numB + str1);//5Cok
		
		int n1 = 2;
		int n2= 3;
		String s1 = "Study";
		
		//Ekrana “61 Study-1” yazdiriniz
		System.out.println((n1*n2) + "" + (n2-n1) + " " + s1 + (n1 - n2));

	}

}
