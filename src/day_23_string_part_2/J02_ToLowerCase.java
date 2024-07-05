package day_23_string_part_2;

import java.util.Locale;

public class J02_ToLowerCase {


    public static void main(String[] args) {

        String day="WednESdaY";


              //camel case
        day=day.toLowerCase();

        switch (day){

            case "monday":
                System.out.println(1);
                break;


            case "wednesday":
                System.out.println(3);
                break;

        }


        String sentence="ali ata bak";

        String word="ATa";


    }
}
