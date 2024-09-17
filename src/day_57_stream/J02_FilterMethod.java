package day_57_stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class J02_FilterMethod {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Predicate<Integer> filterEven=k->k%2==0;

        Stream<Integer> integerStream = list.stream();

        List<Integer> evenNumbers = integerStream
                //list.stream()
                .filter(filterEven)
                //.filter(k->k%2==0) //2 ,4 ,6, 8
                .toList();

        System.out.println(evenNumbers);


    }
}
