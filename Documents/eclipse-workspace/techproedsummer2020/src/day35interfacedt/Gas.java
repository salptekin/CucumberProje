package day35interfacedt;

/*
  1)interface ==> interface use "extends"
  2)class (abstract or concrete) ==> interface use "implements"
  3)class ==> class use "extends"
  4)interface ==> class: It is not valid. Because parent of an 
    interface must be interface 
 */

public interface Gas extends Engine {
	
	 int price = 1;
	 int x = 13;
	
     void eco();
}
