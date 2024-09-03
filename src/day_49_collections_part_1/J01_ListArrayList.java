package day_49_collections_part_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J01_ListArrayList {


    public static void main(String[] args) {

        //polymorphism  Solda Baba sağda çocuk
        List<String> list=new ArrayList<>();

        list.add("Adam");

        list.addAll(Arrays.asList("A","B"));


        System.out.println(list);


        System.out.println("list.get(0) = " + list.get(0));

        list.add("Adam");

        list.add(null);

        System.out.println(list);


        //Arrays.asList

        //Günlerde kullanılabilir
        List<String> list1 = Arrays.asList("A", "B", "C");

        System.out.println("list1 = " + list1);
        //We can not modify list after creating
        //list1.add("D");

        System.out.println("list1 = " + list1);


        //null değer koyamayız
        List<String> strings = List.of("A", "B", "C");

        System.out.println(strings);

        //strings.add("D");
       // System.out.println(strings);
    }
}
