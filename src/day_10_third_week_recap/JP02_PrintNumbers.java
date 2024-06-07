package day_10_third_week_recap;

public class JP02_PrintNumbers {


    public static void main(String[] args) {

        /*
        123
        Yüzyirmiüç                                  

        143

        234

         */
        int number=334;


        int birler=number%10;

        int yuzler=number/100;

        int onlar=number/10%10;


        switch (yuzler){

            case 1:
                System.out.print("Yüz ");
            break;
            case 2:
                System.out.print("İkiyüz ");
            break;
            case 3:
                System.out.print("Üçyüz ");
               break;

        }


        switch (onlar){
            case 1:
                System.out.print("on ");
            break;

            case 2:
                System.out.print("yirmi ");
                break;

            case 3:
                System.out.print("otuz ");
                break;
            case 4:
                System.out.print("kırk ");
            break;

        }


        switch (birler){

            case 1:
                System.out.print("bir");
                break;
            case 2:
                System.out.print("iki");
            break;
            case 3:
                System.out.print("üç");
                break;

            case 4:
                System.out.print("dört");
                break;
            case 5:
                System.out.print("beş");

        }












    }
}
