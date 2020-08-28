package day18statickeyworddt;

public class StaticKeyword01 {
	
	static int i = 12;	
	int k = 13;

	public static void main(String[] args) {
		//Number of non-static variables is equal to the
		//number of objects which you created

		//Static variables are attached to the class
		//because of that other name of the static variables
		//is "class variables".
		
		//Non-static variables(instance variables) are attached to 
		//objects because of that their other name is "object variable"
		
		//If you want to access to a static variable no need to create an object
		//If you want to access to a non-static variable you have to create an object
	}
	
	public void increment() {
		i++;
		k++;
	}

}
