package day_16_methods_part_2;

public class J04_ConvertKmToM {

    public static void main(String[] args) {

        /*

        Bana method lazım görevi
        KM yi Metreye dönüştürecek ve bana DÖNDÜRECEK

        Bana bir method daha lazım
        Gelen SONUC ben CM ye çeviren methoda vereceğim


         */
        int km=2;

     int metre=   convertKmToM(km);
        System.out.println(metre + " m");




       int cm= convertMToCm(metre);

        System.out.println(cm + "cm");
    }

    public static int convertMToCm(int metre){
       /*
        int cm=metre*100;

        return cm;
        */


        return metre*100;



    }

    public static int convertKmToM(int km){

        return  km * 1000;

    }


}
