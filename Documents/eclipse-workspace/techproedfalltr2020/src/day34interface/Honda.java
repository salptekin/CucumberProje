package day34interface;

public abstract class Honda {
	/*
	 1)interface'lerde "concrete" methodlar kullanilamaz,
	   sadece "abstract" methodlar kullanilabilir.
	   interface'ler SADECE mecbur yapilmasi gerekenleri 
	   depolamak icin kullanilir.
	 2)Java, Multiple inheritance'i desteklemez ama
	   parent'lar class ise desteklemez.
	   Parentlar interface ise Java multiple inheritance'i
	   destekler.
	 3)Birden fazla "parent class" oldugunda farkli parent
	   class'larda ayni isimli farkli body'li 
	   methodlarin olmasi mumkundur. Bu tip durumlarda child
	   class ayni isimli farkli body'li methodlardan hangisini 
	   kullanacagina karar veremez. Fakat interface'lerde method'larin body'leri olmadigindan 
	   ayni isimli methodlar birbirinin tamamiyla aynisidir. 
	   Bu methodlardan birini override etmek hepsini override etmek manasina gelir.
	   Note:Parent interface'ler icinde ayni method signature sahip ama return type'lari farkli 
            methodlar varsa Java interface'ler icin de Compile Time Error verir.	      
	 */
	
	public abstract void hareket();
	
	public void dizel() {
		System.out.println("Motorin kullanir");
	}
	
	public void benzin() {
		System.out.println("Benzin kullanir");
	}

}
