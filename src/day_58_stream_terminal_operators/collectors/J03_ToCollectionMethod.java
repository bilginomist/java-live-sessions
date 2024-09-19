package day_58_stream_terminal_operators.collectors;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class J03_ToCollectionMethod {

    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(2,3,4,5,6,2,8,4,6);

        Queue<Integer> collect = numbers.stream()
                .collect(Collectors.toCollection(LinkedList::new));


        System.out.println(collect);



    }
}
