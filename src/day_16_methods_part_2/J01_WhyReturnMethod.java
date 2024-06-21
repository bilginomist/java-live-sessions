package day_16_methods_part_2;

public class J01_WhyReturnMethod {

    public static void main(String[] args) {

        //bana bir alet (method) lazım iki tane sayıyı
        // alsın toplamını bana versin

      int result= addTwoNumbersAndReturn(9, 8); //25

        //  System.out.println(result);
        //bana bir alet ( method ) daha lazım buda
        // gelen toplamı istediğim sayı ile çarpacak

        multiplyResultWithAnyNumber(result, 3);

    }




    public static int addTwoNumbersAndReturn(int number1, int number2) {

        return (number1 + number2);

    }





    public static void multiplyResultWithAnyNumber(int result, int number) {

        System.out.println(result * number);
    }




}
