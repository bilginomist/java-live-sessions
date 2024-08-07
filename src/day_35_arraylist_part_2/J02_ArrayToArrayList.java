package day_35_arraylist_part_2;

import java.util.ArrayList;
import java.util.Arrays;

public class J02_ArrayToArrayList {

    public static void main(String[] args) {

        String[] food={"Peynir","Kiraz","Elma","Ekmek"};

        ArrayList<String> list=new ArrayList<>(Arrays.asList(food));
        list.add("Brokoli");
/*
        for (String each:food){
            list.add(each);
        }


 */
        System.out.println("list = " + list);

        String[] array2=new  String[list.size()];

        for (int i = 0; i < array2.length; i++) {

            array2[i]=list.get(i);
        }

        System.out.println(Arrays.toString(array2));







    }
}
