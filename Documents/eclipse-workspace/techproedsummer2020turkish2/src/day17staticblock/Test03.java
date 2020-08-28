package day17staticblock;

public class Test03 {
	static int i;   
    static { 
        i = 10;
        System.out.println("Static block");
    } 
    Test03(){
    	System.out.println("Constructor");
    }
    public static void main(String args[]) { 
    	Test03 t1 = new Test03();
    	Test03 t2 = new Test03();
        System.out.println(Test03.i);  
    } 
}
