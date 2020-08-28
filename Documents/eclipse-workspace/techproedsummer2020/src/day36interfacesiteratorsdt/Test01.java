package day36interfacesiteratorsdt;

	interface A {
		void myMethod();
	}
	class B {
		public void myMethod() {
			System.out.println("Good");
		}
	}
	class C extends B implements A {

	}
	class Test01 {
		public static void main(String[] args) {
			A a = new C();
			a.myMethod();
		}
	}

