package day_07_selection_statements_if_if_else;

public class J04_IfElse {

    public static void main(String[] args) {


        /*girlien numara eğer 0 dan büyük ise pozitif yazdır
         değil ise negatif yazdır

         */
        int numara = 5;
        //ya true yada false
        boolean isGraterThanZero = numara > 0;

        if (isGraterThanZero) {

            System.out.println("pozitif");

        }  else {
            System.out.println("negatif");
        }




    }
}
