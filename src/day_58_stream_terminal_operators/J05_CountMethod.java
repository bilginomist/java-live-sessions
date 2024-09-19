package day_58_stream_terminal_operators;

import java.util.Arrays;
import java.util.List;

public class J05_CountMethod {

    public static void main(String[] args) {

        List<String> names= Arrays.asList("Salih",
                "Arif",
                "Samet",
                "Betül",
                "Merve",
                "Sami",
                "Ali");


        //baş harfi S olanlar çıksın

        //son harfi i olanlar çıksın

      long result=  names.stream()
                .filter(k->!k.startsWith("S"))
                .filter(name->!name.endsWith("i"))
                .count();

        System.out.println(result);







    }
}
