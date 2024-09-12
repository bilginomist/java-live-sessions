package day_54_lambda_part_2;

import java.util.function.BiFunction;

public class J07_BiFunction {

    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer>  add=(k,l)->k+l;
        System.out.println(add.apply(4, 5));

        System.out.println(Math.pow(3, 4));


        BiFunction<Double,Double,Double> findHyp=(k,l)->Math.sqrt(Math.pow(k,2)+Math.pow(l,2));

        System.out.println(findHyp.apply(3.0, 4.0));






    }
}
