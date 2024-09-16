package day_56_method_reference_comparator.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class J01_SortList {


    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>(Arrays.asList(4,6,3,2,5,9));

        System.out.println("sıralamadan önce " +list);

        Collections.sort(list);

        System.out.println("sıralamadan sonra " +list);

    }
}
