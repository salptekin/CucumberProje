package day30polymorphismdt;

public class Test02 {
	public static void main(String s[]) {	
		String str = print(8) + print();
		print(str);
	}
	public static int print() {
		return 3;
	}
	public static String print(int i) {
		return "5";
	}
	public static void print(String j) {
		System.out.println(j);
	}
}
