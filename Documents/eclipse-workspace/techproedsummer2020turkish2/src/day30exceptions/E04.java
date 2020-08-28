package day30exceptions;

public class E04 {

	public static void main(String[] args) {
	
		Object obj = new Integer(100);
		
		//Java byte, short, int, long, float, and double (primitive'ler arasinda) arasinda 
		//casting yapabilir. Ama Wrapper class'lari String'e ceviremez.
		//Bunu yapmaya calisirsaniz ClassCastException alirsiniz. 
		//ClassCastException Run Time Exception'dir.
		
		System.out.println((Byte) obj);

	}

}
