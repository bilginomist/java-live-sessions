package day_35_arraylist_part_2;

import java.util.ArrayList;

public class J05_ReturnPositions {

    public static void main(String[] args) {
                //position 1    2    3    4    5    6    7    8    9
                  //index  0    1    2    3    4    5    6    7    8
        String[] array = {"A", "B", "C", "A", "D", "D", "B", "C", "A"};

        ArrayList<Integer> positions = returnPositions(array, "A");

        System.out.println(positions);

    }

    public static ArrayList<Integer> returnPositions(String[] array, String aranan) {


        ArrayList<Integer> positions = new ArrayList<>();

        /*
        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(aranan)) {
                positions.add(i + 1);
            }

        }
*/

     int   index=0;

        for (String each : array) {

            if (each.equals(aranan)){
                positions.add(index+1);
            }

            index++;
        }

        return positions;

    }
}
