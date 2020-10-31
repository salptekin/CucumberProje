package day05typecasting;

public class TypeCasting01 {

	public static void main(String[] args) {
		
		/*
		      byte < short < int < long < float < double
		      Kucuk data type'larini buyuk data type'larina cevirmek kolay bir is 
		      oldugundan Java bu isi bizim yardimimiza ihtiyac duymadan otomatik olarak yapar.
		      Ismi "Auto Widening Casting" dir. 
		*/
		
		byte b1 = 12;
		short s1 = b1;
		int i1 = b1;
		float f1 = b1;
		
		/*
		       byte < short < int < long < float < double
	
		       Buyuk data type'larini kucuk data type'larina cevrime isini Java otomatik olarak yapmaz.
		       Bu cevirmeyi biz asagidaki gibi kod yazarak yapariz. Bunun ismi "Explicit Narrowing Casting" dir
	 
		 */
		
		short s2 = 1210; 
		byte b2 = (byte)s2;
		
	}

}
