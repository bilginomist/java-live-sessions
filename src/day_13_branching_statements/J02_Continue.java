package day_13_branching_statements;

public class J02_Continue {

    public static void main(String[] args) {

        //1 den 1000 kadar aklımda bir tane trek sayı tuttum

        int arananTek=887;

        for (int tahmin = 1; tahmin <=1000; tahmin++) {

            //eğer sayı çift ise tahminimi aranan sayı ile kontrol
            // etme neden çünkü tek say arıyorum
            if (tahmin%2==0) {   //tahmin çift ise

                System.out.println("Bu tahmini atladım söylemiyorum " + tahmin);
                continue;
            }
            System.out.println("Tahminim " + tahmin);
            if (tahmin==arananTek){
                System.out.println("Aradığın sayı:" + tahmin);
                System.out.println("Buldun");
                break;
            }
        }


    }
}
