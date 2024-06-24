package day_17_method_overloading;

public class J02_CalculateArea {

    public static void main(String[] args) {

     //dairenin alanını hesaplayan method
     //dikdörtgenni alnını hespalyan method
     //karenin alanını hespalayn method
        calculateArea(3); //3.14*r^2

        calculateArea(4,5);
        calculateArea(4,4);
    }

    /**
     *
     * @param radius(yarıçap)
     * darienin alanını hesaplayan method
     */
//yaricap
    public static void calculateArea(double radius){
        System.out.println(3.14* radius*radius);
    }

    /**
     *
     * @param en (en bilgis girilir)
     * @param uzunluk (uzunluk bilgis girilir)
     *                dikdörtgen alanı hesaplanır
     */
    public static void calculateArea(double en,double uzunluk){
        System.out.println(en*uzunluk);








































    }
}
