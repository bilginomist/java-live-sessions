package day_11_loops_for_loop;

public class J08_SumNumbers {

    public static void main(String[] args) {
        //1 den 10 a kadar olan sayıların toplamı

       // System.out.println(1+2+3+4+5+6+7+8+9+10);

        int kutu=0;

        /*
        kutu=    kutu+i
         1   =   0 + 1
          3   =  1 + 2
              =  3+  3
         */

        for (int i = 1; i <=10 ; i++) {
            kutu=kutu+i;

        }
        System.out.println(kutu);

    }
}
