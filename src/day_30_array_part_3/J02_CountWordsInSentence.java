package day_30_array_part_3;

import java.util.Arrays;

public class J02_CountWordsInSentence {


    public static void main(String[] args) {

        String sentence="Ali ata bak";
         //bir dizi
        System.out.println(sentence.split(" ").length);


        System.out.println(sentence.toCharArray().length);


        String name="Arif";
        char chA='A';
        String strA="A";

       char[] charArray= name.toCharArray();

       String[] strArray=name.split("");

        System.out.println("Arrays.toString(charArray) = " + Arrays.toString(charArray));
        System.out.println("Arrays.toString(strArray) = " + Arrays.toString(strArray));


    }
}
