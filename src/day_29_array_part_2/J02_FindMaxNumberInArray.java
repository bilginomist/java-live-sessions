package day_29_array_part_2;

import java.util.Arrays;

public class J02_FindMaxNumberInArray {

    /*
    Verilen dizi içersindeki maximum değeri dönen bir method yazınız.
     */

    public static void main(String[] args) {

        int[] numbers = {3, 5, 6, 7, 9, 13,8,4};


        int result = findMax1(numbers);

        System.out.println("result = " + result);

    }

    public static int findMax(int[] numbers) {

        int max = numbers[0];


        for (int number : numbers) {

            if (number > max) {

                max = number;
            }
        }

        return max;

    }

    public static int findMax1(int[] numbers){  //3, 5, 6, 7, 9, 13,8,4
        Arrays.sort(numbers); //3 4 5 6 7 8 9 13
                  //13


      return   numbers[numbers.length-1];




    }
}
