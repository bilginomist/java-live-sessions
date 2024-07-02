package day_22_string_part_1;

public class J01_StringIntro {

    public static void main(String[] args) {

        //literal way oluşturulan objeler Heap te özel bir alan olan
        //String pool da tutulur

        String word1="Emir";
        String word2="Emir";

        System.out.println(word1==word2);



        //new keyword


        String word3=new String("Emir");
        String word4=new String("Emir");

        System.out.println(word3==word4);


    }
}
