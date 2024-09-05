package day_50_collections_part_2;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class J01_ListVector {

    public static void main(String[] args) {

        Vector<String> list=new Vector<>();
        list.addAll(Arrays.asList("A","B","C",null));

        System.out.println(list);

       // System.out.println("list.get(0) = " + list.get(5));

        list.remove("A");

        System.out.println(list);

    }
}
