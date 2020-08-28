package day36interfacesiteratorsdt;

interface K {
	String a = "Awesome";
	String mA();
}

interface L extends K {
	String b = "Bad";
	String mB();
}

class M implements K, L {
	public String mA() {
		return a + " " + b;
	}
	public String mB() {
		return b + " " + a;
	}
}

public class Test02 {
	public static void main(String[] args) {
		M m = new M();
		System.out.println(m.mA());
		System.out.println(m.mB());
	}
}
