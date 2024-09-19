package day_58_stream_terminal_operators.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class J06_PartitioningByMethod {

    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8);


   Map<Boolean,List<Integer>> map=numbers.stream()
                .collect(Collectors.partitioningBy(k->k%2==0));

        System.out.println(map);

        System.out.println(map.get(true));
        System.out.println(map.get(false));


    }
}
