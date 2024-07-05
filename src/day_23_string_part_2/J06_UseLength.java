package day_23_string_part_2;

public class J06_UseLength {

    public static void main(String[] args) {
        //kelimedeki karekter saysınca kelimeyi tekrarla

        String word="Merve";

        int length = word.length();

        for (int i = 1; i <=length ; i++) {
            System.out.println(word);
        }
    }
}
