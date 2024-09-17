package day_57_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class J09_LimitMethod {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list1 = list.stream() //123456
                .sorted(Comparator.reverseOrder()) //654321
                .limit(3) //654
                //.sorted() //456
                .toList();
        System.out.println(list1);
    }
}
