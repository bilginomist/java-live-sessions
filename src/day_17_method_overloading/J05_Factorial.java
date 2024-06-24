package day_17_method_overloading;

public class J05_Factorial {


    public static void main(String[] args) {


       int sonuc= factorial(-1);

        System.out.println(sonuc);


    }

    /**
     *
     * @param number (faktöriyelini bulmka istediğiniz sayı)
     * @return (sonuc pozitif oalrak döner)
     *
     * eğer sonuc -1 ise istenilen sayının faktöri,yelinin olmadığı anlamına gelir
     */

    public static int factorial(int number){

        if (number<0){
            return -1;
        }

        int sonuc=1;
        if (number ==0 || number==1){
            return 1;
        }else {

            //1*2*3*4*5

            for (int i = 1; i <=number ; i++) {

                sonuc=sonuc*i;
            }

return sonuc;
        }



    }
}
