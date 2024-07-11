package day_26_string_examples;

public class J07_CountWord {

    public static void main(String[] args) {
      //                                           12
        String sentence = "In the world of coding, practice, Practice, and more practice is the path to mastery.";
        String word = "practice";

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
     /*
      int counter = 0;
        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            counter++;
        }

      */

        int counter = 0;
        for (int i = 0; i <= sentence.length() - word.length(); i++) {
            String aralik = sentence.substring(i, i + word.length());
            if (aralik.equals(word)) {
                System.out.println("buldum");
                counter++;
            }
        }

        System.out.println(counter);
    }

}
