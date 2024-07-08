package day_24_string_part_3;

public class J05_LastWord {

    public static void main(String[] args) {

                            //  9
        String sentence="Ali ata bak";

        int lastSpace=sentence.lastIndexOf(" ");

        String lastWord = sentence.substring(lastSpace + 1);

        System.out.println("lastWord = " + lastWord);


    }
}
