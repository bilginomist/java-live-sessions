package day_16_methods_part_2;

public class J02_ReturnOddOrEven {

    public static void main(String[] args) {

        //size verilen sayının çift veya tek olduğunu DÖNDÜREN method yazınız
        //returnOddOrEven()

        /*
        returnOddOrEven(5)

        "Tek"

       returnOddOrEven(6)

        "Çift"

         */

   String result=     returnOddOrEven(6);

        System.out.println(result);

       // System.out.println(returnOddOrEven(6));

    }

    public static String returnOddOrEven(int number){

        //bu gelen numara çift ise "Çift" dön

        if (number%2==0){
            return "Çift";
        }else {
            return "Tek";
        }



    }




}
