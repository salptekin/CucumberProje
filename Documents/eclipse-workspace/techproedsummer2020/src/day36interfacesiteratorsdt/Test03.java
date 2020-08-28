package day36interfacesiteratorsdt;

class D implements E {
	public int methodB(int i) {
		return i = i * i;
	}
}
interface E {
	int methodB(int i);
}
public class Test03 {
	public static void main(String[] args) {
		E b = new D();
		System.out.println(b.methodB(5));
	}
}
