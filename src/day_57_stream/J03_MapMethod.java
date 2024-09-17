package day_57_stream;

import java.util.Arrays;
import java.util.List;

public class J03_MapMethod {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ahmet", "Mehmet", "Saffet");

        List<String> upperList = list.stream()
                //.map(k -> k.toUpperCase())
                .map(String::toUpperCase) // AHMET , MEHMET , SAFFET
                .toList();


        System.out.println(upperList);
    }
}
