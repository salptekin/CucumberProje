package day25stringbuildersdt;

public class StringBuilder02 {

	public static void main(String[] args) {
		// How to use substring() with StringBuilders
		StringBuilder stb1 = new StringBuilder("Learn Java");
		
		//If a method which you are using is coming from String class
		//it cannot update the StringBuilder
		System.out.println(stb1.substring(6));//Java
		System.out.println(stb1);// Learn Java
		
		
		//How to use multiple append() in one line
		stb1.append("X").append("Y");
		System.out.println(stb1);//Learn JavaXY
		
		//How to use insert()
		//insert() is different from replace(); replace() method deletes the 
		//character but insert() method just inserts without deleting
		stb1.insert(0, "A");
		System.out.println(stb1);//ALearn JavaXY
		
		stb1.insert(6, "/");
		System.out.println(stb1);// ==> ALearn/ JavaXY
		
		//How to use delete()
		//1st index is inclusive, 2nd index is exclusive
		stb1.delete(1, 6);
		System.out.println(stb1);//A/ JavaXY
		
		//How to use deleteCharAt() 
		stb1.deleteCharAt(1);
		System.out.println(stb1);//A JavaXY
		
		//How to use reverse()
		//If they ask you "How to reverse a String?"
		//Tell them which one do you want reverse() in StringBuilder class
		//or loops? They will tell you use loops then start to type loops codes		
        stb1.reverse();
        System.out.println(stb1);// YXavaJ A
        
        //Difference between length() and capacity()
        //capacity() method returns the number of reserved area in memory
        //length() method returns the number of characters in a String
        StringBuilder stb2 = new StringBuilder(9);
        stb2.append("abcd");
        System.out.println(stb2.capacity());//9
        System.out.println(stb2.length());//4
        
        //How to use setCharAt()
        stb2.setCharAt(1, 'X');
        System.out.println(stb2);//aXcd

	}

}
