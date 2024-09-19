package day_58_stream_terminal_operators.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class J02_ToSetMethod {

    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(2,3,4,5,6,2,8,4,6);

        Set<Integer> collect = numbers.stream()
                .filter(k -> k % 2 == 0) //2 4 6 2 8 4 6
                .collect(Collectors.toSet());

        System.out.println(collect);


    }
}
