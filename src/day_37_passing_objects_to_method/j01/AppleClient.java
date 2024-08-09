package day_37_passing_objects_to_method.j01;

public class AppleClient {

    public static void main(String[] args) {

        Apple apple=new Apple();

        System.out.println(apple.color);

         //objenin referransı
        changeColor(apple);

        //değiştikten sonra

        System.out.println(apple.color);


        int a=5;

        System.out.println(a);

        changeA(a);

        System.out.println(a);

    }

    public static void changeA(int a){
        a=10;
    }
    public static void changeColor(Apple obj){

        obj.color="White";
    }
}
