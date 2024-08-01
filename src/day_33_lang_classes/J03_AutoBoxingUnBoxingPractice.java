package day_33_lang_classes;

import java.util.Arrays;

public class J03_AutoBoxingUnBoxingPractice {
    public static void main(String[] args) {

        Integer[] array=new Integer[5]; //null obke için class için

        System.out.println(Arrays.toString(array));

//Integer        10--->int
        array[0]=10;  //Autoboxing
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;
        System.out.println(Arrays.toString(array));


        for (Integer integer : array) {
          // int  <--- Integer
            int value=integer; //Unboxing
            System.out.println(value);

        }
    }


}
