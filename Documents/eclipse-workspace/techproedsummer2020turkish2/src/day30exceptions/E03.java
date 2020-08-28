package day30exceptions;

public class E03 {

	public static void main(String[] args) {
		
		String s = "12345";
		String t = "abcde";
		
		//Integer wrapper class'inin icindeki parseInt() methodu String'leri sayiya cevirmek icin kullanilir.
		int i = Integer.parseInt(s);		
		System.out.println(i + 2);//12347
		
		//Eger bir String rakamlardan olusturulmamissa parseInt() methodunu kullanarak onu sayiya cevirmek isterseniz
		//NumberFormatException alirsiniz.Cunku Java rakam disindaki characterleri parseInt() methodu ile sayiya ceviremez.
		@SuppressWarnings("unused")
		int j = Integer.parseInt(t);

	}

}
