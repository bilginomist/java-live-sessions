package day_50_collections_part_2;

import java.util.*;

public class J04_Set {


    public static void main(String[] args) {

        Set<Integer> hashSet=new HashSet<>();

        hashSet.add(1);
        hashSet.addAll(Arrays.asList(5,2,3,4,5,6,2,10,2,2,2,-1,-2,-5,null));

        System.out.println(hashSet);


        Set<String>  linkedHashSet=new LinkedHashSet<>();

        linkedHashSet.add("A");
        linkedHashSet.add("L");
        linkedHashSet.add("K");
        linkedHashSet.add("C");
        linkedHashSet.add("B");
        linkedHashSet.add("K");
        linkedHashSet.add(null);

        System.out.println("linkedHashSet = " + linkedHashSet);

       /// Set<String> letters=new TreeSet<>();
        Set<String> letters=new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        //letters.add(null);

        letters.add("a");
        letters.add("B");
        letters.add("C");
        letters.add("c");
        letters.add("X");
        System.out.println(letters);


    }
}
