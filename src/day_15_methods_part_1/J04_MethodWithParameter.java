package day_15_methods_part_1;

public class J04_MethodWithParameter {


    public static void main(String[] args) {

        //create a method for saying 8 is odd or even?

        isEightEvenOrOdd();

        isEvenOrOdd(100);
    }

    public static void isEightEvenOrOdd() {

        if (8 % 2 == 0) {
            System.out.println("8 bir çift saydır");
        } else {
            System.out.println("8 bir çift sayı değildir");
        }

    }


    public static void isEvenOrOdd(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " bir çift saydır");
        } else {
            System.out.println(number + " bir tek saydır");
        }

    }

}
