package day_24_string_part_3;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class J04_FirstWord {

    public static void main(String[] args) {

        String sentence="ipek, ata bak";

                        //bu benim methodum
      String firstWord=  getFirstWord(sentence);
        System.out.println("firstWord = " + firstWord);

    }

    public static String getFirstWord(String sentence) {

   String result= sentence.substring(0,sentence.indexOf(" "));


   return result;


    }


}
