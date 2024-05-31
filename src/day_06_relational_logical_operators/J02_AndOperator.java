package day_06_relational_logical_operators;

public class J02_AndOperator {

    public static void main(String[] args) {

        boolean isGreaterThan18=false;  //18 den büyük mü
        boolean isMale=false;           //erkek mi

                      //18 den büyük   ve erkek  ===> askerlik yapabilir true
        System.out.println(isGreaterThan18 && isMale);


        //iki and && ve tek and & farkı
        /*

        iki and kullanıldığı zaman ilkte false görürse diğer koşullar kontrol edilmez çünkü sonuç zaten false olur.
        tek and kullanıldığı zaman tüm koşullar kontrole edilir


         */

        int a=10;

        System.out.println(false & a++>10 & true & true); //anın değeri 1 artar
        System.out.println(false && a++>10 & true & true); //a nın dğeri değişmez


        /*

        false and false and false and false


         */
        System.out.println(a);

        /*

        true && true =treu
        true & true =true


        false && true =false

        false & true =false


        true && false=false
        true & false =false


         */






    }
}
