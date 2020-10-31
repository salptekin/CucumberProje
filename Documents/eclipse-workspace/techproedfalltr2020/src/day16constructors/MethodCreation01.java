package day16constructors;

public class MethodCreation01 {

	public static void main(String[] args) {
		System.out.println(add(3,5));
		System.out.println(concatenate("Merhaba ", "Dunya!"));
	}
	
	/*
	 Method olustururken "void" disinda bir "return type" kullanirsaniz, method body'si icinde
	 en son satirda "return" keyword kullanmalisiniz, aksi takidirde Compile Time Error alirsiniz.
	 
	 "void" didinda kullanilabilecek return type'lar tum primitive ve tum non-primitive'lerdir.
	 */
	public static int add(int a, int b) {
		return a+b;
	}
	
	//Iki tane String'i concatenate eden ve String return eden bir method olusturunuz.
	//Bu method'u main method icinden cagirip String'i ekrana yazdiriniz
	public static String concatenate(String s, String t) {
		return s.concat(t);
	}

}
