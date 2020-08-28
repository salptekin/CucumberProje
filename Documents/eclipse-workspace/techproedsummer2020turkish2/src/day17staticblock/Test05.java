package day17staticblock;

public class Test05 {
	static { 
        System.out.println("Iyi");
    } 
    Test05(){
    	System.out.println("Cirkin");
    }
    static { 
        System.out.println("Kotu");
    } 
    public static void main(String args[]) { 
    	Test05 t1 = new Test05();
        System.out.println("Berbat"); 
        Test05 t2 = new Test05();
    } 
}
