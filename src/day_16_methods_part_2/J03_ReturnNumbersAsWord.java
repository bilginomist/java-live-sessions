package day_16_methods_part_2;

public class J03_ReturnNumbersAsWord {


    public static void main(String[] args) {

        /*
        bize bir method lazım
        convertNumberToWord(5) -- > "Five" döndür (yazdır)-->sout
        convertNumberToWord(4) -- > "Four" döndür  (yazdır)-->sout
         */

     String result=   convertNumberToWord2(4);

        System.out.println(result);

    }

    public static String convertNumberToWord(int number){

        if (number==5){
            return "Beş";
        } else if (number==4) {
            return "Dört";
        } else if (number==3) {
            return "Üç";
        } else if (number==2) {
            return "İki";
        } else if (number==1) {
            return "Bir";
        }else {
            return "Hatalı numara";
        }


    }

    public static String convertNumberToWord2(int number){

         switch (number){

            case 1:
                return "One";
              //  break; //gerek yok
            case 2:
                return "Two";

            case 3:
              return "Three";

            case 4:
                return "Four";
            case 5:
                return "Five";
            default:
                return "invalid number";

        }



    }




}
