package day_28_array_part_1;

public class J02_ArrayLength {


    public static void main(String[] args) {

                       //0  1  2  3  4  5  6  7  8
        int[] numbers = {1, 2, 3, 5, 7, 8, 0, 9, 3}; //9

        int numberOfElement = numbers.length;

        int lastIndex=numberOfElement-1;

       // System.out.println(numberOfElement);


        //System.out.println(numbers[lastIndex]);


        for (int i = 0; i <numbers.length; i++) {

            System.out.println(numbers[i]);
        }




    }
}
