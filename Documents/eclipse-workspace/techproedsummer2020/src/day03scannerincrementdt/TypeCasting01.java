package day03scannerincrementdt;

public class TypeCasting01 {

	public static void main(String[] args) {
		//byte < short < int < long < float < double	
		//Auto Widening: To convert small data type to large data type.
		//Converting small to large is easy, because of that Java can do it
		//automatically
		byte num1 = 112;
		short num2 = num1;
		System.out.println(num2);
		
		int num3 = 2345;
		double num4 = num3;
		System.out.println(num4);
		
		//byte < short < int < long < float < double
		//Explicit Narrowing:If you convert large data type to small
		//you have to type the name of the small data type before the 
		//variable name.
		long num5 = 657;
		short num6 = (short)num5;
		System.out.println(num6);
		double num7 = 12.56;
		float num8 = (float)num7;
		System.out.println(num8);
		
		//Example
		short num9 = 520;
		byte num10 = (byte)num9;
		System.out.println(num10);
	}
}
