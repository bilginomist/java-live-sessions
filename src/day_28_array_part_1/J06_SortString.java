package day_28_array_part_1;

import java.util.Arrays;

public class J06_SortString {

    public static void main(String[] args) {

        String [] letters={"a","B","D","c"};

        System.out.println(Arrays.toString(letters));

        Arrays.sort(letters);                       // 66 68  97  99
        System.out.println(Arrays.toString(letters)); //B D   a  c


        for (int i = 0; i < letters.length; i++) {


            if (letters[i]!=letters[i].toLowerCase()){
                System.out.println(i);
                letters[i]=letters[i].toLowerCase();

            }



        }
        //98 100  97 99
        //b  d    a  c
        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));

        //a b c d

    }
}
