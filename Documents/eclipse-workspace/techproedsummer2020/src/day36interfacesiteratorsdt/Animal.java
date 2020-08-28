package day36interfacesiteratorsdt;

public interface Animal {
	
     void eat();
     
     /*
      Normally, we cannot create concrete methods in interfaces but we need it too much
      Java gives us an option to do it by using "default" keyword like in the following
      example.
      */
     //A default method is unique to an instance of the class.
     default void drink() {
    	 System.out.println("Wooow! concrete method in an interface");
     }
       
     //A static method is unique to a class.
     static void run() {
    	 System.out.println("Wooow! second way to create concrete method in an interface");
     }
     
     /*
      When you create concrete methods by using "default" or "static" keywords
      it is not must to override them from concrete child classes
     */
}
