package day_09_selection_statements_switch_ternary;

public class J04_TernaryPositiveNegativeNumber {


    public static void main(String[] args) {

        int numara=12;
/*
        String result="";


        if (numara>0){

            result="Positive";
        }else {
            result="Negative";
        }


        System.out.println(result);

 */

                  //   koşul     ?=if        :=else
                  //             ise          değil ise
        String result=(numara>0) ? "Positive" : "Negative";

        //System.out.println("result = " + result);

        System.out.println((numara>0) ? "Positive" : "Negative");

                    // numara büyük 0 ise pozitif  değilde numara eşit 0  ise nötr hiçbiri değilse Negatif
    String result2=    (numara>0)      ?  "Positive" :       (numara==0)  ?  "Nötr"  :             "Negative";

          //                      1            1             2        2

    }
}
