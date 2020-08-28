package day18statickeyworddt;

public class StaticKeyword03 {

	public static void main(String[] args) {

		StaticKeyword01 obj1 = new StaticKeyword01();
		StaticKeyword01 obj2 = new StaticKeyword01();
		StaticKeyword01 obj3 = new StaticKeyword01();
		
		obj1.increment();//i++ ==> i=13, k++ ==> k=14
		obj2.increment();//i++ ==> i=14, k++ ==> k=14
		obj3.increment();//i++ ==> i=15, k++ ==> k=14
		
		System.out.println(obj1.k);//14
		System.out.println(obj2.k);//14
		System.out.println(obj3.k);//14
		
		System.out.println(obj1.i);//15
		System.out.println(obj2.i);//15
		System.out.println(obj3.i);//15
		
	}

}
