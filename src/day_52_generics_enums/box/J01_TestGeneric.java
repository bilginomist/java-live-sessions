package day_52_generics_enums.box;

public class J01_TestGeneric {

    public static void main(String[] args) {
        String a="123";

        Integer b=123;

        Box<Integer> integerBox=new Box<>(1223);

        System.out.println("integerBox.getItem() = " + integerBox.getItem());
        Box<String> stringBox=new Box<>("12345");

        Box<Double> doubleBox=new Box<>(123.4);

        System.out.println("doubleBox.getItem() = " + doubleBox.getItem());


    }
}
