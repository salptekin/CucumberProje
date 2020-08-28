package day17staticblock;

public class Test04 {   
    static { 
        System.out.println("Iyi");
    } 
    Test04(){
    	System.out.println("Cirkin");
    }
    static { 
        System.out.println("Kotu");
    } 
    public static void main(String args[]) { 
    	Test04 t1 = new Test04();
        System.out.println("Berbat");  
    } 
}
