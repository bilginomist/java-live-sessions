package day_28_array_part_1;

public class J03_ArrayLengthExampleReverse {


    public static void main(String[] args) {

        int[] original={1,2,3,4,5,6,7};

        for (int i = original.length-1; i>=0 ; i--) {
            System.out.println(original[i]);
        }


    }
}
