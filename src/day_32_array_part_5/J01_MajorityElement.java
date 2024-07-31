package day_32_array_part_5;


public class J01_MajorityElement {

    public static void main(String[] args) {

        int[] array={3,2,3,2,2,2,3,3,3};

      int result=  majority(array);

        System.out.println("result= "+result);

    }

    public static int majority(int[] array){

        int major=0;
        for (int each:array){

         int numberOfElement= count(array,each);
            System.out.println(each+ " numberOfElement = " + numberOfElement);

            if (numberOfElement> array.length/2){
               major=each;
               break;
            }

        }

        return major;

    }

    public static int count(int[] array, int aranan) {
        //{3,2,3,5,5,5,5,5,5,6,3,3,3,3,5,5,5,3,3,3}
        int sayac=0;

        for (int each : array) {

            if (aranan==each){
                sayac++;
            }
        }


        return sayac;

    }
}
