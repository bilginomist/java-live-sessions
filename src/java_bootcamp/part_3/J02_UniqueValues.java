package java_bootcamp.part_3;

import java.util.*;

public class J02_UniqueValues {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>(
                Arrays.asList("a","d","c","b","k","a")); //6

        Set<String> set=new HashSet<>(list); //5


        System.out.println(list.size()== set.size());
    }
}
