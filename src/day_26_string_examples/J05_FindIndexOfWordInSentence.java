package day_26_string_examples;

public class J05_FindIndexOfWordInSentence {

    public static void main(String[] args) {

        String str1="First, solve the problem. Then, write the code.";

        String str2="solved";

        findIndexOfWordInSentence(str1,str2);

       findIndexOfWordInSentence("ahmet ata bak","ahmet");

    }


    public static void findIndexOfWordInSentence(String sentence, String word) {

       // if (sentence.indexOf(word)>=0){
        if (sentence.contains(word)){
            System.out.println(sentence.indexOf(word));
        }else {
            System.out.println("Not found");
        }

    }
}
