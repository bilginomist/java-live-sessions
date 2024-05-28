package day_02_variables_data_types;
              //Birleştirme
public class J06_Concatenation {


    public static void main(String[] args) {

        String name="Berat";

        System.out.println("Hello " +name);


        System.out.println("Fatih " + " Yusuf");

        System.out.println("Fatih " + 23);

        System.out.println("Fatih" + 1 + 2);
        /*
        Fatih + 1 + 2
        Fatih1 + 2
        Fatih12


         */

        System.out.println(1+2+"Fatih");
        /*


        1 + 2 + Fatih
        3+Fatih
        3Fatih

         */


        System.out.println(1+"Fatih" + 2);

        /*
        1 + Fatih + 2
        1Fatih +2
        1Fatih2


         */




        /*
        concat
        string +string
        string +sayı
===================================

        sayı+sayı addditon





         */


        System.out.println("Fatih" + (1+2));

        String name1="Sami";
        String name2="Arif";

        String birlesmis=name1+"\t"+name2;

        System.out.println(birlesmis);


    }
}
