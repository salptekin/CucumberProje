package day25encapsulation;

public class E02 {

	public static void main(String[] args) {
		
        E01 obj = new E01();
        System.out.println(obj.getSifre());//123456
        System.out.println(obj.getIsim());//Ali Can
        System.out.println(obj.getCh());//A
        
        obj.setSifre(98765);
        System.out.println(obj.getSifre());//98765
        
        obj.setCh('Z');
        System.out.println(obj.getCh());//Z
        
        obj.setIsim("Veli Kan");
        System.out.println(obj.getIsim());//Veli Kan
        
        
        E03 ob = new E03();
        System.out.println(ob.getIsim());//Kemal Dogru
        System.out.println(ob.getYas());//23
        
        ob.setBorc(2300.24f);//Borc degistirildi ama okuyamiyorum cunku getter yok 
        
        ob.setYas((byte) 25);
        System.out.println(ob.getYas());//25   
	}

}
