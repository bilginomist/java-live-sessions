package day_03_first_week_recap;

public class JP04_AdditionVsConcatenation {

    public static void main(String[] args) {

        System.out.println(5+5);  //10



        System.out.println("Adam1"+10);

        System.out.println(1+2+"Adam");
        System.out.println(12+"Adam");

        System.out.println("Adam"+"Harun");

        System.out.println(5+"Adam"+5+1);
        /*
        5 + Adam + 5 + 1
        5Adam + 5 + 1
        5Adam5 + 1
        5Adam51


         */

        System.out.println("Adam" + (4+5));
        //Adam9

        System.out.println(5+5+"Adam");

        /*

          5 + 5 + Adam

          10 + Adam

          10Adam



         */


        String on="10";

        System.out.println(5+on);

        /*  10
        5 + on
        number + String
        510


         */


        System.out.println(5+"on");












    }




}
