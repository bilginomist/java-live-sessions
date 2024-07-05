package day_23_string_part_2;

public class J04_Immutable {

    public static void main(String[] args) {

        String word="Sultan";



        System.out.println(word.toLowerCase());//sultan
        System.out.println(word.toUpperCase());//SULTAN

        System.out.println(word);//Sultan

        word=word.toLowerCase(); //sultan "Sultan" go to garbage
        System.out.println(word); //sultan


    }
}
