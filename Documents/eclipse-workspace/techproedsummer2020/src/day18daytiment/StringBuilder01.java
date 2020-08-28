package day18daytiment;

public class StringBuilder01 {

	public static void main(String[] args) {
		
		/*
		 Strings are immutable, it means when you update a String Java creates 
		 a new String object for the updated value. but it is not good to create
		 new objects for every update, because of that Java created StringBuilder class.
		 StringBuilder class is mutable, it means it is open to update. Java does  not
		 need to vreate new objects for every update.
		 
		 Note: There is another mutable String class which is StringBuffer, it is similar
		 with StringBuilder but it is the old version of StringBuilder. Because of that
		 we prefer to use StringBuilder most of the time. StringBuilder works faster
		 than StringBuffer.
		*/
		
		StringBuilder stb1 = new StringBuilder();//You created an empty String
		stb1.append("Veli");
		System.out.println(stb1);//Veli
		stb1.append("Kaya");
		System.out.println(stb1);//VeliKaya
		
		StringBuilder stb2 = new StringBuilder("Ali");//You created String "Ali"
		stb2.append('X');
		System.out.println(stb2);//AliX
		
		StringBuilder stb3 = new StringBuilder(5);//You created String whose length is 5
		System.out.println(stb3.length());//0
		stb3.append("Anim");
		System.out.println(stb3.length());//4
		stb3.append("als");
		System.out.println(stb3.length());//7
		System.out.println(stb3);//Animals

		//substring() method returns String, because of that when you assign the return
		//of substring() method to a variable make its data type String not StringBuilder
		String stb4 = stb3.substring(4);
		System.out.println(stb4);//als
		
		String stb5 = stb3.substring(2, 5);
		System.out.println(stb5);//ima
		
		int idx = stb3.indexOf("ma");
		System.out.println(idx);//3
		
		stb3.append(3).append('c').append("Wooow!");
		System.out.println(stb3);//Animals3cWooow!
		
		stb3.insert(7, 'X');
		System.out.println(stb3);//AnimalsX3cWooow!
		
		//In delete() method 2nd parameter is exclusive
		stb3.delete(7, 10);
		System.out.println(stb3);//AnimalsWooow!
		
		stb3.deleteCharAt(6);
		System.out.println(stb3);//AnimalWooow!
		
		//If you use index more than or equal to length Run Time Error
		//stb3.deleteCharAt(12);
		//System.out.println(stb3);
		
		
		//When they ask you to reverse a String, tell them I can do it by using
		//StringBuilder but if you ask me to do it by using loops it is fine
		StringBuilder stb6 = stb3.reverse();
		System.out.println(stb6);//!woooWlaminA
		System.out.println(stb3);//!woooWlaminA
		
		//How to convert a StringBuilder to a String
		String stb7 = stb3.toString();
		System.out.println(stb7);//!woooWlaminA
		
	}

}
