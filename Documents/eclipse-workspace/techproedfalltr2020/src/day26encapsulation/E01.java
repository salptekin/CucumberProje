package day26encapsulation;

public class E01 {
	
	/*
	 1)Encapsulation kisaca "data hiding(saklamak)" demektir.
	 2)Basarili bir Encapsulation asagidaki ozellikllere sahip olmali:
	   a)Nasil kullanilacagi belli olmali.(Direksiyon gibi)
	   b)Kod'un karmasikligi kullanimin karmasikligina sebep olmamali. Yani cok karmasik
	     kodlardan olusan bir yapi basit bir sekilde kullanilabilmeli.
	   c)Bir bolumun bozulmasi baska bolumlerin bozulmasina sebep olmamali.
	   
	3)Encapsulation nasil yapilir?
	  a)Access modifier'lari "private" olarak kullaniniz.
	  b)getter ve setter methodlari ile "encapsulated" data'lara ulasip onlari okuyabilir(getter) ve 
	    degistirebiliriz(setter).  
	    
	4)Encapsulation'in faydalari:
	  a)Esneklik(flexibility). Normalde asagidaki ornekte "age" variable'inin degeri 25 dir. Ama
	    diger class'larda setAge() methodunu kullanarak age variable'inin degerini istedigimiz gibi degistirip
	    kullanabiliriz. 
	  b)Reusability. getter ve setter method'lari bir kere olustururuz sonra proje icindeki 
	    tum class'lardan istedigimiz kadar kullanabiliriz.
	  c)Istediginiz data'yi okunabilir(getter() olustur), istediginiz data'yi okunamaz(getter() olusturma) 
	    hale getirbilirsiniz. 
	  d)Istediginiz data'yi degistirilebilir(setter() olustur), istediginiz data'yi 
	    degistirilemez(setter() olusturma) yapabilirsiniz.
	  Note:Tum variable'lar private ve sadece getter() methodlari olusturdum. Bu tarz bir class'da 
	  data'lar sadece okunabilir, degistirilemez. Bu tarz class'lara "Immutable Class" denir. 
	  e)Kullanicinin kullandigi sistem arkasindaki karmasik yapiyi kullaniciya gostermez. Boylece kullanici 
	  yapmak istediklerini daha rahat yapar. 
	  
	5)Bir class'da a)tum variable'lar "private" ise ve b)tum getter() ve c)tum setter()'lar olusturulmus ise 
	  bu class "Fully Encapsulated" olarak adlandirilir. 
	  
	6)getter() ve setter() methodlarina ayni zamanda "Java Beans" de denir.       
	            
	*/
	
	private int age = 25;
	private String name = "Ali";

    //getter() olusturmak
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	//setter() olusturmak
	public void setAge(int age) {
		this.age = age; 
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
