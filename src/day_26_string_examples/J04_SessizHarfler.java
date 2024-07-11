package day_26_string_examples;

public class J04_SessizHarfler {

    public static void main(String[] args) {

        String word="Bilginomist";


        int numberOfConsonantLetters=countConsonnatLetters(word);


        System.out.println(numberOfConsonantLetters);


    }

    private static int countConsonnatLetters(String word) {

        //    kelimenin uzunluğu -       sesli harflerin sayısı
   return   word.length()        -       J03_SesliHarfler.countVowels(word);

    }
}
