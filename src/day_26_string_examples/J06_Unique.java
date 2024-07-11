package day_26_string_examples;

public class J06_Unique {

    public static void main(String[] args) {

        String sentence="Programmers are the wizards of the future.";
        String word="future1";

        uniqueWord(sentence,word);

        /*

        String str1="aba";

        System.out.println(str1.indexOf("a")); //0
        System.out.println(str1.lastIndexOf("a"));//2
         //          012
        String str2="abx";
        System.out.println(str2.indexOf("a")); //0
        System.out.println(str2.lastIndexOf("a"));//0

         */
    }

    public static void uniqueWord(String sentence, String word) {

        if (!sentence.contains(word)){
            System.out.println("Aradığınız kelime yok");
           return;
        }

        if (sentence.indexOf(word)==sentence.lastIndexOf(word)){
            System.out.println("it is unique");
        }else {
            System.out.println("it is dublicate");
        }
    }
}
