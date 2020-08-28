package day19encapsulationnt;

class Test01 {	
    public void show() {
       System.out.println("Good");
    }  
}
  
class Derived extends Test01 {
	
		  public static void main(String[] args) {
	         Derived b = new Derived();;
	         b.show();
	      }

          public void move() {
          System.out.println("Bad");
          }
}


