package day_35_arraylist_part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class J04_CollectionsUtility {

    public static void main(String[] args) {
        ArrayList<Integer> numbers=
                new ArrayList<>(Arrays.asList(5,2,6,8,1,8,10,8,8,8,8));

        ArrayList<String> letters=new ArrayList<>(Arrays.asList("A","B","D","C"));
        System.out.println("numbers = " + numbers);

        //ben bu listeyi sort edebilir miyim

        System.out.println(letters);
        Collections.sort(numbers);

        Collections.sort(letters);
        System.out.println("after sort "+numbers);
        System.out.println("after sort "+letters);

                            //ilk bulduğu elemanın indexini   döndürür
       int index= Collections.binarySearch(numbers,8);


        System.out.println(index);


     int max=   Collections.max(numbers);

        System.out.println("max = " + max);
     int min=   Collections.min(numbers);
        System.out.println("min = " + min);

       // Collections.fill(numbers,1000);

        System.out.println(numbers);


        System.out.println("Collections.frequency(numbers,8) = "
                + Collections.frequency(numbers, 8));

        String name="adam";


    }
}
