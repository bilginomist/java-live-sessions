package day_31_array_part_4;

import java.util.Arrays;

public class J05_ShiftZeros {

    public static void main(String[] args) {
        int[] input={0,1,0,3,12};


        int[] newArray=new int[input.length];
        System.out.println(Arrays.toString(newArray));

        int index=0;
        for (int each : input) {

            if (each!=0){
                newArray[index++]=each;

            }


        }


        System.out.println(Arrays.toString(newArray));


    }
}
