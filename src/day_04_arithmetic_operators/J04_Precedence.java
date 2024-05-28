package day_04_arithmetic_operators;

public class J04_Precedence {

    public static void main(String[] args) {
        System.out.println(5 + 4); //9

        System.out.println(5 + 4 * 5); //25
        /*
        5 + 4 * 5
        5 + 20
        25


         */

        System.out.println(5 + 4 - 3); // 6

        /*
        5 + 4 - 3

        9 - 3

        6
         */

        /*
        5 + 4 * 5
        5 + 20
        25


         */

        System.out.println(5 - 3 % 2); // 4

        /*
        5 - 3 % 2
        5 - 1
        4
         */


        System.out.println((3 + 3) - 5 * 2);

        /*
        (3 + 3) - 5 * 2

        6 - 5 * 2
        6 - 10
        -4





         */





    }


}

