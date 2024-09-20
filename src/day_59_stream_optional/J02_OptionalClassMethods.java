package day_59_stream_optional;

import java.util.Optional;

public class J02_OptionalClassMethods {

    public static void main(String[] args) {

        String a="adada";
        Optional<String> opt=Optional.of("Sami");

        System.out.println(opt.get());

        System.out.println(opt.isPresent());

        System.out.println(opt.isEmpty());

        opt.ifPresent(k-> System.out.println("if present " +k));

       // Optional<String> opt2=Optional.empty();
        Optional<String> opt2=Optional.of("Adam");

        System.out.println(opt2.isEmpty()); //true

        opt2.ifPresent(k-> System.out.println(k.substring(0)));


        opt2.orElseThrow(()->new IllegalArgumentException("Value not found"));


    }
}
