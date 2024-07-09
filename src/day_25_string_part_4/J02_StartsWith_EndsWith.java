package day_25_string_part_4;

public class J02_StartsWith_EndsWith {

    public static void main(String[] args) {
        String word="Ah met";


      boolean result=  word.startsWith("Ahm");

        System.out.println("result = " + result);


        String sentence="Hello world.";

        boolean isQuestion=sentence.endsWith("?");

        System.out.println(isQuestion);


        String email="xxx@hotmail.com";

        boolean isValidEmail=email.endsWith("gmail.com");

        System.out.println("email = " + isValidEmail);


    }
}
