package day_26_string_examples;

public class J03_SesliHarfler {

    public static void main(String[] args) {

        String word="Adam";

        int count=countVowels(word);

        System.out.println("count = " + count);


    }

    public static int countVowels(String word) {

        int counter=0;

        for (int i = 0; i < word.length(); i++) {

           char each= word.charAt(i);

           if (isVowel(each)){

               counter++;
           }

        }

        return counter;


    }

    public static boolean isVowel(char each){

       return each=='a' ||
              each=='e' ||
              each=='o' ||
              each=='i' ||
              each=='u' ||
              each=='A' ||
              each=='E' ||
              each=='U' ||
              each=='I' ||
              each=='O' ;

    }


}
