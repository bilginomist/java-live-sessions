package day_07_selection_statements_if_if_else;

public class J05_EligibleToVote {


    public static void main(String[] args) {

        //doğum yılı için variable oluşturaalcak

        int birtYear =2015;

        //yaş hesaplanacak
        int age=2024- birtYear;



        //yaş 18den büyük veya eşit  ise

        if (age>=18){
            //oy kullanabilir yazacağız
            System.out.println("Oy kullanabilir");


        }    else {    //eğer değilse

            //oy kullanmaz ayzacağız

            System.out.println("oy kullanamaz");
        }























    }
}
