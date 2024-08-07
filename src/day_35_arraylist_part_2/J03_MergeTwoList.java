package day_35_arraylist_part_2;

import java.util.ArrayList;
import java.util.Arrays;

public class J03_MergeTwoList {

    public static void main(String[] args) {


        ArrayList<String> list1=new ArrayList<>(Arrays.asList("A","B","C"));
        ArrayList<String> list2=new ArrayList<>(Arrays.asList("D","E","F"));

        ArrayList<String> merged=new ArrayList<>(list1);

        merged.addAll(list2);

        System.out.println(merged);






    }
}
