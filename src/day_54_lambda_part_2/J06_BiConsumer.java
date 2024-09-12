package day_54_lambda_part_2;

import java.util.function.BiConsumer;

public class J06_BiConsumer {

    public static void main(String[] args) {
        BiConsumer<String,String> printFullName=(k,l)-> System.out.println(k+ " " + l);

        printFullName.accept("Mustafa","Kılıç");


        BiConsumer<Integer,Integer> printTotal=(k,l)-> System.out.println(k+l);

        printTotal.accept(4,5);

        BiConsumer<Integer,Integer> findRemainder=(k,l)-> System.out.println(k%l);

        findRemainder.accept(12,5);


    }
}
