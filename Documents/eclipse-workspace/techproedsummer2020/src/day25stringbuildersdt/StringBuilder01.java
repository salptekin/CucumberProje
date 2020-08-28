package day25stringbuildersdt;

public class StringBuilder01 {

	public static void main(String[] args) {
		
		//1. Way to create StringBuilder
		StringBuilder stb1 = new StringBuilder();// ""
		
		stb1.append("A");
		System.out.println(stb1);// A		
		stb1.append("b");
		System.out.println(stb1);// Ab
		
		//2. Way to create StringBuilder
		StringBuilder stb2 = new StringBuilder("Java");// Java
		
		stb2.append("X");
		System.out.println(stb2);//JavaX
		
		//3. Way to create StringBuilder
		//If you use integer like 5 inside the constructor parentheses, it means
		//you created a String whose length is 5.
		
		//After declaring the length, it is allowed to create Strings in different lengths
		StringBuilder stb3 = new StringBuilder(5);
		stb3.append("Java");
		System.out.println(stb3);//Java
		stb3.append("XY");
		System.out.println(stb3);//JavaXY

	}
	

}
