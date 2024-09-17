package day_57_stream;

import java.util.Arrays;
import java.util.List;

public class J06_DistinctMethod {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 2, 3, 6, 3, 4, 5, 5, 6, 8, 7, 4, 3, 3, 3);


        List<Integer> list1 = list.stream().distinct().toList();

        System.out.println(list1);


    }
}
