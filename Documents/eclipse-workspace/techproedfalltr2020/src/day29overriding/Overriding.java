package day29overriding;

public class Overriding {
	/*
	 1)Parent Class'daki bir methodu Child Class'a gore 
	   ozellestirerek kullanmak isterseniz "Overriding"
	   yapabilirsiniz.
	 2) a)Overriding yaparken "method signature(name+parametre)"
	      a dokunulmaz.
	    b)Overriding yaparken "access modifier"lar belli kurallara
	      gore degistirilebilir.
	    c)Overriding yaparken "return type"lar belli kurallara
	      gore degistirilebilir.
	    d)Overriding yaparken "method body" degistirilir zaten 
	      "Overriding" in amaci budur. Ama method body'yi degistirmeden 
	      kullanirsaniz Java CTE vermez. Ama Overriding'de method body'i
	      degistirmemek mantiksizdir. 
	    e)Overriding yapabilmek icin "parent-child" relationship sarttir.
	      Yani inheritance olmadan overriding olmaz.
	    f)Override edilen method parenttaki methoddur ve Java o methoda
	      "Overridden Method" denir. Child class'daki method ise 
	      "Overriding Method" olarak adlandirilir. 
	 3)Overriding methodun basina "@Override" annotation'ini koyarsaniz
	   Java yaptiginiz overriding'i kontrol eder, herhangi bir yanlislik varsa 
	   CTE verir.
	 4)"Overriding Method" un access modifier'i ya "Overridden Method" ile 
	   ayni olur veya daha genis olur. 
	 5)Return type'lar primitive ise "Overriding Method" un return type'i 
	   "Overridden Method" ile ayni olmalidir.
	 6)"Overridden Method"un return type'i void ise "Overriding Method" un da 
	   return type'i void olmalidir.
	 7)Return Type Wrapper Class ise "Overriding Method" un return type'i 
	   "Overridden Method" ile ayni olmalidir.
	 8)Return Type'lar arasinda parent-child relationship varsa 
	   "Overriding Method" un return type'i ya "Overridden Method" ile ayni olmali
	   veya "Overridden Method" un child class'i olmali. 
	 9)static methodlar override edilemezler. 
	 10)final methodlar override edilemezler.
	 11)private methodlar override edilemezler.
	 
	 12)"Polymorphism" nedir?
	    Elcevap: Polymorphism "Overloading" ve "Overriding" den olusur.
	             Overloading ==> public void add(){ }
	                             public void add(int i){ }
	                             public void add(int i, String s){ }
	             Overriding  ==> public void multiply(){syso("3*4")} 
	                             public void multiply(){syso("1*2*3")}
	                             public void multiply(){syso("5*4*3")}
	                             
	   "Overloading" ve "Overriding" arasindaki farklar nelerdir?                                         
	    1)"Overloading" de method signature(name+parametre) degistirilir(parametre degisir),
	      "Overriding" de method signature'a dokunulmaz.
	    2)"Overloading" de method body genellikle degistirilmez, "Overriding" de method
	      body hemen hemen her zaman degistirilir.
	    3)"Overloading" de inheritance gerekmez, "Overriding" de inheritance sarttir.
	    4)"Overloading" Compile Time Polymorphism'dir, "Overriding" Run Time Polymorphism'dir.
	    5)private methodlar overload edilebilirler ama override edilemezler. 
	      static methodlar overload edilebilirler ama override edilemezler.
	      final methodlar overload edilebilirler ama override edilemezler.
	 */
}
