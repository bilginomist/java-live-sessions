package day_13_branching_statements;

public class J01_Break {


    public static void main(String[] args) {


        int aranan=5;

        for (int sayi = 0; sayi <10 ; sayi++) {
            System.out.println(sayi);

            if (sayi==aranan){

                System.out.println("Buldun devam etmene gerek yok");

                break;
            }
        }




    }
}
