package day_33_lang_classes;

public class J05_WrapperClassMethods {

    public static void main(String[] args) {

        char ch = 'A';

        System.out.println(Character.isLowerCase(ch));


        String str = "2432r5403ı%&//(ERA";
        //char[]

        String name = "ADAM";
        name.toCharArray(); //char[] letters={'A','D','A','M'}


        char[] array = str.toCharArray();

        for (char c : array) {

            if (Character.isDigit(c)) {
                System.out.println(c);
            }


        }


    }
}
