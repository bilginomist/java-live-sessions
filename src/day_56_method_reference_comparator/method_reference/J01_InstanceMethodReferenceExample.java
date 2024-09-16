package day_56_method_reference_comparator.method_reference;

import java.util.function.Supplier;

public class J01_InstanceMethodReferenceExample {


    public static void main(String[] args) {


        String message="hello world";
                                    //lambda expression
        Supplier<String> withLambda=()->message.toUpperCase();

        System.out.println(withLambda.get());


        String name="adam";

        Supplier<String> withMethodReference=name::toUpperCase;

        System.out.println("withMethodReference.get() = " + withMethodReference.get());


    }
}
