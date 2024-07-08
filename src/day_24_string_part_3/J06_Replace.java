package day_24_string_part_3;

public class J06_Replace {


    public static void main(String[] args) {


        String str = "Apple Apple Apple";

        str = str.replace("Apple", "Cherry");
     //   str = str.replaceAll("Apple", "Cherry");


        System.out.println("str = " + str); //Cherry Cherry Cherry


       str= str.replaceFirst("Cherry","Apple");


        System.out.println("str = " + str); // A C C

      str=  str.replaceFirst("Cherry","Apple");

        System.out.println("str = " + str); // A A C


        //Java Java Kotlin C C++ python
    }
}
