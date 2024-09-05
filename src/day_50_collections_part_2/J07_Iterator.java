package day_50_collections_part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class J07_Iterator {

    public static void main(String[] args) {


        List<Integer> numbers=new ArrayList<>(
         Arrays.asList(1,3,23,23,2,32,23,24,5,67,4,9,0,45)
        );


        /*
        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i)<20){
                numbers.remove(i);
            }
        }
*/


       // numbers.removeIf(k->k<20);


     Iterator<Integer> it= numbers.iterator();

     while (it.hasNext()){

         if (it.next()<20){
             it.remove();
         }
     }


        System.out.println("numbers = " + numbers);
    }
}
