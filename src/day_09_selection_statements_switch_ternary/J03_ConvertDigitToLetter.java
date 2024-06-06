package day_09_selection_statements_switch_ternary;

public class J03_ConvertDigitToLetter {


    public static void main(String[] args) {

        /*

        1 --> Bir
        2 --> İki
        3 --> Üç
         */

        int numara=267;
        int number = numara/100;
        //sonuç
        String result = "";

        switch (number) {

            case 1:

                result = "Bir";
                break;

            case 2:

                result = "İki";

                break;
            case 3:

                result = "Üç";

                break;

            case 4:

                result = "Dört";

                break;


            case 5:

                result = "Beş";

                break;


            case 6:

                result = "Altı";

                break;

            default:
                result = "HATA";

        }

        System.out.println(result);
if (result=="Bir"){
    System.out.println("Yüz");
}else {
    System.out.println(result + "yüz");
}




    }
}
