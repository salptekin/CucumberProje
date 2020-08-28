package day34collections;

import java.util.LinkedList;

public class Li01 {

	public static void main(String[] args) {
		//LinkedList elemanlari giris sirasina(insertion order) gore siralar
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Veli");
		linkedList.add("Aliye");
		linkedList.add("Burhan");
		linkedList.add("Canan");
		linkedList.add("Kemal");
		linkedList.add("Reyhane");
		System.out.println(linkedList);
		
		LinkedList<String> linkedList2 = new LinkedList<>();
		linkedList2.add("XXXX");
		linkedList2.add("YYYY");
		linkedList2.add("ZZZZ");
		System.out.println(linkedList2);
		
		linkedList.add(1, "Cemal");
		System.out.println(linkedList);
		
		linkedList.addFirst("Kayahan");
		System.out.println(linkedList);
		
		linkedList.addLast("Ayse");
		System.out.println(linkedList);
		
		//addAll() kullandiginizda ilk list degisir, parantezin icindeki list degismez
		linkedList.addAll(linkedList2);
		System.out.println(linkedList);
		
		linkedList.addAll(5, linkedList2);
		System.out.println(linkedList);
		
		linkedList.remove();//ilk elemani siler
		System.out.println(linkedList);
		
		linkedList.remove(1);//Index'i 1 olani siler
		System.out.println(linkedList);
		
		linkedList.remove("Canan");//Olmayan elemani sil dersek error vermez ve silme yapamaz
		System.out.println(linkedList);
		
		linkedList.remove("YYYY");//Tekrarli elemanlardan ilkini siler
		System.out.println(linkedList);//[Veli, Aliye, Burhan, XXXX, ZZZZ, Kemal, Reyhane, Ayse, XXXX, YYYY, ZZZZ]
		
		linkedList.removeFirstOccurrence("ZZZZ");
		System.out.println(linkedList);//[Veli, Aliye, Burhan, XXXX, Kemal, Reyhane, Ayse, XXXX, YYYY, ZZZZ]
		
		linkedList.removeLastOccurrence("XXXX");
		System.out.println(linkedList);//[Veli, Aliye, Burhan, XXXX, Kemal, Reyhane, Ayse, YYYY, ZZZZ]
		
		linkedList.removeAll(linkedList2);//linkedList2'de var olan elemanlarin tamamini list'den siler
		System.out.println(linkedList);
		
		linkedList.removeFirst();
		System.out.println(linkedList);
		
		linkedList.removeLast();
		System.out.println(linkedList);
				
		linkedList.removeIf(t->t.contains("a"));
		System.out.println(linkedList.size());

	}

}
