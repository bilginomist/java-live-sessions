package day_50_collections_part_2;

import java.util.*;

public class J05_ListSetPractice {

    public static void main(String[] args) {

        List<String> names=new ArrayList<>();

        names.addAll(Arrays.asList(
                "Ali",
                "Merve",
                "Yusuf",
                "Mehmet",
                "Serhat",
                "Ahmet",
                "Ahmet",
                "Merve"

        ));

        Set<String> uniqueNames=new HashSet<>(names);
        System.out.println("uniqueNames = " + uniqueNames);


        List<Integer> numbers=
                new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));



        Set<Integer> unique=new HashSet<>(numbers);


        System.out.println(numbers.size()==unique.size());


    }
}
