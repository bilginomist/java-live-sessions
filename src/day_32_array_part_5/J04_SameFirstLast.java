package day_32_array_part_5;

public class J04_SameFirstLast {

    public static void main(String[] args) {

        int[] array1={1,2,3};
        int[] array2={7,3};


      String result= sameFirstLast(array1,array2);

        System.out.println("result = " + result);


    }

    public static String sameFirstLast(int[] array1, int[] array2) {


        if (array1.length<=1){
            return "Array 1 is not valid";
        }

        if (array2.length<=1){
            return "Array 2 is not valid";
        }


        int firstElOfFirstArray=array1[0];
        int lastElOfFirstArray=array1[array1.length-1];

        int firstElOfSecondArray=array2[0];
        int lastElOfSecondArray=array2[array2.length-1];


        if ( firstElOfFirstArray==firstElOfSecondArray ||
             lastElOfFirstArray ==lastElOfSecondArray

        ){
            return "true";
        }else {
            return "false";
        }



    }
}
