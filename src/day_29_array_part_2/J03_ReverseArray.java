package day_29_array_part_2;

import java.util.Arrays;

public class J03_ReverseArray {

    /*
    Verilen diziyi ters döndürüp geriye döndüren bir method yazınız.

-Method overloading ile int , double , String data tiplerinide kapsayınız.
     */


    public static void main(String[] args) {


        int[] numbers={1,2,3,4,5};
        String[] names={"merve","sami","harun","serhat"};

      int[] result=  reverseArray(numbers);
     String[] results= reverseArray(names);

        System.out.println(Arrays.toString(result));

        System.out.println(Arrays.toString(results));

    }

    public static int[] reverseArray(int[] numbers) {

        int[] newArray=new int[numbers.length];

        int index=0;


        for (int i = numbers.length - 1; i >= 0; i--) {

            newArray[index++]=numbers[i];

        }


        return newArray;
    }

    public static String[] reverseArray(String[] numbers) {

        String[] newArray=new String[numbers.length];

        int index=0;


        for (int i = numbers.length - 1; i >= 0; i--) {

            newArray[index++]=numbers[i];

        }


        return newArray;
    }

    public static double[] reverseArray(double[] numbers) {

        double[] newArray=new double[numbers.length];

        int index=0;


        for (int i = numbers.length - 1; i >= 0; i--) {

            newArray[index++]=numbers[i];

        }


        return newArray;
    }
}
