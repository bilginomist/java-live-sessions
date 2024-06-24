package day_17_method_overloading;

public class J01_MethodOverloadingIntro {


    public static void main(String[] args) {

        //bir method lazım hangi numara tipni verirsem vereyim  onu ekrana yazdırsın

        display(5);

        display(10.0);

        display("Adam");

        display('c');


        sum(2,3);
        sum(2,3,4);



        sum(2,2.5);

        sum(2.3,2);

    }

    public static void sum(int number1,double number2){
        System.out.println(number1+number2);
    }
    public static void sum(double number1,int number2){
        System.out.println(number1+number2);
    }


    public static void sum(int number1,int number2){
        System.out.println(number1+number2);
    }

    public static void sum(int number1,int number2,int number3){
        System.out.println(number3+number2+number1);
    }



    public static void display(int number){

        System.out.println("First Method");
        System.out.println(number);
    }



    public static void display(double number){


        System.out.println("Second Method");
        System.out.println(number);
    }
    public static void display(String value){

        System.out.println("Third Method");
        System.out.println(value);
    }
    public static void display(char ch){

        System.out.println("Fourth Method");
        System.out.println(ch);
    }


}
