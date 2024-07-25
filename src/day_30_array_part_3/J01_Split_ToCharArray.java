package day_30_array_part_3;

import java.util.Arrays;

public class J01_Split_ToCharArray {

    public static void main(String[] args) {

        String names = "Sami, Arif, Onur, Arslan";

        //Sami
        //Arif
        //Onur
        //Arslan

     String[] nameArray=   names.split(", ");


      //  System.out.println(Arrays.toString(nameArray));

        //System.out.println("nameArray[0] = " + nameArray[1]);


        for (String eachName : nameArray) {
            System.out.println(eachName.charAt(0));
        }


        String name="Bedia";


       char[] letters= name.toCharArray();

        System.out.println(Arrays.toString(letters));

        for (char letter : letters) {
            System.out.println(letter);
        }

        int number=1234; //

        String numberOfString=""+number; //1234

        for (char c : numberOfString.toCharArray()) {
            System.out.println(c);
        }







    }
}
