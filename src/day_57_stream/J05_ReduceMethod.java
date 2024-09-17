package day_57_stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class J05_ReduceMethod {


    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3);

        int sum = list.stream()
                // .reduce(2, (a, b) -> a + b);
                .reduce(Integer::sum).get();

        System.out.println(sum/list.size());


    }
}
