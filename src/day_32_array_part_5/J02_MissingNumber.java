package day_32_array_part_5;

import java.util.Arrays;

public class J02_MissingNumber {

    public static void main(String[] args) {
        //0 1 2 3 4 5 6 7 8

        //0 1 3 2 5 6 9 8 7
        //0 1 2 3 5 6 7 8 9

        int[] array={0,1};

        Arrays.sort(array);

        /*
        for (int i = 0; i < array.length; i++) {

            if (i!=array[i]){
                System.out.println(i);
                break;
            }
        }

         */

        boolean ifeGirdi=false;
               //array.length-2
        for (int i = 0; i < array.length-1; i++) {

            int current=array[i];//a.length-1
            int next=array[i+1]; //a.length
                           //array.length
            if (next-current!=1){
                System.out.println(current+1);
                ifeGirdi=true;
                break;
            }



        }

        if (!ifeGirdi){
            System.out.println(array[array.length-1]+1);
        }

        System.out.println(ifeGirdi);


    }
}
