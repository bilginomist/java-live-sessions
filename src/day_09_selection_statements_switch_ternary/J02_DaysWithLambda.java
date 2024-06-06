package day_09_selection_statements_switch_ternary;

public class J02_DaysWithLambda {

    public static void main(String[] args) {
        int dayNumber = 1;


       final int DAY1=1;
       final int DAY2=2;
       final int DAY3=3;
       final int DAY4=4;
/*
        switch (dayNumber) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Salı");
                break;

            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu tatil");
                break;

            default:
                System.out.println("Hatalı sayı girdiniz");

        }

 */

        switch (dayNumber) {

            case DAY1 -> {
                System.out.println("Monday");

            }

            case DAY2 -> {
                System.out.println("Salı");

            }


            case 3 -> {
                System.out.println("Wednesday");

            }

            case 4 -> {
                System.out.println("Thursday");

            }

            case 5 -> {
                System.out.println("Friday");

            }

            case 6, 7 -> {
                System.out.println("Hafta sonu tatil");

            }


            default -> {
                System.out.println("Hatalı sayı girdiniz");
            }

        }


    }
}
