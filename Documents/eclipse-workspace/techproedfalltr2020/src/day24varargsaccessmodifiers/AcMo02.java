package day24varargsaccessmodifiers;

import day23foreachloopdatetime.AcMo03;

public class AcMo02 {
	/*
	 1)"private" class member(uye)'lar sadece icinde bulunduklari class'larda kullanilabilirler.
	   Baska class'lardan "private" class member'lari kullanmak mumkun degildir.
	   
	 2)Baska package'lerden object olusturursaniz, object olusturulan class'i import etmeniz gerekir  
	 
	 3)Baska package'lerden default class member'lara ulasamazsiniz.Ayni package'de iseniz
	   ulasabilirsiniz."default" ile "package private" es anlamlidir.
	 
	 4)public class member'lara herkes her yerden ulasabilir.
	 
	 5)"protected" class member'lara ayni package'de iseniz ulasabilirsiniz. Farkli package'de iseniz
	   iki durum var: a)Child class iseniz ulasabilirsiniz   b)Child class degilseniz ulasamazsiniz.
	   
	 6)Class'larda da access modifier kullanilir. Ama sadece "public" ve "default" access modifier'lar
	   kullanilabilir. Class olustururken "private" veya "protected" access modifier kullanmayiniz. 
	 
	 */

	public static void main(String[] args) {
		
		AcMo01 obj1 = new AcMo01();		
		System.out.println(obj1.publicAge);
		System.out.println(obj1.protectedAge);
		System.out.println(obj1.defaultAge);
		
		AcMo03 obj3 = new AcMo03();
		System.out.println(obj3.publicName);
		
	}

}
