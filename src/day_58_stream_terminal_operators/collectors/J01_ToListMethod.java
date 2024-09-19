package day_58_stream_terminal_operators.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class J01_ToListMethod {


    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7);

        List<Integer> list = numbers.stream()
                .filter(k->k%2==0) //2 ,4 ,6
               // .collect(Collectors.toList());
                .toList();

        System.out.println(list);

    }
}
