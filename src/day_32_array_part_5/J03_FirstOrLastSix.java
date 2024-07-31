package day_32_array_part_5;

public class J03_FirstOrLastSix {

    public static void main(String[] args) {

        int[] input={1,2,6}; //true



        boolean result=  isFirstOrLastSix(input);

        System.out.println("result = " + result);

    }

    public static boolean isFirstOrLastSix(int[] input) {
    /*
        boolean sonuc=input[0]==6 || input[input.length-1]==6;

        return sonuc;

     */

        return input[0]==6 || input[input.length-1]==6;

    }
}
