package day_31_array_part_4;

public class J03_MultipleWords {

    /*

     Task 3 :    Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer"

        output : wooden spoons
                 trash can
                 dish washer
     */

    public static void main(String[] args) {
        String words="knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

        String[] wordArray=words.split(", ");
        /*
        knife
        wooden spoons //içinde boşluk //bir boşluk
        plates
        cups
        forks
        pan
        pot
        trash can  //içinde boşluk //bir boşluk
        fridge
        dish washer //içinde boşluk //bir boşluk

         */

        for (String each : wordArray) {

            /*
            if (each.contains(" ")){
                System.out.println(each);
            }

             */


            if (each.split(" ").length>1){
                System.out.println(each);
            }
        }

        String str="a b c d";

    }
}
