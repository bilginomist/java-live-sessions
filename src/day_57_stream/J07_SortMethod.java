package day_57_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class J07_SortMethod {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 5, 4, 2, 6, 3);
        List<Integer> sortedList = list.stream()
                //.sorted()  //küçükten büyüğe sıralar
                .sorted(Comparator.reverseOrder()) //büyükten küçüğe sıralar
                .toList();


        System.out.println(sortedList);
    }
}
