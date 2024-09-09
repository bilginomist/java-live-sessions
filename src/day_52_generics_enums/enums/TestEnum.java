package day_52_generics_enums.enums;

import java.util.Arrays;

public class TestEnum {

    public static void main(String[] args) {

        String day1="PAZARTESİ";

        String day2="SALI";

        System.out.println("day1 = " + day1);
        System.out.println("day2 = " + day2);

        System.out.println(DayOfWeek.day1);
        System.out.println(DayOfWeek.day2);

        String day4=DayOfWeek.day1;
        System.out.println("Day.Çarşamba = " + Day.Çarşamba);


        System.out.println(Arrays.toString(ProjectStatus.values()));

        System.out.println(ProjectStatus.NEW.getValue()); //New

        System.out.println(ProjectStatus.ON_HOLD.getValue());


        Day day=Day.Çarşamba;
        switch (day){

            case Salı :
                System.out.println("Salı");
                break;
            case Çarşamba:
                System.out.println("Çarşmaba");
                break;
            case Pazartesi:



        }




    }
}
