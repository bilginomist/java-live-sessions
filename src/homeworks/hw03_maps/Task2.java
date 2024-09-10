package homeworks.hw03_maps;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {


        List<List<Integer>> lists = new ArrayList<>();

        lists.add(Arrays.asList(1, 4, 5));
        lists.add(Arrays.asList(1, 4, 3));
        lists.add(Arrays.asList(2, 6));


        System.out.println(lists);

        List<Integer> newList = new ArrayList<>();
        for (List<Integer> eachList : lists) {

            // System.out.println(eachList);

            for (Integer each : eachList) {
                // System.out.println(each);
                newList.add(each);
            }
        }

        Collections.sort(newList);
        System.out.println(newList);

    }
}
