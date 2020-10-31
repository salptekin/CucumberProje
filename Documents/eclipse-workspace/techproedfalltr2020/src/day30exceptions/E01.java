package day30exceptions;

public class E01 {

	/*
	 1)FileNotFoundException, ustunde calisilacak bir dosyaya ulasma ile alakli problemlerde kullanilir.
	   Bir dosyaya ulasmada iki temel problem olabilir; a)Path yanlistir  b)Dosya silinmistir.
	   
	 2)IOException, input ve output ile alakali tum problemlerde kullanilir. 
	   IOException, FileNotFoundException'in yaptigi tum isleri yapabilir. Bu yuzden IOException 
	   kullanildiginda FileNotFoundException'in kullanilmasina gerek yoktur. 
	   IOException FileNotFoundException Class'inin parent class'idir.
	   
	 3)Code yazarken Exception kullanmak zorunda kalirsak iki yol var:
	   a)Add throws declaration ==> Problem olustugunda console'a teknik mesajlar iceren
	                                hata mesaji basar.
	   b)Try-Catch Block ==> Problem olustugunda ekrana ne yazilacagina veya problemle alakali
	                         ne yapilacagina bizim karar vermemize olanak sunar.     
	                         
	 4)"try-catch" kullandiginizda try bolumundeki kod hatasiz calisirsa catch bolumu calismaz.
	   catch bolumu try bolumundeki kod hataliyken devreye girer.
	   
	 5)"try" block'dan sonra 1 veya daha fazla "catch" kullanilabilir. Olusan problem hangi catch ile
	   alakali ise o catch block calisir. Ayni anda sadece 1 catch block calisabilir.
	   
	 6)Aralarinda parent-child iliskisi olan birden fazla catch block kullanirsaniz child olan uste
	   yazilmalidir aksi takdirde CTE alirsiniz.
	   Parent child iliskisi yoksa istediginiz gibi siralayabilirsiniz.   
	   
	 7)try block'dan sonra catch block en az 1 tane kullanilmalidir yoksa CTE alirsiniz.  
	   
	                                                      
	 */
	
}
