package day26passbyvalueinheritance;

public class PassByValue {
	
	/*
	 Pass By Value: Java bir methoda bir variable'a ait degeri yollarken, o degerin
	 kopyasini olusturur ve kopyayi methoda yollar. Method kendisine
	 yollanan degeri degistirirken kopya degeri degistirmis olur.
	 Java bu sayede variable'a ait orjinal korumus olur. 
	 
	 Pass By Reference: Pass by refernece'da reference kopyalanip methoda yollanir ama orjinal
	 reference da kopya reference da ayni obje'yi gosterdiginden orjinal obje degismis olur. 
	 Java orjinal objenin degismesini istemediginden pass by reference kullanmaz.
	 Primitivelerde de non-primitive'lerde de pass by value kullanir.
	 */
	
	public static void main(String[] args) {
		
		int gomlek = 100;	
		System.out.println(indOgr(gomlek));//80	
		System.out.println(askInd(gomlek));//95
		System.out.println(gomlek);//100
		
		String hazine = "Altin";
		hazineCal(hazine);
		System.out.println(hazine);//Altin
		
	}
	
	public static int indOgr(int gomlek) {
		return gomlek - 20;
	}
	
	public static int askInd(int gomlek) {
		return gomlek - 5;
	}
	
	public static String hazineCal(String hazine) {
		return hazine + "calindi";
	}
	
}
