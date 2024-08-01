package day_33_lang_classes;

import java.util.Random;

public class J06_Math {

    public static void main(String[] args) {

        System.out.println(Math.max(100, 120));

        System.out.println(Math.min(100, 120));

        //mutlak değer yani eksi olan ifadenin pozitif değerini veren
        System.out.println(Math.abs(-100));

        System.out.println((int)Math.pow(100,3));

        System.out.println(Math.sqrt(25));

        System.out.println(Math.round(4.1));
        System.out.println(Math.round(4.49));

        System.out.println(Math.ceil(12.3));//Yukarı yuvarla
        System.out.println(Math.floor(12.7)); //aşağı yuvarla


        System.out.println((int) (Math.random()*10)); //0 ile 1 arasında random sayı üretir


        System.out.println(Math.PI);
    }
}
