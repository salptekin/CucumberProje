package day22overridingnt;

class Shape{
    public void draw(){
        System.out.println("Shape");
    }   
    public void paint(){
        System.out.println("Shape painted");
    }
}
 
class Circle extends Shape{
    public void draw(){
        System.out.println("Circle");
    }
}
 
class Square extends Shape{
    public void draw(){
        System.out.println("Square");
    }
    public void paint(){
        System.out.println("Square painted");
    }
}

class Main{
	 public static void main(String aga[]){
	        Shape c = new Circle();
	        c.draw();
	        c.paint();
	        Shape s = new Square();
	        s.draw();
	        s.paint();
	        Shape t = new Shape();
	        t.draw();
	        t.paint();
	 }
}
