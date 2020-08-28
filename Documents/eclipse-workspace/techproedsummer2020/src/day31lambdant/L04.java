package day31lambdant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class L04 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Ali");
		list.add("Tucker");
        System.out.println(list);
        
        //Print all elements in reverse order, in upper case, in a list
        List<String> list2 = list.stream()
        						 .sorted(Comparator.reverseOrder())
        						 .map(String::toUpperCase)
                                 .collect(Collectors.toList());
        System.out.println(list2);//[TUCKER, MARK, JACKSON, AMANDA, ALI, ALI]
        
        //Print all elements whose lengths are less than 5, in natural order, in a Set
        //1.Way
        System.out.println(list.stream()
            				   .filter(t->t.length()<5)
            				   .sorted()
            				   .collect(Collectors.toSet()));//If you use toSet() ==> No duplication
        //2.Way
        list.removeIf(t->t.length()>=5);
        System.out.println(list.stream()
                               .sorted()
                               .collect(Collectors.toSet()));//[Mark, Ali]
        
        System.out.println(list);//[Ali, Mark, Ali]

	}

}
