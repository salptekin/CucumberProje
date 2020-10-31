package day29overriding;

public class A extends B{ 
	int age = 11;
    public static String sing(){ 
        return "fa"; 
    } 
    public static void main(String[] args){ 
        A a = new A(); 
        B b = new A(); 
        System.out.println(a.sing() + " " + b.sing()); 
        System.out.println(a.age + " " + b.age); 
    } 
} 
class B { 
	int age = 12;
    public static String sing(){ 
        return "la"; 
    } 
} 
