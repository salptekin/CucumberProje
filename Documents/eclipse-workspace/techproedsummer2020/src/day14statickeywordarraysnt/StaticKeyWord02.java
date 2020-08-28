package day14statickeywordarraysnt;

public class StaticKeyWord02 {

	public static void main(String[] args) {
		
		//To access a static variable you can use just class name(Recommended)
		System.out.println(StaticKeyWord01.i);//12
		
		//Or you can access after creating object(Not recommended)
		StaticKeyWord01 obj1 = new StaticKeyWord01();
		System.out.println(obj1.i);//12
		
		//You can access to non-static variables just after creating objects.
		//Class name will not be enough to access a non-static variable.
		System.out.println(obj1.k);//13
		
		//Try to access multiply() by using recommended and non-recommended ways
		
		//Recommended Way is using Class Name
		StaticKeyWord01.multiply();//Multiply
		
		//Non-Recommended Way is using object
		//obj1.multiply();//Multiply
		
		//Try to access add()
		obj1.add();//Add

	}

}
