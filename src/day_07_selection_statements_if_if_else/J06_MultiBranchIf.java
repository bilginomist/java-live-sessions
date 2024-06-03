package day_07_selection_statements_if_if_else;

public class J06_MultiBranchIf {


    public static void main(String[] args) {

        /*
        bir numara alacağız
        eğer bu numara 0 a eşit ise nötr yazdır
        eğer bu numara 0 dan büyükse pozitif
        değilse negatf yazdır


         */

        int number=-5;

        if (number==0){
            System.out.println("nötr");


        }else if (number>0){
            System.out.println("pozitif");

        }else {
            System.out.println("negatif");
        }
        /*
        if (number>0){
            System.out.println("pozitif");
        } else if (number<0) {
            System.out.println("negatif");
        }else {
            System.out.println("nötr");
        }

         */


    }
}
