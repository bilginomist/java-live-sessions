package day_57_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class J08_SkipMethod {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> list1 = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(2).toList();

        System.out.println(list1);

    }
}
