package day_11_loops_for_loop;

public class J04_CountNumbersWithDifferentRange {


    public static void main(String[] args) {


        //0 dan başlayarak sayıları 100 kadar (dahil) ikişer ikişer yazalım
/*
        System.out.println(0);
        System.out.println(2);
        System.out.println(4);
        System.out.println(6);

 */
                                 //i=i+1
                                 //i+=2
        for (int i = 0; i <= 100; i=i+10) {

            System.out.println(i);
        }



        //2 4 8 16 32 64 128 256 512
                                  //i*=2;
        for (int i = 2; i <=1024; i=i*2) {

            System.out.println(i);
        }

        //20 den geriye doğru sayalım 0 a kadar

        for (int i = 20; i >=0 ; i--) {

            System.out.println(i);
        }




    }
}
