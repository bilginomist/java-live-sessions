package day_34_arraylist_part_1;


import java.util.ArrayList;
import java.util.Arrays;

public class J01_ArrayListIntro {

    public static void main(String[] args) {

        int[] array = new int[5];

        System.out.println(Arrays.toString(array));

                   //   0   1    2   3
        int[] array2 = {10, 30, 50, 70};

        System.out.println(Arrays.toString(array2));

        int[] array3 = Arrays.copyOf(array2, array2.length + 1);

        array3[4] = 90;

        System.out.println(Arrays.toString(array3));


        System.out.println("----------------ArrayList------------");

        ArrayList<String> arrayList=new ArrayList<>();

        System.out.println(arrayList);

        ArrayList<String> list=new ArrayList<>(Arrays.asList("kiraz","şeftali","erik"));


        System.out.println(list);


        ArrayList<Integer> nums=new ArrayList<>();

        System.out.println(nums);


        ArrayList<Integer> nums2=new ArrayList<>(Arrays.asList(10,20,30,40));

        System.out.println("nums2 = " + nums2);

        for (Integer integer : nums2) {
            System.out.println(integer);
        }



    }
}
