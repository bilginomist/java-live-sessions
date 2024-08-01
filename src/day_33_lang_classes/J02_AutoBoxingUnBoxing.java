package day_33_lang_classes;

public class J02_AutoBoxingUnBoxing {


    public static void main(String[] args) {

        //Autoboxing
        int a = 10;
        //  INTEGER   <---int
        Integer wrapperA = a;  //10


        long b=20;
                          //long
       // Integer wrapperB=b;  //kendi wrapper classına dönüşebilir
        Long wrapperB=b;


        //Unboxing

        Integer w=12;
     // int <----   INTEGER
        int   i=     w;

        long c=w;

        short s=(short) i;

    }
}
