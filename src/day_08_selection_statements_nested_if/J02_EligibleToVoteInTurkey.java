package day_08_selection_statements_nested_if;

public class J02_EligibleToVoteInTurkey {

    public static void main(String[] args) {

        //uyruk belirleme

        String citizenship="Turkey";

        //boolean isTurkish=true;

        //age belirleme

        int age=16;


        //kontrol et türk vatandaşımı

        if (citizenship=="Turkey") {

            // kontrol et 18 den büyük yada eşit mi

            if (age>=18) {

                //print et sen oy kullanabilirsin

                System.out.println("Oy kullanabilirsin");

            }
            //eğer 18 den büyük yada eşit değilse

            else {
                // yaş dolaysıyla oy kullanamazsın

                System.out.println("Yaş dolayısıyla oy kullanamazsın");

            }
        }else {
            //eğer tük vatandaşı değil ise

            //oy kullanamazsın çünkü türk vatandaşı değilsin

            System.out.println("oy kullanamazsın çünkü türk vatandaşı değilsin");

        }









    }
}
