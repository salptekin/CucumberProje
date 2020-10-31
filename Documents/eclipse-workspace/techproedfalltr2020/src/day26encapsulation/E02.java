package day26encapsulation;

public class E02 {

	public static void main(String[] args) {
		
		E01 obj1 = new E01();
		System.out.println(obj1.getAge());//25
		System.out.println(obj1.getName());//Ali
		obj1.setAge(33);
		System.out.println(obj1.getAge());//33
		obj1.setName("Ayse");
		System.out.println(obj1.getName());//Ayse
		
		E03 obj3 = new E03();
		//num'i 38 yap ve ekrana yazdir
		obj3.setNum(38);
		System.out.println(obj3.getNum());//38
		
		//name'i ekrana yazdirin
		System.out.println(obj3.getName());//Emine
		
		//Initial variable'ini degistirilemez hale getirin
        //setInitial() methodunu E03 class'indan sildim.
		
		//Initial variable'ini okunamaz hale getirin
		//getInitial() methodunu E03 class'indan sildim.
	}

}
