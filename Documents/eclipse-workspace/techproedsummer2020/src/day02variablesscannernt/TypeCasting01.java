package day02variablesscannernt;

public class TypeCasting01 {

	public static void main(String[] args) {
		//We will learn how to cast data types
		//byte < short < int < long < float < double
		
		//There are 2 different casting
		// 1. Auto Widening Casting : If you convert small data types
		// to large ones, there is no need to do extra effort. Java will do it
		// automatically.	
		byte b1 = 23;
		short b2 = b1;
		System.out.println(b2);//23
		
		int i1 = 2345;
		long i2 = i1;
		System.out.println(i2);//2345
		
		int i3 = 432;
		float i4 = i3;
		System.out.println(i4);//432.0
		//Explicit Narrowing Casting: If you want to convert large data types to 
		//small ones, Java cannot do it by itself. You must help Java
		short s1 = 120;
		byte b4 = (byte)s1;
		System.out.println(b4);
		
		int i5 = 234;
		short s2 = (short)i5;
		System.out.println(s2);
		
		float f1 = 2.9f;
		int i6 = (int) f1;
		System.out.println(i6);//2 ==> If you convert a decimal to int
		                       // Java will cancel the decimal part. 
		                       // For 2.9 you will get just 2
		                       // No rounding just cancelling decimal part
		
		double d1 = 12.87;
		long l1 = (long) d1;
		System.out.println(l1);//12
	}
}
