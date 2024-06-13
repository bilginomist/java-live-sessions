package day_13_branching_statements;

public class J06_MultiplyWithAddition {


    public static void main(String[] args) {

        /*

        5 * 7
         */

        //num 1 değişkine tanımla
        int num1=5;
        //num2 değişkeni tanımla
        int num2=7;


        int sonuc=0;

/*
        sonuc=sonuc+num1; //5

        sonuc=sonuc+num1; //10

        sonuc=sonuc+num1; //15
        sonuc=sonuc+num1; //15
        sonuc=sonuc+num1; //15
        sonuc=sonuc+num1; //15
        sonuc=sonuc+num1; //15
*/


        for (int i = 1; i <=num2 ; i++) {
            sonuc=sonuc+num1;

        }

        System.out.println("sonuc = " + sonuc);



    }
}
