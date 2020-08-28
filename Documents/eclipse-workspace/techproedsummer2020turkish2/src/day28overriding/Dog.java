package day28overriding;

public class Dog extends Animal {
	
	/*
	 1)Parent'taki method'u method signature'ini degistirmeden method body'sini
	   degistirerek Child class'da kullanmaya "Method Overriding" denir.
	 2)Parent class'daki private method'lar override edilemezler 
	 3)final method'lar override edilemezler cunku; final methodlarin body'leri olabilecekleri
	   son haldedir yani method body'leri degistirilemez. Halbuki overriding'in amaci method body'i
	   degistirerek methodu kullanmaktir. Bu celiskiden dolayi Java final method'larin override
	   edilmesine musaade etmez.
	 4)static method'lar override edilemezler.Cunku; static methodlar ortak kullanima aciktir
	   onun body'sini degistirmek herkesi etkiler bu yuzden Java static methodlarin override 
	   edilmesine musaade etmez.
	 5)Child class'daki override edilmis method'un (Overriding Method) access modifier'i
	   Parent class'daki override edilen method'un(Overridden Method) access modifier'indan
	   daha dar olamaz.
	 6)Child class'daki override edilmis methodun return
	   type'i ya parent class'daki override edilmis
	   methodun return type'i ile ayni olur veya onun child'larindan biri olabilir
	 */

	public static void main(String[] args) {
         Dog dog = new Dog();
         dog.sound();
	}
	
	@Override
	public void sound() {
		System.out.println("Havlarlar");
	}

	@Override //Annotation: Bu asagidaki methodun override kurallarina uygun
	          //            olarak override edilip edilmedigini kontrol eder
	public void numOfFoot() {
        System.out.println("4 ayaklari vardir");
	}

}