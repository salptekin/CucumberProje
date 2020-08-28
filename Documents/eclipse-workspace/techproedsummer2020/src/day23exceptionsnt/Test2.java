package day23exceptionsnt;

public class Test2 {
	String str = "a";

	void A() {
		try {
			str += "b";
			B();
		} catch (Exception e) {
			str += "c";
		}
	}

	void B() throws Exception {
		try {
			str += "d";
			C();
		} catch (Exception e) {
			str = str + "e";
		} finally {
			str += "f";
		}

		str += "g";

	}

	void C() throws Exception {
		System.out.println(12/0);
	}

	void display() {
		System.out.println(str);
	}

	public static void main(String[] args) {
		Test2 object = new Test2();
		object.A();
		object.display();
	}
}
