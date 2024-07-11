package day_26_string_examples;

public class J02_ReverseWord {

    public static void main(String[] args) {

        //önce bir variable tanımla içine string değer koy

        String word="Adam";

        //oluşturulan method çağır ve ismi kelimeyi methodun içine koy

        String result=reverseWord2(word);

        System.out.println("result = " + result);

    }


    public  static String reverseWord(String word){

        String result="";

        for (int i = word.length()-1; i >=0 ; i--) {

            char letter=word.charAt(i);
            result=result+letter;
            result += letter;
        }

        return result;
    }


    public static String reverseWord2(String word){

        StringBuilder stringBuilder=new StringBuilder(word);

      return   stringBuilder.reverse().toString(); //madA


    }


}
