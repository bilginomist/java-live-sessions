package day_04_arithmetic_operators;

public class J05_AdditionVsConcatenation {


    public static void main(String[] args) {

        System.out.println(3 + 5); // 8

        System.out.println(3 + 5 + "Bilginomist" + 3 + 5);
        /*
        3 + 5 + "Bilginomist" + 3 + 5

        8 + "Bilginomist" + 3 + 5

        8Bilginomist + 3 + 5

        8Bilginomist3 + 5
        8Bilginomist35




         */

        System.out.println(3 + 5 + "Bilginomist" + (3 + 5));

        /*
         3 + 5 + Bilginomist + (3 + 5)

         3 + 5 + Bilginomist + 8

          8 + Bilginomist + 8

          8Bilginomist + 8
          8Bilginomist8






         */







    }


}
