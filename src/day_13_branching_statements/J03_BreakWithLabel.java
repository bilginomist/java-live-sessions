package day_13_branching_statements;

public class J03_BreakWithLabel {


    public static void main(String[] args) {

        /*
        1 - A B C D
        2 - A B C D



         */


/*
        System.out.print("1- ");


        for (char i = 'A'; i <'E' ; i++) {
            System.out.print(i + " ");
        }


        System.out.println();
        System.out.print("2- ");


        for (char i = 'A'; i <'E' ; i++) {
            System.out.print(i + " ");
        }


        System.out.println();
        System.out.print("3- ");


        for (char i = 'A'; i <'E' ; i++) {
            System.out.print(i + " ");
        }



 */



        outerloop:
        for (int j = 1; j <=6 ; j++) {

            System.out.print(j+"- ");



            for (char i = 'A'; i <'E' ; i++) {
                System.out.print(i + " ");

               // break;  //sadece bu loop durdur

                break outerloop; //dıştaki ile birlikte durdur
            }



            System.out.println();


        }


    }
}
