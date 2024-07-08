package day_24_string_part_3;

public class J01_IndexOf {

    public static void main(String[] args) {
                 // 0123456789  12
        String str="Java Programming";

        //bana Java daki ilk a'nın pozisyonun ver


        System.out.println("Index of first a = " + str.indexOf("a"));


        //Programming

        System.out.println(str.indexOf("Programming"));

        System.out.println(str.indexOf("ming"));

        //ikinci ayı bulmak

        System.out.println(str.indexOf("a Programming"));
        //012
        //Java Programming

        int indexOfFirstA=str.indexOf("a"); //ilk bulduğu anın indexi=1
        System.out.println("indexOfFirstA = " + indexOfFirstA);
        //ilk ayı pas geç ikinciyi bul

        int indexOfSecondA=str.indexOf("a",indexOfFirstA+1);
        System.out.println("indexOfSecondA = " + indexOfSecondA);

        //üçüncü a'yı bul

        int indexOfThirdA=str.indexOf("a",indexOfSecondA+1);
        System.out.println("indexOfThirdA = " + indexOfThirdA);

    }
}
