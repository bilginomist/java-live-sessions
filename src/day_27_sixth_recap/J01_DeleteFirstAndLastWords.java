package day_27_sixth_recap;

public class J01_DeleteFirstAndLastWords {

    public static void main(String[] args) {
        String sentence = "Ali ata bak.";

        String result = deleteFirstAndLastWords(sentence);

        System.out.println("result = " + result);


    }

    public static String deleteFirstAndLastWords(String sentence) {

        //Ali ata bak.

        int ilk = sentence.indexOf(" ");
        int son = sentence.lastIndexOf(" ");
        String result = sentence.substring(ilk, son).trim() + sentence.charAt(sentence.length() - 1);

        return result;


    }
}
